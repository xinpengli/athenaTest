package com.geekplus.test.athena.rpc.facade.impl;

import java.awt.geom.Point2D.Double;

import com.geekplus.athena.api.facade.entity.RobotTaskCallbackEntity;
import com.geekplus.athena.api.facade.entity.RobotTaskRequestEntity;
import com.geekplus.athena.api.facade.entity.RobotTaskResponseEntity;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskCallbackBody;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskRequestBody;
import com.geekplus.athena.common.entity.api.msg.CallbackHeader;
import com.geekplus.athena.common.entity.api.msg.RequestHeader;
import com.geekplus.test.athena.common.RobotTaskComponent;
import com.geekplus.test.athena.rpc.RpcTaskManage;
import com.geekplus.test.athena.service.RobotTaskService;
import com.google.common.collect.Sets;

import cn.hutool.core.lang.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.geekplus.athena.api.facade.RobotTaskCallbackFacade;
import com.geekplus.athena.api.facade.RobotTaskFacade;
import com.geekplus.athena.facade.robot.RobotTask;
import com.geekplus.athena.facade.robot.TaskPhase;
import com.geekplus.common.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class RobotTaskCallbackFacadeImpl implements RobotTaskCallbackFacade<RobotTaskCallbackBody> {
    private static final Logger logger = LoggerFactory.getLogger(RobotTaskCallbackFacadeImpl.class);
    @Autowired
    private RpcTaskManage rpcTaskManage;
    @Autowired
    private RobotTaskService robotTaskService;
    @Autowired
    private RobotTaskComponent robotTaskComponent;
    @Autowired
    private Environment  env;

    public void callback(CallbackHeader header,RobotTaskCallbackBody callbackTask) {
        logger.info("收到反馈");
        logger.info("callback:{}", JSONUtil.objToJson(header));
        logger.info("callback:{}", JSONUtil.objToJson(callbackTask));
        
        RequestHeader Reqheader = RequestHeader.builder()
 				.requestId(UUID.randomUUID().toString())
 				.clientCode("zara")
 				.userId("111")
 				.userKey("22")
 				.version("3.1.0")
 				.channelId("channel1")
 				.warehouseCode("Robot-1")
 				.build();
        RobotTaskRequestBody robotTask = RpcTaskManage.robotTasks.get(callbackTask.getTaskId());
        if (RobotTask.TASK_STATE.EXECUTING.toString().equals(callbackTask.getTaskStatus())) {
            if (RobotTask.TASK_TYPE.DELIVER_SHELF_TO_STATION.toString().equals(callbackTask.getTaskType())) {
                robotTask=robotTaskComponent.updateRequestBody(robotTask,callbackTask);
                if (callbackTask.getTaskPhase().equals("SHELF_ARRIVED")) {
                    if (robotTask!=null&&robotTask.getNeededSides()!=null&&robotTask.getNeededSides().size() > 1) {/*
                        String showSide = callbackTask.getShelfSide();
                        if ("B".equals(showSide)) {
                            robotTask.setNeededSides(Sets.newHashSet("F"));
                        } else {
                            robotTask.setNeededSides(Sets.newHashSet("B"));
                        }
                        robotTask.setInstruction("GO_TURN");
                        rpcTaskManage.confirmTask(Reqheader,robotTask, 500);
                        RpcTaskManage.robotTasks.put(robotTask.getTaskId(),robotTask);*/
                    } else {
                        robotTask.setInstruction("GO_RETURN");
                        rpcTaskManage.confirmTask(Reqheader,robotTask, 500);
                        RpcTaskManage.robotTasks.remove(robotTask.getTaskId());
                    }


                }
            }else if (callbackTask.getTaskPhase().equals("ARRIVED_WAIT_POINT")) {
                robotTask=new RobotTaskRequestBody();
                robotTask.setTaskId(callbackTask.getTaskId());
                robotTask.setWaitCellCode(callbackTask.getWaitCellCode());
                robotTask.setInstruction("CLEAR_WAITPOINT");
                rpcTaskManage.confirmTask(Reqheader, robotTask);
            }else if (callbackTask.getTaskPhase().equals("ARRIVED_ELEVATOR_ENTRY")) {
                robotTask=new RobotTaskRequestBody();
                robotTask.setTaskId(callbackTask.getTaskId());
                robotTask.setInstruction("ALLOW_ENTER_ELEVATOR");

                rpcTaskManage.confirmTask(Reqheader, robotTask);
            }else if (callbackTask.getTaskPhase().equals("ENTERED_ELEVATOR")) {
                robotTask=new RobotTaskRequestBody();
                robotTask.setTaskId(callbackTask.getTaskId());

                robotTask.setInstruction("ALLOW_LEAVE_ELEVATOR");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                rpcTaskManage.confirmTask(Reqheader, robotTask);
            }

            else if(RobotTask.TASK_TYPE.DELIVER_SHELF.toString().equals(callbackTask.getTaskType())){
                if (callbackTask.getTaskPhase().equals("SHELF_ARRIVED")) {
                    robotTask = new RobotTaskRequestBody();
                    robotTask.setTaskType(callbackTask.getTaskType());
                 //   robotTask.setStationId(callbackTask.getStationId());
                    robotTask.setTaskId(callbackTask.getTaskId());
                    robotTask.setInstruction("GO_RETURN");

                    rpcTaskManage.confirmTask(Reqheader,robotTask);
                }

            }
            
        } else if (RobotTask.TASK_STATE.COMPLETED.toString().equals(callbackTask.getTaskStatus())) {
        	if (RobotTask.TASK_TYPE.DELIVER_SHELF.toString().equals(callbackTask.getTaskType())&&!env.getProperty("map.resolver").equals("NOShelfArea") ) {
                if (TaskPhase.SHELF_ARRIVED.toString().equals(callbackTask.getTaskPhase())) {
                	robotTask=new RobotTaskRequestBody();
                    robotTask.setTaskType("FETCH_SHELF_FROM_STATION");
                    robotTask.setShelfCode(callbackTask.getShelfCode());
                    robotTask.setStationId(callbackTask.getStationId());              
                    robotTask.setPriority(7);
                    rpcTaskManage.assignTask(Reqheader,robotTask, 500);
                }

            }
           
        }
        
        
    }

}