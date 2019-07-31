package com.geekplus.test.athena.service;

import com.geekplus.test.athena.entity.BaseMapcell;
import com.geekplus.test.athena.entity.BaseMapcellExample;

import java.util.List;

public interface MapCellService {
    List<BaseMapcell>getShelfCellFromDatabase();
}
