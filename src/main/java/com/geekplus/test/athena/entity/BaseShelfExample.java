package com.geekplus.test.athena.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseShelfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseShelfExample() {
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

        public Criteria andClassCodeIsNull() {
            addCriterion("class_code is null");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNotNull() {
            addCriterion("class_code is not null");
            return (Criteria) this;
        }

        public Criteria andClassCodeEqualTo(String value) {
            addCriterion("class_code =", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotEqualTo(String value) {
            addCriterion("class_code <>", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThan(String value) {
            addCriterion("class_code >", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("class_code >=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThan(String value) {
            addCriterion("class_code <", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThanOrEqualTo(String value) {
            addCriterion("class_code <=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLike(String value) {
            addCriterion("class_code like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotLike(String value) {
            addCriterion("class_code not like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeIn(List<String> values) {
            addCriterion("class_code in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotIn(List<String> values) {
            addCriterion("class_code not in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeBetween(String value1, String value2) {
            addCriterion("class_code between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotBetween(String value1, String value2) {
            addCriterion("class_code not between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andShelfTypeIsNull() {
            addCriterion("shelf_type is null");
            return (Criteria) this;
        }

        public Criteria andShelfTypeIsNotNull() {
            addCriterion("shelf_type is not null");
            return (Criteria) this;
        }

        public Criteria andShelfTypeEqualTo(Byte value) {
            addCriterion("shelf_type =", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeNotEqualTo(Byte value) {
            addCriterion("shelf_type <>", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeGreaterThan(Byte value) {
            addCriterion("shelf_type >", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("shelf_type >=", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeLessThan(Byte value) {
            addCriterion("shelf_type <", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeLessThanOrEqualTo(Byte value) {
            addCriterion("shelf_type <=", value, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeIn(List<Byte> values) {
            addCriterion("shelf_type in", values, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeNotIn(List<Byte> values) {
            addCriterion("shelf_type not in", values, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeBetween(Byte value1, Byte value2) {
            addCriterion("shelf_type between", value1, value2, "shelfType");
            return (Criteria) this;
        }

        public Criteria andShelfTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("shelf_type not between", value1, value2, "shelfType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLocationXIsNull() {
            addCriterion("location_x is null");
            return (Criteria) this;
        }

        public Criteria andLocationXIsNotNull() {
            addCriterion("location_x is not null");
            return (Criteria) this;
        }

        public Criteria andLocationXEqualTo(Integer value) {
            addCriterion("location_x =", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotEqualTo(Integer value) {
            addCriterion("location_x <>", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThan(Integer value) {
            addCriterion("location_x >", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_x >=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThan(Integer value) {
            addCriterion("location_x <", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThanOrEqualTo(Integer value) {
            addCriterion("location_x <=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXIn(List<Integer> values) {
            addCriterion("location_x in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotIn(List<Integer> values) {
            addCriterion("location_x not in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXBetween(Integer value1, Integer value2) {
            addCriterion("location_x between", value1, value2, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotBetween(Integer value1, Integer value2) {
            addCriterion("location_x not between", value1, value2, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationYIsNull() {
            addCriterion("location_y is null");
            return (Criteria) this;
        }

        public Criteria andLocationYIsNotNull() {
            addCriterion("location_y is not null");
            return (Criteria) this;
        }

        public Criteria andLocationYEqualTo(Integer value) {
            addCriterion("location_y =", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotEqualTo(Integer value) {
            addCriterion("location_y <>", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThan(Integer value) {
            addCriterion("location_y >", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_y >=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThan(Integer value) {
            addCriterion("location_y <", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThanOrEqualTo(Integer value) {
            addCriterion("location_y <=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYIn(List<Integer> values) {
            addCriterion("location_y in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotIn(List<Integer> values) {
            addCriterion("location_y not in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYBetween(Integer value1, Integer value2) {
            addCriterion("location_y between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotBetween(Integer value1, Integer value2) {
            addCriterion("location_y not between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andPlacementXIsNull() {
            addCriterion("placement_x is null");
            return (Criteria) this;
        }

        public Criteria andPlacementXIsNotNull() {
            addCriterion("placement_x is not null");
            return (Criteria) this;
        }

        public Criteria andPlacementXEqualTo(Integer value) {
            addCriterion("placement_x =", value, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXNotEqualTo(Integer value) {
            addCriterion("placement_x <>", value, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXGreaterThan(Integer value) {
            addCriterion("placement_x >", value, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXGreaterThanOrEqualTo(Integer value) {
            addCriterion("placement_x >=", value, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXLessThan(Integer value) {
            addCriterion("placement_x <", value, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXLessThanOrEqualTo(Integer value) {
            addCriterion("placement_x <=", value, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXIn(List<Integer> values) {
            addCriterion("placement_x in", values, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXNotIn(List<Integer> values) {
            addCriterion("placement_x not in", values, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXBetween(Integer value1, Integer value2) {
            addCriterion("placement_x between", value1, value2, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementXNotBetween(Integer value1, Integer value2) {
            addCriterion("placement_x not between", value1, value2, "placementX");
            return (Criteria) this;
        }

        public Criteria andPlacementYIsNull() {
            addCriterion("placement_y is null");
            return (Criteria) this;
        }

        public Criteria andPlacementYIsNotNull() {
            addCriterion("placement_y is not null");
            return (Criteria) this;
        }

        public Criteria andPlacementYEqualTo(Integer value) {
            addCriterion("placement_y =", value, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYNotEqualTo(Integer value) {
            addCriterion("placement_y <>", value, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYGreaterThan(Integer value) {
            addCriterion("placement_y >", value, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYGreaterThanOrEqualTo(Integer value) {
            addCriterion("placement_y >=", value, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYLessThan(Integer value) {
            addCriterion("placement_y <", value, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYLessThanOrEqualTo(Integer value) {
            addCriterion("placement_y <=", value, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYIn(List<Integer> values) {
            addCriterion("placement_y in", values, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYNotIn(List<Integer> values) {
            addCriterion("placement_y not in", values, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYBetween(Integer value1, Integer value2) {
            addCriterion("placement_y between", value1, value2, "placementY");
            return (Criteria) this;
        }

        public Criteria andPlacementYNotBetween(Integer value1, Integer value2) {
            addCriterion("placement_y not between", value1, value2, "placementY");
            return (Criteria) this;
        }

        public Criteria andAngleIsNull() {
            addCriterion("angle is null");
            return (Criteria) this;
        }

        public Criteria andAngleIsNotNull() {
            addCriterion("angle is not null");
            return (Criteria) this;
        }

        public Criteria andAngleEqualTo(Float value) {
            addCriterion("angle =", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleNotEqualTo(Float value) {
            addCriterion("angle <>", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleGreaterThan(Float value) {
            addCriterion("angle >", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleGreaterThanOrEqualTo(Float value) {
            addCriterion("angle >=", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleLessThan(Float value) {
            addCriterion("angle <", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleLessThanOrEqualTo(Float value) {
            addCriterion("angle <=", value, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleIn(List<Float> values) {
            addCriterion("angle in", values, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleNotIn(List<Float> values) {
            addCriterion("angle not in", values, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleBetween(Float value1, Float value2) {
            addCriterion("angle between", value1, value2, "angle");
            return (Criteria) this;
        }

        public Criteria andAngleNotBetween(Float value1, Float value2) {
            addCriterion("angle not between", value1, value2, "angle");
            return (Criteria) this;
        }

        public Criteria andRobotidIsNull() {
            addCriterion("robotId is null");
            return (Criteria) this;
        }

        public Criteria andRobotidIsNotNull() {
            addCriterion("robotId is not null");
            return (Criteria) this;
        }

        public Criteria andRobotidEqualTo(Integer value) {
            addCriterion("robotId =", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidNotEqualTo(Integer value) {
            addCriterion("robotId <>", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidGreaterThan(Integer value) {
            addCriterion("robotId >", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidGreaterThanOrEqualTo(Integer value) {
            addCriterion("robotId >=", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidLessThan(Integer value) {
            addCriterion("robotId <", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidLessThanOrEqualTo(Integer value) {
            addCriterion("robotId <=", value, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidIn(List<Integer> values) {
            addCriterion("robotId in", values, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidNotIn(List<Integer> values) {
            addCriterion("robotId not in", values, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidBetween(Integer value1, Integer value2) {
            addCriterion("robotId between", value1, value2, "robotid");
            return (Criteria) this;
        }

        public Criteria andRobotidNotBetween(Integer value1, Integer value2) {
            addCriterion("robotId not between", value1, value2, "robotid");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Integer value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Integer value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Integer value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Integer value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Integer value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Integer> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Integer> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Integer value1, Integer value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andLogicIdIsNull() {
            addCriterion("logic_id is null");
            return (Criteria) this;
        }

        public Criteria andLogicIdIsNotNull() {
            addCriterion("logic_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogicIdEqualTo(Integer value) {
            addCriterion("logic_id =", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotEqualTo(Integer value) {
            addCriterion("logic_id <>", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdGreaterThan(Integer value) {
            addCriterion("logic_id >", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logic_id >=", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdLessThan(Integer value) {
            addCriterion("logic_id <", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdLessThanOrEqualTo(Integer value) {
            addCriterion("logic_id <=", value, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdIn(List<Integer> values) {
            addCriterion("logic_id in", values, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotIn(List<Integer> values) {
            addCriterion("logic_id not in", values, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdBetween(Integer value1, Integer value2) {
            addCriterion("logic_id between", value1, value2, "logicId");
            return (Criteria) this;
        }

        public Criteria andLogicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logic_id not between", value1, value2, "logicId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
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