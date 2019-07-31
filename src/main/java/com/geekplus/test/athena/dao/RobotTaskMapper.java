package com.geekplus.test.athena.dao;

import com.geekplus.test.athena.entity.RobotTask;
import com.geekplus.test.athena.entity.RobotTaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

@Component
public interface RobotTaskMapper {
    long countByExample(RobotTaskExample example);

    int deleteByExample(RobotTaskExample example);

    int insert(RobotTask record);

    int insertSelective(RobotTask record);

    List<RobotTask> selectByExampleWithRowbounds(RobotTaskExample example, RowBounds rowBounds);

    List<RobotTask> selectByExample(RobotTaskExample example);

    int updateByExampleSelective(@Param("record") RobotTask record, @Param("example") RobotTaskExample example);

    int updateByExample(@Param("record") RobotTask record, @Param("example") RobotTaskExample example);
}