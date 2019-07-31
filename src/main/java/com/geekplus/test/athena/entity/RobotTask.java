package com.geekplus.test.athena.entity;

public class RobotTask {
    private Long id;

    private Long taskId;

    private String taskSourceType;

    private String taskType;

    private String taskStatus;

    private Integer chargerId;

    private Boolean isCancel;

    private Integer priority;

    private Integer robotId;

    private Integer workstationId;

    private String shelfCode;

    private String shelfStatus;

    private String needShelfSides;

    private Float shelfInitAngle;

    private Double startPointY;

    private Double startPointX;

    private Double endPointX;

    private Double endPointY;

    private String multiEndPoints;

    private Long receiveTime;

    private Long createTime;

    private Long updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskSourceType() {
        return taskSourceType;
    }

    public void setTaskSourceType(String taskSourceType) {
        this.taskSourceType = taskSourceType;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getChargerId() {
        return chargerId;
    }

    public void setChargerId(Integer chargerId) {
        this.chargerId = chargerId;
    }

    public Boolean getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(Boolean isCancel) {
        this.isCancel = isCancel;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getRobotId() {
        return robotId;
    }

    public void setRobotId(Integer robotId) {
        this.robotId = robotId;
    }

    public Integer getWorkstationId() {
        return workstationId;
    }

    public void setWorkstationId(Integer workstationId) {
        this.workstationId = workstationId;
    }

    public String getShelfCode() {
        return shelfCode;
    }

    public void setShelfCode(String shelfCode) {
        this.shelfCode = shelfCode;
    }

    public String getShelfStatus() {
        return shelfStatus;
    }

    public void setShelfStatus(String shelfStatus) {
        this.shelfStatus = shelfStatus;
    }

    public String getNeedShelfSides() {
        return needShelfSides;
    }

    public void setNeedShelfSides(String needShelfSides) {
        this.needShelfSides = needShelfSides;
    }

    public Float getShelfInitAngle() {
        return shelfInitAngle;
    }

    public void setShelfInitAngle(Float shelfInitAngle) {
        this.shelfInitAngle = shelfInitAngle;
    }

    public Double getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(Double startPointY) {
        this.startPointY = startPointY;
    }

    public Double getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(Double startPointX) {
        this.startPointX = startPointX;
    }

    public Double getEndPointX() {
        return endPointX;
    }

    public void setEndPointX(Double endPointX) {
        this.endPointX = endPointX;
    }

    public Double getEndPointY() {
        return endPointY;
    }

    public void setEndPointY(Double endPointY) {
        this.endPointY = endPointY;
    }

    public String getMultiEndPoints() {
        return multiEndPoints;
    }

    public void setMultiEndPoints(String multiEndPoints) {
        this.multiEndPoints = multiEndPoints;
    }

    public Long getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}