package com.geekplus.test.athena.dao;

import com.geekplus.test.athena.entity.BaseShelf;
import com.geekplus.test.athena.entity.BaseShelfExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

@Mapper
public interface BaseShelfMapper {
    long countByExample(BaseShelfExample example);

    int deleteByExample(BaseShelfExample example);

    int insert(BaseShelf record);

    int insertSelective(BaseShelf record);

    List<BaseShelf> selectByExampleWithRowbounds(BaseShelfExample example, RowBounds rowBounds);

    List<BaseShelf> selectByExample(BaseShelfExample example);

    int updateByExampleSelective(@Param("record") BaseShelf record, @Param("example") BaseShelfExample example);

    int updateByExample(@Param("record") BaseShelf record, @Param("example") BaseShelfExample example);
}