package com.geekplus.test.athena.service.impl;

import com.geekplus.test.athena.dao.BaseMapcellMapper;
import com.geekplus.test.athena.entity.BaseMapcell;
import com.geekplus.test.athena.entity.BaseMapcellExample;
import com.geekplus.test.athena.service.MapCellService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MapCellServiceImpl implements MapCellService {
    @Autowired
     private  BaseMapcellMapper baseMapcellMapper;
    @Override
    public List<BaseMapcell> getShelfCellFromDatabase() {
        BaseMapcellExample example= new BaseMapcellExample();
        example.or().andCellTypeEqualTo("SHELF_CELL");

        List<BaseMapcell>  shelfCells=baseMapcellMapper.selectByExample(example);


        return shelfCells;
    }
}
