package com.geekplus.test.athena.entity;

import org.springframework.stereotype.Component;

@Component
public class BaseShelf {
    private String shelfCode;

    private String classCode;

    private Byte shelfType;

    private Byte status;

    private Integer locationX;

    private Integer locationY;

    private Integer placementX;

    private Integer placementY;

    private Float angle;

    private Integer robotid;

    private Integer temperature;

    private Integer logicId;

    private Integer warehouseId;

    public String getShelfCode() {
        return shelfCode;
    }

    public void setShelfCode(String shelfCode) {
        this.shelfCode = shelfCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public Byte getShelfType() {
        return shelfType;
    }

    public void setShelfType(Byte shelfType) {
        this.shelfType = shelfType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getLocationX() {
        return locationX;
    }

    public void setLocationX(Integer locationX) {
        this.locationX = locationX;
    }

    public Integer getLocationY() {
        return locationY;
    }

    public void setLocationY(Integer locationY) {
        this.locationY = locationY;
    }

    public Integer getPlacementX() {
        return placementX;
    }

    public void setPlacementX(Integer placementX) {
        this.placementX = placementX;
    }

    public Integer getPlacementY() {
        return placementY;
    }

    public void setPlacementY(Integer placementY) {
        this.placementY = placementY;
    }

    public Float getAngle() {
        return angle;
    }

    public void setAngle(Float angle) {
        this.angle = angle;
    }

    public Integer getRobotid() {
        return robotid;
    }

    public void setRobotid(Integer robotid) {
        this.robotid = robotid;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getLogicId() {
        return logicId;
    }

    public void setLogicId(Integer logicId) {
        this.logicId = logicId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }
}