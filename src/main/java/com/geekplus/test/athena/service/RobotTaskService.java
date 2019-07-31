package com.geekplus.test.athena.service;

import com.geekplus.athena.facade.robot.TaskSourceType;
import com.geekplus.test.athena.entity.RobotTask;


public interface RobotTaskService {
    public long getLastTaskId(TaskSourceType taskSourceType);
    public RobotTask getRobotTask(long robotTaskId);
}
