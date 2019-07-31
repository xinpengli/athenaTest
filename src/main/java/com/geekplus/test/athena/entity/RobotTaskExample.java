package com.geekplus.test.athena.entity;

import java.util.ArrayList;
import java.util.List;

public class RobotTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RobotTaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeIsNull() {
            addCriterion("task_source_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeIsNotNull() {
            addCriterion("task_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeEqualTo(String value) {
            addCriterion("task_source_type =", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeNotEqualTo(String value) {
            addCriterion("task_source_type <>", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeGreaterThan(String value) {
            addCriterion("task_source_type >", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_source_type >=", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeLessThan(String value) {
            addCriterion("task_source_type <", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("task_source_type <=", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeLike(String value) {
            addCriterion("task_source_type like", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeNotLike(String value) {
            addCriterion("task_source_type not like", value, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeIn(List<String> values) {
            addCriterion("task_source_type in", values, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeNotIn(List<String> values) {
            addCriterion("task_source_type not in", values, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeBetween(String value1, String value2) {
            addCriterion("task_source_type between", value1, value2, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskSourceTypeNotBetween(String value1, String value2) {
            addCriterion("task_source_type not between", value1, value2, "taskSourceType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(String value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(String value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(String value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(String value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(String value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLike(String value) {
            addCriterion("task_status like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotLike(String value) {
            addCriterion("task_status not like", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<String> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<String> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(String value1, String value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(String value1, String value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andChargerIdIsNull() {
            addCriterion("charger_id is null");
            return (Criteria) this;
        }

        public Criteria andChargerIdIsNotNull() {
            addCriterion("charger_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargerIdEqualTo(Integer value) {
            addCriterion("charger_id =", value, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdNotEqualTo(Integer value) {
            addCriterion("charger_id <>", value, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdGreaterThan(Integer value) {
            addCriterion("charger_id >", value, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charger_id >=", value, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdLessThan(Integer value) {
            addCriterion("charger_id <", value, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdLessThanOrEqualTo(Integer value) {
            addCriterion("charger_id <=", value, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdIn(List<Integer> values) {
            addCriterion("charger_id in", values, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdNotIn(List<Integer> values) {
            addCriterion("charger_id not in", values, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdBetween(Integer value1, Integer value2) {
            addCriterion("charger_id between", value1, value2, "chargerId");
            return (Criteria) this;
        }

        public Criteria andChargerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charger_id not between", value1, value2, "chargerId");
            return (Criteria) this;
        }

        public Criteria andIsCancelIsNull() {
            addCriterion("is_cancel is null");
            return (Criteria) this;
        }

        public Criteria andIsCancelIsNotNull() {
            addCriterion("is_cancel is not null");
            return (Criteria) this;
        }

        public Criteria andIsCancelEqualTo(Boolean value) {
            addCriterion("is_cancel =", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelNotEqualTo(Boolean value) {
            addCriterion("is_cancel <>", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelGreaterThan(Boolean value) {
            addCriterion("is_cancel >", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cancel >=", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelLessThan(Boolean value) {
            addCriterion("is_cancel <", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cancel <=", value, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelIn(List<Boolean> values) {
            addCriterion("is_cancel in", values, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelNotIn(List<Boolean> values) {
            addCriterion("is_cancel not in", values, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cancel between", value1, value2, "isCancel");
            return (Criteria) this;
        }

        public Criteria andIsCancelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cancel not between", value1, value2, "isCancel");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andRobotIdIsNull() {
            addCriterion("robot_id is null");
            return (Criteria) this;
        }

        public Criteria andRobotIdIsNotNull() {
            addCriterion("robot_id is not null");
            return (Criteria) this;
        }

        public Criteria andRobotIdEqualTo(Integer value) {
            addCriterion("robot_id =", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdNotEqualTo(Integer value) {
            addCriterion("robot_id <>", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdGreaterThan(Integer value) {
            addCriterion("robot_id >", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("robot_id >=", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdLessThan(Integer value) {
            addCriterion("robot_id <", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdLessThanOrEqualTo(Integer value) {
            addCriterion("robot_id <=", value, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdIn(List<Integer> values) {
            addCriterion("robot_id in", values, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdNotIn(List<Integer> values) {
            addCriterion("robot_id not in", values, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdBetween(Integer value1, Integer value2) {
            addCriterion("robot_id between", value1, value2, "robotId");
            return (Criteria) this;
        }

        public Criteria andRobotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("robot_id not between", value1, value2, "robotId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdIsNull() {
            addCriterion("workstation_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdIsNotNull() {
            addCriterion("workstation_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdEqualTo(Integer value) {
            addCriterion("workstation_id =", value, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdNotEqualTo(Integer value) {
            addCriterion("workstation_id <>", value, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdGreaterThan(Integer value) {
            addCriterion("workstation_id >", value, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("workstation_id >=", value, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdLessThan(Integer value) {
            addCriterion("workstation_id <", value, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdLessThanOrEqualTo(Integer value) {
            addCriterion("workstation_id <=", value, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdIn(List<Integer> values) {
            addCriterion("workstation_id in", values, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdNotIn(List<Integer> values) {
            addCriterion("workstation_id not in", values, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdBetween(Integer value1, Integer value2) {
            addCriterion("workstation_id between", value1, value2, "workstationId");
            return (Criteria) this;
        }

        public Criteria andWorkstationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("workstation_id not between", value1, value2, "workstationId");
            return (Criteria) this;
        }

        public Criteria andShelfCodeIsNull() {
            addCriterion("shelf_code is null");
            return (Criteria) this;
        }

        public Criteria andShelfCodeIsNotNull() {
            addCriterion("shelf_code is not null");
            return (Criteria) this;
        }

        public Criteria andShelfCodeEqualTo(String value) {
            addCriterion("shelf_code =", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotEqualTo(String value) {
            addCriterion("shelf_code <>", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeGreaterThan(String value) {
            addCriterion("shelf_code >", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_code >=", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeLessThan(String value) {
            addCriterion("shelf_code <", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeLessThanOrEqualTo(String value) {
            addCriterion("shelf_code <=", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeLike(String value) {
            addCriterion("shelf_code like", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotLike(String value) {
            addCriterion("shelf_code not like", value, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeIn(List<String> values) {
            addCriterion("shelf_code in", values, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotIn(List<String> values) {
            addCriterion("shelf_code not in", values, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeBetween(String value1, String value2) {
            addCriterion("shelf_code between", value1, value2, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfCodeNotBetween(String value1, String value2) {
            addCriterion("shelf_code not between", value1, value2, "shelfCode");
            return (Criteria) this;
        }

        public Criteria andShelfStatusIsNull() {
            addCriterion("shelf_status is null");
            return (Criteria) this;
        }

        public Criteria andShelfStatusIsNotNull() {
            addCriterion("shelf_status is not null");
            return (Criteria) this;
        }

        public Criteria andShelfStatusEqualTo(String value) {
            addCriterion("shelf_status =", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotEqualTo(String value) {
            addCriterion("shelf_status <>", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusGreaterThan(String value) {
            addCriterion("shelf_status >", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_status >=", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLessThan(String value) {
            addCriterion("shelf_status <", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLessThanOrEqualTo(String value) {
            addCriterion("shelf_status <=", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusLike(String value) {
            addCriterion("shelf_status like", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotLike(String value) {
            addCriterion("shelf_status not like", value, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusIn(List<String> values) {
            addCriterion("shelf_status in", values, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotIn(List<String> values) {
            addCriterion("shelf_status not in", values, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusBetween(String value1, String value2) {
            addCriterion("shelf_status between", value1, value2, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andShelfStatusNotBetween(String value1, String value2) {
            addCriterion("shelf_status not between", value1, value2, "shelfStatus");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesIsNull() {
            addCriterion("need_shelf_sides is null");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesIsNotNull() {
            addCriterion("need_shelf_sides is not null");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesEqualTo(String value) {
            addCriterion("need_shelf_sides =", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesNotEqualTo(String value) {
            addCriterion("need_shelf_sides <>", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesGreaterThan(String value) {
            addCriterion("need_shelf_sides >", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesGreaterThanOrEqualTo(String value) {
            addCriterion("need_shelf_sides >=", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesLessThan(String value) {
            addCriterion("need_shelf_sides <", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesLessThanOrEqualTo(String value) {
            addCriterion("need_shelf_sides <=", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesLike(String value) {
            addCriterion("need_shelf_sides like", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesNotLike(String value) {
            addCriterion("need_shelf_sides not like", value, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesIn(List<String> values) {
            addCriterion("need_shelf_sides in", values, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesNotIn(List<String> values) {
            addCriterion("need_shelf_sides not in", values, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesBetween(String value1, String value2) {
            addCriterion("need_shelf_sides between", value1, value2, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andNeedShelfSidesNotBetween(String value1, String value2) {
            addCriterion("need_shelf_sides not between", value1, value2, "needShelfSides");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleIsNull() {
            addCriterion("shelf_init_angle is null");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleIsNotNull() {
            addCriterion("shelf_init_angle is not null");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleEqualTo(Float value) {
            addCriterion("shelf_init_angle =", value, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleNotEqualTo(Float value) {
            addCriterion("shelf_init_angle <>", value, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleGreaterThan(Float value) {
            addCriterion("shelf_init_angle >", value, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleGreaterThanOrEqualTo(Float value) {
            addCriterion("shelf_init_angle >=", value, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleLessThan(Float value) {
            addCriterion("shelf_init_angle <", value, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleLessThanOrEqualTo(Float value) {
            addCriterion("shelf_init_angle <=", value, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleIn(List<Float> values) {
            addCriterion("shelf_init_angle in", values, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleNotIn(List<Float> values) {
            addCriterion("shelf_init_angle not in", values, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleBetween(Float value1, Float value2) {
            addCriterion("shelf_init_angle between", value1, value2, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andShelfInitAngleNotBetween(Float value1, Float value2) {
            addCriterion("shelf_init_angle not between", value1, value2, "shelfInitAngle");
            return (Criteria) this;
        }

        public Criteria andStartPointYIsNull() {
            addCriterion("start_point_y is null");
            return (Criteria) this;
        }

        public Criteria andStartPointYIsNotNull() {
            addCriterion("start_point_y is not null");
            return (Criteria) this;
        }

        public Criteria andStartPointYEqualTo(Double value) {
            addCriterion("start_point_y =", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYNotEqualTo(Double value) {
            addCriterion("start_point_y <>", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYGreaterThan(Double value) {
            addCriterion("start_point_y >", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYGreaterThanOrEqualTo(Double value) {
            addCriterion("start_point_y >=", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYLessThan(Double value) {
            addCriterion("start_point_y <", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYLessThanOrEqualTo(Double value) {
            addCriterion("start_point_y <=", value, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYIn(List<Double> values) {
            addCriterion("start_point_y in", values, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYNotIn(List<Double> values) {
            addCriterion("start_point_y not in", values, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYBetween(Double value1, Double value2) {
            addCriterion("start_point_y between", value1, value2, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointYNotBetween(Double value1, Double value2) {
            addCriterion("start_point_y not between", value1, value2, "startPointY");
            return (Criteria) this;
        }

        public Criteria andStartPointXIsNull() {
            addCriterion("start_point_x is null");
            return (Criteria) this;
        }

        public Criteria andStartPointXIsNotNull() {
            addCriterion("start_point_x is not null");
            return (Criteria) this;
        }

        public Criteria andStartPointXEqualTo(Double value) {
            addCriterion("start_point_x =", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXNotEqualTo(Double value) {
            addCriterion("start_point_x <>", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXGreaterThan(Double value) {
            addCriterion("start_point_x >", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXGreaterThanOrEqualTo(Double value) {
            addCriterion("start_point_x >=", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXLessThan(Double value) {
            addCriterion("start_point_x <", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXLessThanOrEqualTo(Double value) {
            addCriterion("start_point_x <=", value, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXIn(List<Double> values) {
            addCriterion("start_point_x in", values, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXNotIn(List<Double> values) {
            addCriterion("start_point_x not in", values, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXBetween(Double value1, Double value2) {
            addCriterion("start_point_x between", value1, value2, "startPointX");
            return (Criteria) this;
        }

        public Criteria andStartPointXNotBetween(Double value1, Double value2) {
            addCriterion("start_point_x not between", value1, value2, "startPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXIsNull() {
            addCriterion("end_point_x is null");
            return (Criteria) this;
        }

        public Criteria andEndPointXIsNotNull() {
            addCriterion("end_point_x is not null");
            return (Criteria) this;
        }

        public Criteria andEndPointXEqualTo(Double value) {
            addCriterion("end_point_x =", value, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXNotEqualTo(Double value) {
            addCriterion("end_point_x <>", value, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXGreaterThan(Double value) {
            addCriterion("end_point_x >", value, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXGreaterThanOrEqualTo(Double value) {
            addCriterion("end_point_x >=", value, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXLessThan(Double value) {
            addCriterion("end_point_x <", value, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXLessThanOrEqualTo(Double value) {
            addCriterion("end_point_x <=", value, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXIn(List<Double> values) {
            addCriterion("end_point_x in", values, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXNotIn(List<Double> values) {
            addCriterion("end_point_x not in", values, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXBetween(Double value1, Double value2) {
            addCriterion("end_point_x between", value1, value2, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointXNotBetween(Double value1, Double value2) {
            addCriterion("end_point_x not between", value1, value2, "endPointX");
            return (Criteria) this;
        }

        public Criteria andEndPointYIsNull() {
            addCriterion("end_point_y is null");
            return (Criteria) this;
        }

        public Criteria andEndPointYIsNotNull() {
            addCriterion("end_point_y is not null");
            return (Criteria) this;
        }

        public Criteria andEndPointYEqualTo(Double value) {
            addCriterion("end_point_y =", value, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYNotEqualTo(Double value) {
            addCriterion("end_point_y <>", value, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYGreaterThan(Double value) {
            addCriterion("end_point_y >", value, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYGreaterThanOrEqualTo(Double value) {
            addCriterion("end_point_y >=", value, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYLessThan(Double value) {
            addCriterion("end_point_y <", value, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYLessThanOrEqualTo(Double value) {
            addCriterion("end_point_y <=", value, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYIn(List<Double> values) {
            addCriterion("end_point_y in", values, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYNotIn(List<Double> values) {
            addCriterion("end_point_y not in", values, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYBetween(Double value1, Double value2) {
            addCriterion("end_point_y between", value1, value2, "endPointY");
            return (Criteria) this;
        }

        public Criteria andEndPointYNotBetween(Double value1, Double value2) {
            addCriterion("end_point_y not between", value1, value2, "endPointY");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsIsNull() {
            addCriterion("multi_end_points is null");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsIsNotNull() {
            addCriterion("multi_end_points is not null");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsEqualTo(String value) {
            addCriterion("multi_end_points =", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsNotEqualTo(String value) {
            addCriterion("multi_end_points <>", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsGreaterThan(String value) {
            addCriterion("multi_end_points >", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsGreaterThanOrEqualTo(String value) {
            addCriterion("multi_end_points >=", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsLessThan(String value) {
            addCriterion("multi_end_points <", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsLessThanOrEqualTo(String value) {
            addCriterion("multi_end_points <=", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsLike(String value) {
            addCriterion("multi_end_points like", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsNotLike(String value) {
            addCriterion("multi_end_points not like", value, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsIn(List<String> values) {
            addCriterion("multi_end_points in", values, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsNotIn(List<String> values) {
            addCriterion("multi_end_points not in", values, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsBetween(String value1, String value2) {
            addCriterion("multi_end_points between", value1, value2, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andMultiEndPointsNotBetween(String value1, String value2) {
            addCriterion("multi_end_points not between", value1, value2, "multiEndPoints");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Long value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Long value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Long value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Long value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Long value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Long> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Long> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Long value1, Long value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Long value1, Long value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}