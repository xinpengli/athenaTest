package com.geekplus.test.athena.service.impl;

import com.geekplus.test.athena.entity.RobotTask;
import com.geekplus.athena.facade.robot.TaskSourceType;
import com.geekplus.test.athena.dao.RobotTaskMapper;
import com.geekplus.test.athena.entity.RobotTaskExample;
import com.geekplus.test.athena.service.RobotTaskService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotTaskServiceImpl implements RobotTaskService {

    @Autowired
    private RobotTaskMapper robotTaskMapper;
    @Override
    public long getLastTaskId(TaskSourceType taskSourceType) {
        RobotTaskExample example = new RobotTaskExample();
        example.or().andTaskSourceTypeEqualTo(taskSourceType.name());
        example.setOrderByClause("task_id");
        Long rowCount= robotTaskMapper.countByExample(example);
        int offset=rowCount.intValue()-1;
        RowBounds rowBounds= new RowBounds(offset,1);
        List<RobotTask> robotTaskList=robotTaskMapper.selectByExampleWithRowbounds(example,rowBounds);
        if(robotTaskList.size()>0){
            return robotTaskList.get(0).getTaskId();
        }
        return 0;
    }

    @Override
    public RobotTask getRobotTask(long robotTaskId) {
        RobotTaskExample example = new RobotTaskExample();
        example.or().andTaskIdEqualTo(robotTaskId);
        example.setOrderByClause("task_id");
        List<RobotTask> robotTaskList=robotTaskMapper.selectByExample(example);
        if(robotTaskList.size()>0){
            return robotTaskList.get(0);
        }else
            return null;
    }
}
