package com.geekplus.test.athena.entity;

public class BaseMapcell {
    private Integer id;

    private String cellCode;

    private String cellType;

    private Integer indexX;

    private Integer indexY;

    private Double locationX;

    private Double locationY;

    private Float width;

    private Float length;

    private Integer mapId;

    private String sizeType;

    private Double startBoundX;

    private Double startBoundY;

    private String unloadDirs;

    private String loadDirs;

    private String descr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCellCode() {
        return cellCode;
    }

    public void setCellCode(String cellCode) {
        this.cellCode = cellCode;
    }

    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    public Integer getIndexX() {
        return indexX;
    }

    public void setIndexX(Integer indexX) {
        this.indexX = indexX;
    }

    public Integer getIndexY() {
        return indexY;
    }

    public void setIndexY(Integer indexY) {
        this.indexY = indexY;
    }

    public Double getLocationX() {
        return locationX;
    }

    public void setLocationX(Double locationX) {
        this.locationX = locationX;
    }

    public Double getLocationY() {
        return locationY;
    }

    public void setLocationY(Double locationY) {
        this.locationY = locationY;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public Double getStartBoundX() {
        return startBoundX;
    }

    public void setStartBoundX(Double startBoundX) {
        this.startBoundX = startBoundX;
    }

    public Double getStartBoundY() {
        return startBoundY;
    }

    public void setStartBoundY(Double startBoundY) {
        this.startBoundY = startBoundY;
    }

    public String getUnloadDirs() {
        return unloadDirs;
    }

    public void setUnloadDirs(String unloadDirs) {
        this.unloadDirs = unloadDirs;
    }

    public String getLoadDirs() {
        return loadDirs;
    }

    public void setLoadDirs(String loadDirs) {
        this.loadDirs = loadDirs;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}