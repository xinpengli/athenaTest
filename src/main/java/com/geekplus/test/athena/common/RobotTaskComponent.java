package com.geekplus.test.athena.common;

import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskCallbackBody;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskRequestBody;
import com.geekplus.test.athena.entity.RobotTask;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
public class RobotTaskComponent {
    public RobotTaskRequestBody updateRequestBody(RobotTaskRequestBody robotTask,RobotTaskCallbackBody callbackBody){
        if (robotTask==null) {
            robotTask = new RobotTaskRequestBody();
        }
        robotTask.setTaskId(callbackBody.getTaskId());
        robotTask.setStationId(callbackBody.getStationId());
        robotTask.setTaskType(callbackBody.getTaskType());
        robotTask.setShelfCode(callbackBody.getShelfCode());
        robotTask.setRobotId(callbackBody.getRobotId());
        robotTask.setHostShelfCode(callbackBody.getHostShelfCode());
        robotTask.setHostStationCode(callbackBody.getHostStationCode());
        robotTask.setChargerId(callbackBody.getChargerId());
        robotTask.setDest(callbackBody.getDest());
        robotTask.setDestHostCode(callbackBody.getDestHostCode());
        robotTask.setWaitCellCode(callbackBody.getWaitCellCode());
        robotTask.setDestAreaId(callbackBody.getDestAreaId());
        robotTask.setElevatorId(callbackBody.getElevatorId());
        return robotTask;
    }

}
