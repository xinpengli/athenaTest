package com.geekplus.test.athena.dao;

import com.geekplus.test.athena.entity.BaseMapcell;
import com.geekplus.test.athena.entity.BaseMapcellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BaseMapcellMapper {
    long countByExample(BaseMapcellExample example);

    int deleteByExample(BaseMapcellExample example);

    int insert(BaseMapcell record);

    int insertSelective(BaseMapcell record);

    List<BaseMapcell> selectByExampleWithRowbounds(BaseMapcellExample example, RowBounds rowBounds);

    List<BaseMapcell> selectByExample(BaseMapcellExample example);

    int updateByExampleSelective(@Param("record") BaseMapcell record, @Param("example") BaseMapcellExample example);

    int updateByExample(@Param("record") BaseMapcell record, @Param("example") BaseMapcellExample example);
}