package com.geekplus.test.athena.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseMapcellExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseMapcellExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCellCodeIsNull() {
            addCriterion("cell_code is null");
            return (Criteria) this;
        }

        public Criteria andCellCodeIsNotNull() {
            addCriterion("cell_code is not null");
            return (Criteria) this;
        }

        public Criteria andCellCodeEqualTo(String value) {
            addCriterion("cell_code =", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeNotEqualTo(String value) {
            addCriterion("cell_code <>", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeGreaterThan(String value) {
            addCriterion("cell_code >", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cell_code >=", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeLessThan(String value) {
            addCriterion("cell_code <", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeLessThanOrEqualTo(String value) {
            addCriterion("cell_code <=", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeLike(String value) {
            addCriterion("cell_code like", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeNotLike(String value) {
            addCriterion("cell_code not like", value, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeIn(List<String> values) {
            addCriterion("cell_code in", values, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeNotIn(List<String> values) {
            addCriterion("cell_code not in", values, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeBetween(String value1, String value2) {
            addCriterion("cell_code between", value1, value2, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellCodeNotBetween(String value1, String value2) {
            addCriterion("cell_code not between", value1, value2, "cellCode");
            return (Criteria) this;
        }

        public Criteria andCellTypeIsNull() {
            addCriterion("cell_type is null");
            return (Criteria) this;
        }

        public Criteria andCellTypeIsNotNull() {
            addCriterion("cell_type is not null");
            return (Criteria) this;
        }

        public Criteria andCellTypeEqualTo(String value) {
            addCriterion("cell_type =", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeNotEqualTo(String value) {
            addCriterion("cell_type <>", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeGreaterThan(String value) {
            addCriterion("cell_type >", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cell_type >=", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeLessThan(String value) {
            addCriterion("cell_type <", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeLessThanOrEqualTo(String value) {
            addCriterion("cell_type <=", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeLike(String value) {
            addCriterion("cell_type like", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeNotLike(String value) {
            addCriterion("cell_type not like", value, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeIn(List<String> values) {
            addCriterion("cell_type in", values, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeNotIn(List<String> values) {
            addCriterion("cell_type not in", values, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeBetween(String value1, String value2) {
            addCriterion("cell_type between", value1, value2, "cellType");
            return (Criteria) this;
        }

        public Criteria andCellTypeNotBetween(String value1, String value2) {
            addCriterion("cell_type not between", value1, value2, "cellType");
            return (Criteria) this;
        }

        public Criteria andIndexXIsNull() {
            addCriterion("index_x is null");
            return (Criteria) this;
        }

        public Criteria andIndexXIsNotNull() {
            addCriterion("index_x is not null");
            return (Criteria) this;
        }

        public Criteria andIndexXEqualTo(Integer value) {
            addCriterion("index_x =", value, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXNotEqualTo(Integer value) {
            addCriterion("index_x <>", value, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXGreaterThan(Integer value) {
            addCriterion("index_x >", value, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_x >=", value, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXLessThan(Integer value) {
            addCriterion("index_x <", value, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXLessThanOrEqualTo(Integer value) {
            addCriterion("index_x <=", value, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXIn(List<Integer> values) {
            addCriterion("index_x in", values, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXNotIn(List<Integer> values) {
            addCriterion("index_x not in", values, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXBetween(Integer value1, Integer value2) {
            addCriterion("index_x between", value1, value2, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexXNotBetween(Integer value1, Integer value2) {
            addCriterion("index_x not between", value1, value2, "indexX");
            return (Criteria) this;
        }

        public Criteria andIndexYIsNull() {
            addCriterion("index_y is null");
            return (Criteria) this;
        }

        public Criteria andIndexYIsNotNull() {
            addCriterion("index_y is not null");
            return (Criteria) this;
        }

        public Criteria andIndexYEqualTo(Integer value) {
            addCriterion("index_y =", value, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYNotEqualTo(Integer value) {
            addCriterion("index_y <>", value, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYGreaterThan(Integer value) {
            addCriterion("index_y >", value, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_y >=", value, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYLessThan(Integer value) {
            addCriterion("index_y <", value, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYLessThanOrEqualTo(Integer value) {
            addCriterion("index_y <=", value, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYIn(List<Integer> values) {
            addCriterion("index_y in", values, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYNotIn(List<Integer> values) {
            addCriterion("index_y not in", values, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYBetween(Integer value1, Integer value2) {
            addCriterion("index_y between", value1, value2, "indexY");
            return (Criteria) this;
        }

        public Criteria andIndexYNotBetween(Integer value1, Integer value2) {
            addCriterion("index_y not between", value1, value2, "indexY");
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

        public Criteria andLocationXEqualTo(Double value) {
            addCriterion("location_x =", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotEqualTo(Double value) {
            addCriterion("location_x <>", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThan(Double value) {
            addCriterion("location_x >", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXGreaterThanOrEqualTo(Double value) {
            addCriterion("location_x >=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThan(Double value) {
            addCriterion("location_x <", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXLessThanOrEqualTo(Double value) {
            addCriterion("location_x <=", value, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXIn(List<Double> values) {
            addCriterion("location_x in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotIn(List<Double> values) {
            addCriterion("location_x not in", values, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXBetween(Double value1, Double value2) {
            addCriterion("location_x between", value1, value2, "locationX");
            return (Criteria) this;
        }

        public Criteria andLocationXNotBetween(Double value1, Double value2) {
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

        public Criteria andLocationYEqualTo(Double value) {
            addCriterion("location_y =", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotEqualTo(Double value) {
            addCriterion("location_y <>", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThan(Double value) {
            addCriterion("location_y >", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYGreaterThanOrEqualTo(Double value) {
            addCriterion("location_y >=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThan(Double value) {
            addCriterion("location_y <", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYLessThanOrEqualTo(Double value) {
            addCriterion("location_y <=", value, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYIn(List<Double> values) {
            addCriterion("location_y in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotIn(List<Double> values) {
            addCriterion("location_y not in", values, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYBetween(Double value1, Double value2) {
            addCriterion("location_y between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andLocationYNotBetween(Double value1, Double value2) {
            addCriterion("location_y not between", value1, value2, "locationY");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Float value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Float value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Float value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Float value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Float value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Float> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Float> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Float value1, Float value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Float value1, Float value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Float value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Float value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Float value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Float value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Float value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Float> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Float> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Float value1, Float value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Float value1, Float value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andMapIdIsNull() {
            addCriterion("map_id is null");
            return (Criteria) this;
        }

        public Criteria andMapIdIsNotNull() {
            addCriterion("map_id is not null");
            return (Criteria) this;
        }

        public Criteria andMapIdEqualTo(Integer value) {
            addCriterion("map_id =", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotEqualTo(Integer value) {
            addCriterion("map_id <>", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdGreaterThan(Integer value) {
            addCriterion("map_id >", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("map_id >=", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdLessThan(Integer value) {
            addCriterion("map_id <", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdLessThanOrEqualTo(Integer value) {
            addCriterion("map_id <=", value, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdIn(List<Integer> values) {
            addCriterion("map_id in", values, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotIn(List<Integer> values) {
            addCriterion("map_id not in", values, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdBetween(Integer value1, Integer value2) {
            addCriterion("map_id between", value1, value2, "mapId");
            return (Criteria) this;
        }

        public Criteria andMapIdNotBetween(Integer value1, Integer value2) {
            addCriterion("map_id not between", value1, value2, "mapId");
            return (Criteria) this;
        }

        public Criteria andSizeTypeIsNull() {
            addCriterion("size_type is null");
            return (Criteria) this;
        }

        public Criteria andSizeTypeIsNotNull() {
            addCriterion("size_type is not null");
            return (Criteria) this;
        }

        public Criteria andSizeTypeEqualTo(String value) {
            addCriterion("size_type =", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotEqualTo(String value) {
            addCriterion("size_type <>", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeGreaterThan(String value) {
            addCriterion("size_type >", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("size_type >=", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLessThan(String value) {
            addCriterion("size_type <", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLessThanOrEqualTo(String value) {
            addCriterion("size_type <=", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLike(String value) {
            addCriterion("size_type like", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotLike(String value) {
            addCriterion("size_type not like", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeIn(List<String> values) {
            addCriterion("size_type in", values, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotIn(List<String> values) {
            addCriterion("size_type not in", values, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeBetween(String value1, String value2) {
            addCriterion("size_type between", value1, value2, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotBetween(String value1, String value2) {
            addCriterion("size_type not between", value1, value2, "sizeType");
            return (Criteria) this;
        }

        public Criteria andStartBoundXIsNull() {
            addCriterion("start_bound_x is null");
            return (Criteria) this;
        }

        public Criteria andStartBoundXIsNotNull() {
            addCriterion("start_bound_x is not null");
            return (Criteria) this;
        }

        public Criteria andStartBoundXEqualTo(Double value) {
            addCriterion("start_bound_x =", value, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXNotEqualTo(Double value) {
            addCriterion("start_bound_x <>", value, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXGreaterThan(Double value) {
            addCriterion("start_bound_x >", value, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXGreaterThanOrEqualTo(Double value) {
            addCriterion("start_bound_x >=", value, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXLessThan(Double value) {
            addCriterion("start_bound_x <", value, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXLessThanOrEqualTo(Double value) {
            addCriterion("start_bound_x <=", value, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXIn(List<Double> values) {
            addCriterion("start_bound_x in", values, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXNotIn(List<Double> values) {
            addCriterion("start_bound_x not in", values, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXBetween(Double value1, Double value2) {
            addCriterion("start_bound_x between", value1, value2, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundXNotBetween(Double value1, Double value2) {
            addCriterion("start_bound_x not between", value1, value2, "startBoundX");
            return (Criteria) this;
        }

        public Criteria andStartBoundYIsNull() {
            addCriterion("start_bound_y is null");
            return (Criteria) this;
        }

        public Criteria andStartBoundYIsNotNull() {
            addCriterion("start_bound_y is not null");
            return (Criteria) this;
        }

        public Criteria andStartBoundYEqualTo(Double value) {
            addCriterion("start_bound_y =", value, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYNotEqualTo(Double value) {
            addCriterion("start_bound_y <>", value, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYGreaterThan(Double value) {
            addCriterion("start_bound_y >", value, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYGreaterThanOrEqualTo(Double value) {
            addCriterion("start_bound_y >=", value, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYLessThan(Double value) {
            addCriterion("start_bound_y <", value, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYLessThanOrEqualTo(Double value) {
            addCriterion("start_bound_y <=", value, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYIn(List<Double> values) {
            addCriterion("start_bound_y in", values, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYNotIn(List<Double> values) {
            addCriterion("start_bound_y not in", values, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYBetween(Double value1, Double value2) {
            addCriterion("start_bound_y between", value1, value2, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andStartBoundYNotBetween(Double value1, Double value2) {
            addCriterion("start_bound_y not between", value1, value2, "startBoundY");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsIsNull() {
            addCriterion("unload_dirs is null");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsIsNotNull() {
            addCriterion("unload_dirs is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsEqualTo(String value) {
            addCriterion("unload_dirs =", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsNotEqualTo(String value) {
            addCriterion("unload_dirs <>", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsGreaterThan(String value) {
            addCriterion("unload_dirs >", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsGreaterThanOrEqualTo(String value) {
            addCriterion("unload_dirs >=", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsLessThan(String value) {
            addCriterion("unload_dirs <", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsLessThanOrEqualTo(String value) {
            addCriterion("unload_dirs <=", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsLike(String value) {
            addCriterion("unload_dirs like", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsNotLike(String value) {
            addCriterion("unload_dirs not like", value, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsIn(List<String> values) {
            addCriterion("unload_dirs in", values, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsNotIn(List<String> values) {
            addCriterion("unload_dirs not in", values, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsBetween(String value1, String value2) {
            addCriterion("unload_dirs between", value1, value2, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andUnloadDirsNotBetween(String value1, String value2) {
            addCriterion("unload_dirs not between", value1, value2, "unloadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsIsNull() {
            addCriterion("load_dirs is null");
            return (Criteria) this;
        }

        public Criteria andLoadDirsIsNotNull() {
            addCriterion("load_dirs is not null");
            return (Criteria) this;
        }

        public Criteria andLoadDirsEqualTo(String value) {
            addCriterion("load_dirs =", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsNotEqualTo(String value) {
            addCriterion("load_dirs <>", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsGreaterThan(String value) {
            addCriterion("load_dirs >", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsGreaterThanOrEqualTo(String value) {
            addCriterion("load_dirs >=", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsLessThan(String value) {
            addCriterion("load_dirs <", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsLessThanOrEqualTo(String value) {
            addCriterion("load_dirs <=", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsLike(String value) {
            addCriterion("load_dirs like", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsNotLike(String value) {
            addCriterion("load_dirs not like", value, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsIn(List<String> values) {
            addCriterion("load_dirs in", values, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsNotIn(List<String> values) {
            addCriterion("load_dirs not in", values, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsBetween(String value1, String value2) {
            addCriterion("load_dirs between", value1, value2, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andLoadDirsNotBetween(String value1, String value2) {
            addCriterion("load_dirs not between", value1, value2, "loadDirs");
            return (Criteria) this;
        }

        public Criteria andDescrIsNull() {
            addCriterion("descr is null");
            return (Criteria) this;
        }

        public Criteria andDescrIsNotNull() {
            addCriterion("descr is not null");
            return (Criteria) this;
        }

        public Criteria andDescrEqualTo(String value) {
            addCriterion("descr =", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotEqualTo(String value) {
            addCriterion("descr <>", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThan(String value) {
            addCriterion("descr >", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThanOrEqualTo(String value) {
            addCriterion("descr >=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThan(String value) {
            addCriterion("descr <", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThanOrEqualTo(String value) {
            addCriterion("descr <=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLike(String value) {
            addCriterion("descr like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotLike(String value) {
            addCriterion("descr not like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrIn(List<String> values) {
            addCriterion("descr in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotIn(List<String> values) {
            addCriterion("descr not in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrBetween(String value1, String value2) {
            addCriterion("descr between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotBetween(String value1, String value2) {
            addCriterion("descr not between", value1, value2, "descr");
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