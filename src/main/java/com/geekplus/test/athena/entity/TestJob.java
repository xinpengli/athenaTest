package com.geekplus.test.athena.entity;

import java.util.List;

public class TestJob {
    public List<Integer> getStations() {
        return stations;
    }

    public void setStations(List<Integer> stations) {
        this.stations = stations;
    }

    public int getShelfNum() {
        return shelfNum;
    }

    public void setShelfNum(int shelfNum) {
        this.shelfNum = shelfNum;
    }

    List<Integer> stations;
    int shelfNum=0;
}
