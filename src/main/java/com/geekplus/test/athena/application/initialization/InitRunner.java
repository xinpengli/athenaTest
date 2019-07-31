package com.geekplus.test.athena.application.initialization;

import com.geekplus.test.athena.common.Dom4jUtil1;
import com.geekplus.test.athena.entity.BaseMapcell;
import com.geekplus.test.athena.service.BaseInfoService;
import com.geekplus.test.athena.service.MapCellService;
import com.geekplus.test.athena.service.RobotTaskService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.Point;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import com.geekplus.test.athena.entity.BaseShelf;
import org.springframework.core.env.Environment;

/**
 * 启动时，初始化数据
 */
@Component
public class InitRunner implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(InitRunner.class);
	@Autowired
	private RobotTaskService robotTaskService;
	@Autowired
	private BaseInfoService baseInfoService;
	@Autowired
	private BaseShelf baseShelf;
	@Autowired
	private Environment env;
	@Autowired
	MapCellService mapCellService;

	@Override
	public void run(String... args) throws Exception {
		// 获取生成货架模式
		String mode = env.getProperty("map.resolver");
		Map<Integer, Object> mapShelf = Dom4jUtil1.getShelfCell();
		

		
		// 格式化
		DecimalFormat df = new DecimalFormat("A000000");
		logger.info("The Runner start to initialize ...");
		/*
		 * robotTaskService.getLastTaskId(TaskSourceType.RPC);
		 * RpcTaskManage.setNextRpcTaskId(new
		 * AtomicLong(robotTaskService.getLastTaskId(TaskSourceType.RPC) + 1L));
		 */

		int counter = 1;

		if (mode.equals("Xml")) {
			baseInfoService.deleteAllShelf();
			
			for (Integer key : mapShelf.keySet()) {
				int[][] mapcell = (int[][]) mapShelf.get(key);

				// 控制行y

				for (int i = 0; i < mapcell.length; i++) {
					// 控制列x
					for (int j = 0; j < mapcell[i].length; j++) {
						if (mapcell[i][j] == 1) {
							String shelfCode = df.format(counter);
							// baseShelf = new ShelfEntity();
							baseInfoService.setShelfProperty(shelfCode, j , i );
							baseInfoService.insert(baseShelf);
							counter++;
							logger.info("init shelf:" + shelfCode);

						}

					}

				}

			}
		} else if (mode.equals("NOShelfArea")) {
			try {
				List<Point> pointlist = Dom4jUtil1.getStationsLocation();
				
				int x = (int) pointlist.get(0).getX();
				int y = (int) pointlist.get(0).getY();
				baseInfoService.deleteAllShelf();
				baseInfoService.setShelfProperty("A0000001", x, y);
				baseInfoService.insert(baseShelf);
				logger.info("init NOShelfArea mode  shelf: A0000001");
				
			} catch (Exception e) {
				  
				logger.error("解析地图时找不到单点工位:", e);
				 
				
			}
			
			

		} else if (mode.equals("Database")) {

			baseInfoService.deleteAllShelf();
		List<BaseMapcell> celllist = mapCellService.getShelfCellFromDatabase();
            for (BaseMapcell baseMapcell:celllist) {
                String shelfCode = df.format(counter);
				      baseInfoService.setShelfProperty(shelfCode,baseMapcell.getIndexX(),baseMapcell.getIndexY());
				      baseInfoService.insert(baseShelf);
                      logger.info("init shelf:" + shelfCode);
                counter++;
			}

//			logger.info("init NOShelfArea mode  shelf: A0000001");
		}
/*初始化地图工位资源*/


	}
}