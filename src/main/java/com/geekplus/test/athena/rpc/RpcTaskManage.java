package com.geekplus.test.athena.rpc;

import com.geekplus.athena.api.APIResponse;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskResponseBody;
import com.geekplus.athena.common.entity.api.msg.RequestHeader;
import com.geekplus.common.util.JSONUtil;
import com.geekplus.test.athena.entity.RobotTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.geekplus.athena.api.facade.RobotTaskFacade;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskRequestBody;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * rpc任务管理类
 * @author wanghao
 */
@Component
public class RpcTaskManage {
    private static final Logger logger = LoggerFactory.getLogger(RpcTaskManage.class);
    public static Map<Long,RobotTaskRequestBody> robotTasks=  new ConcurrentHashMap();
    private static AtomicLong nextRpcTaskId;
	@Autowired
    private RobotTaskFacade robotTaskFacade;

    public APIResponse<RobotTaskResponseBody> assignTask(RequestHeader header, RobotTaskRequestBody body){
        logger.info("assign task:{}", JSONUtil.objToJson(body));
        APIResponse<RobotTaskResponseBody> response= robotTaskFacade.assign(header,body);

        if(response.getCode()==0){
            body.setTaskId(response.getData().getTaskId());
            robotTasks.put(response.getData().getTaskId(),body);
            logger.info("assign result:{}", response.toString());
        }else
            logger.error("assign result:{}", response.toString());
        return response;
    }

    public APIResponse<RobotTaskResponseBody> confirmTask(RequestHeader header, RobotTaskRequestBody body){
        logger.info("confirm task:{}", JSONUtil.objToJson(body));
        APIResponse<RobotTaskResponseBody> response= robotTaskFacade.confirm(header,body);
        logger.info("confirm result:{}", response);
        return response;
    }

    @Async
	public void assignTask(RequestHeader header, RobotTaskRequestBody body,long waitTime){
        logger.info("assign task:{}", JSONUtil.objToJson(body));
        robotTasks.put(body.getTaskId(), body);
        try {
            Thread.sleep(waitTime);
            APIResponse<RobotTaskResponseBody> response= robotTaskFacade.assign(header,body);
            logger.info("assign result:{}", response);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

}
    @Async
    public void confirmTask(RequestHeader header, RobotTaskRequestBody body,long waitTime){
        logger.info("confirm task:{}", JSONUtil.objToJson(body));
            try {
                Thread.sleep(waitTime);
                APIResponse<RobotTaskResponseBody> response= robotTaskFacade.confirm(header,body);
                logger.info("confirm result:{}", response);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public static AtomicLong  getNextRpcTaskId() {
        return nextRpcTaskId;
    }

    public static void setNextRpcTaskId(AtomicLong  nextRpcTaskId) {
        RpcTaskManage.nextRpcTaskId = nextRpcTaskId;
    }

}
