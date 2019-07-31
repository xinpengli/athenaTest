package com.geekplus.test.athena.service;

import java.util.List;

import com.geekplus.test.athena.entity.BaseShelf;

public interface BaseInfoService {
    public List<String> getShelfCodeList(int shelfNum);
    public  int insert(BaseShelf record);
    public int deleteAllShelf();
    
    public   void setShelfProperty(String shelfCode,int x,int y);

    public   List<BaseShelf> getShlefListCondtion(String shelfCode,int startPlacementIndexX ,int startPlacementIndexY ,int endPlacementIndexX ,int endPlacementIndexY);
}
