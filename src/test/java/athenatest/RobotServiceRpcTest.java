package athenatest;

import com.geekplus.athena.api.facade.RobotTaskFacade;
import com.geekplus.athena.api.facade.WarehouseFacade;
import com.geekplus.athena.facade.robot.RobotTask;
import com.geekplus.athena.facade.robot.TaskSourceType;
import com.geekplus.test.athena.config.MotanClient;

import com.geekplus.test.athena.rpc.RpcTaskManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.Sets;

@SuppressWarnings("unchecked")
//@ComponentScan(basePackages = { "com.geekplus" })
@SpringBootTest(classes =MotanClient.class)
public class RobotServiceRpcTest extends AbstractTestNGSpringContextTests{
	@Autowired
	private RpcTaskManage rpcTaskManage;
    @Autowired
    private WarehouseFacade warehouseFacade;
	@Autowired
	private RobotTaskFacade robotService;
	//RPCclient client = new RPCclient();
	@BeforeClass
	public void setUp(){
		//RPCserver.startServer();
	}
	@AfterClass
	public void tearDown(){

	}


/*

	@Test
	public void addDeliverShelfToStationTask_1(int taskId,String shelfCode,int stationId,int priority,String ...shelfSides) {
		RobotTask robotTask = new RobotTask(taskId, RobotTask.TASK_TYPE.DELIVER_SHELF_TO_STATION);
		robotTask.setShelfId(shelfCode);
		robotTask.setShelfInitAngle(90);
		robotTask.setWorkStationId(stationId);
		//robotTask.setSourceType(TaskSourceType.WMS);
        robotTask.setPriority(priority);
		robotTask.setNeededShelfSides(Sets.newHashSet(shelfSides));


		int Code = robotService.assign(robotTask);
		Assert.assertEquals(Code,0);
	}

    public int addMoveShelfToStationTask(long taskId,String shelfCode,int stationId,int priority){

        RobotTask deliverTask = new RobotTask(taskId, RobotTask.TASK_TYPE.MOVE_SHELF_TO_STATION);
        deliverTask.setShelfId(shelfCode);
        deliverTask.setShelfInitAngle(90);
        deliverTask.setWorkStationId(stationId);
        //deliverTask.setSourceType(sourceType);
        deliverTask.setPriority(priority);
        int Code =  robotService.assign(deliverTask);
        return Code;


    }


    public int addFetchFromShelfFromStationTask(long taskId,String shelfCode,int stationId,int priority){

        RobotTask deliverTask = new RobotTask(taskId, RobotTask.TASK_TYPE.FETCH_SHELF_FROM_STATION);
        deliverTask.setShelfId(shelfCode);
        //deliverTask.setShelfInitAngle(90);
        deliverTask.setWorkStationId(stationId);
        //deliverTask.setSourceType(sourceType);
        deliverTask.setPriority(priority);
        int Code =  robotService.assign(deliverTask);
        return Code;


    }

    public int addDELIVER_SHELF(TaskSourceType sourceType,long taskId,String shelfCode,int endAreaId,int priority){

        RobotTask deliverTask = new RobotTask(taskId, RobotTask.TASK_TYPE.DELIVER_SHELF);
        deliverTask.setShelfId(shelfCode);
        deliverTask.setShelfInitAngle(90);
        deliverTask.setWorkStationId( endAreaId);
        deliverTask.setSourceType(sourceType);
        deliverTask.setPriority(priority);
        int Code =  robotService.assign(deliverTask);
        return Code;


    }

	@Test
	public void test() {
		String shelfCode="A000001";
		//String shelfCode="A000105";
		int taskId=2;
		int stationId = 1;
		int priority=1;
		int endAreaId=22;
		String[] shelfSides= {"B"};
		int shelfCore = 60;
       // addMoveShelfToStationTask(taskId,shelfCode,stationId,priority);
        //addFetchFromShelfFromStationTask(taskId,shelfCode,stationId,priority);
		addDeliverShelfToStationTask_1(taskId,shelfCode,stationId,priority,shelfSides);
	}
	@Test
	public void massTest() {
		String shelfCode="A000001";
		//String shelfCode="A000105";
		int taskId=1;
		int stationId = 1000;
		int priority=1;
		int endAreaId=22;
		String[] shelfSides= {"B","F"};
		int shelfCore = 60;
		for(int shelfNum=1;shelfNum<=10;shelfNum++){
			if(shelfNum<10) {
				shelfCode = "A00000" + shelfNum;
			}else if(shelfNum<100) {
				shelfCode = "A0000" + shelfNum;
			}else if(shelfNum<1000){
				shelfCode = "P000" + shelfNum;
			}else if(shelfNum<10000){
				shelfCode = "P00" + shelfNum;

			}
			addDeliverShelfToStationTask_1(taskId,shelfCode,stationId,priority,shelfSides);
			taskId++;
			*/
/*if(stationId==1){
				stationId=1;
			}else{
				stationId++;
			}*//*

		}
		//robotTask.setShelfState(SHELF_STATE.GO_RETURN);
		//robotTask.setRobotId(1001);
		//addDeliverShelfTask_1(taskId,shelfCode,endAreaId,priority);
		//addDeliverShelfTask_2(taskId,shelfCode,endAreaId,priority);
	
	}

	@Test
    public void testRobotTask(){
       // System.out.println(robotTaskService.getLastTaskId(TaskSourceType.RPC));
    }
*/

}
