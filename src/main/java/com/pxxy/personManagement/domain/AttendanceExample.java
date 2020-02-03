package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
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

        public Criteria andAtIdIsNull() {
            addCriterion("at_id is null");
            return (Criteria) this;
        }

        public Criteria andAtIdIsNotNull() {
            addCriterion("at_id is not null");
            return (Criteria) this;
        }

        public Criteria andAtIdEqualTo(Integer value) {
            addCriterion("at_id =", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotEqualTo(Integer value) {
            addCriterion("at_id <>", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdGreaterThan(Integer value) {
            addCriterion("at_id >", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("at_id >=", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdLessThan(Integer value) {
            addCriterion("at_id <", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdLessThanOrEqualTo(Integer value) {
            addCriterion("at_id <=", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdIn(List<Integer> values) {
            addCriterion("at_id in", values, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotIn(List<Integer> values) {
            addCriterion("at_id not in", values, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdBetween(Integer value1, Integer value2) {
            addCriterion("at_id between", value1, value2, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("at_id not between", value1, value2, "atId");
            return (Criteria) this;
        }

        public Criteria andAtDateIsNull() {
            addCriterion("at_date is null");
            return (Criteria) this;
        }

        public Criteria andAtDateIsNotNull() {
            addCriterion("at_date is not null");
            return (Criteria) this;
        }

        public Criteria andAtDateEqualTo(Date value) {
            addCriterion("at_date =", value, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateNotEqualTo(Date value) {
            addCriterion("at_date <>", value, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateGreaterThan(Date value) {
            addCriterion("at_date >", value, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("at_date >=", value, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateLessThan(Date value) {
            addCriterion("at_date <", value, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateLessThanOrEqualTo(Date value) {
            addCriterion("at_date <=", value, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateIn(List<Date> values) {
            addCriterion("at_date in", values, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateNotIn(List<Date> values) {
            addCriterion("at_date not in", values, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateBetween(Date value1, Date value2) {
            addCriterion("at_date between", value1, value2, "atDate");
            return (Criteria) this;
        }

        public Criteria andAtDateNotBetween(Date value1, Date value2) {
            addCriterion("at_date not between", value1, value2, "atDate");
            return (Criteria) this;
        }

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Integer value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Integer value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Integer value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Integer value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Integer> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Integer> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Integer value1, Integer value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_id not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andAtSwIsNull() {
            addCriterion("at_sw is null");
            return (Criteria) this;
        }

        public Criteria andAtSwIsNotNull() {
            addCriterion("at_sw is not null");
            return (Criteria) this;
        }

        public Criteria andAtSwEqualTo(Date value) {
            addCriterion("at_sw =", value, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwNotEqualTo(Date value) {
            addCriterion("at_sw <>", value, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwGreaterThan(Date value) {
            addCriterion("at_sw >", value, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwGreaterThanOrEqualTo(Date value) {
            addCriterion("at_sw >=", value, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwLessThan(Date value) {
            addCriterion("at_sw <", value, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwLessThanOrEqualTo(Date value) {
            addCriterion("at_sw <=", value, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwIn(List<Date> values) {
            addCriterion("at_sw in", values, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwNotIn(List<Date> values) {
            addCriterion("at_sw not in", values, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwBetween(Date value1, Date value2) {
            addCriterion("at_sw between", value1, value2, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtSwNotBetween(Date value1, Date value2) {
            addCriterion("at_sw not between", value1, value2, "atSw");
            return (Criteria) this;
        }

        public Criteria andAtEwIsNull() {
            addCriterion("at_ew is null");
            return (Criteria) this;
        }

        public Criteria andAtEwIsNotNull() {
            addCriterion("at_ew is not null");
            return (Criteria) this;
        }

        public Criteria andAtEwEqualTo(Date value) {
            addCriterion("at_ew =", value, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwNotEqualTo(Date value) {
            addCriterion("at_ew <>", value, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwGreaterThan(Date value) {
            addCriterion("at_ew >", value, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwGreaterThanOrEqualTo(Date value) {
            addCriterion("at_ew >=", value, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwLessThan(Date value) {
            addCriterion("at_ew <", value, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwLessThanOrEqualTo(Date value) {
            addCriterion("at_ew <=", value, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwIn(List<Date> values) {
            addCriterion("at_ew in", values, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwNotIn(List<Date> values) {
            addCriterion("at_ew not in", values, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwBetween(Date value1, Date value2) {
            addCriterion("at_ew between", value1, value2, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtEwNotBetween(Date value1, Date value2) {
            addCriterion("at_ew not between", value1, value2, "atEw");
            return (Criteria) this;
        }

        public Criteria andAtStatusIsNull() {
            addCriterion("at_status is null");
            return (Criteria) this;
        }

        public Criteria andAtStatusIsNotNull() {
            addCriterion("at_status is not null");
            return (Criteria) this;
        }

        public Criteria andAtStatusEqualTo(String value) {
            addCriterion("at_status =", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusNotEqualTo(String value) {
            addCriterion("at_status <>", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusGreaterThan(String value) {
            addCriterion("at_status >", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusGreaterThanOrEqualTo(String value) {
            addCriterion("at_status >=", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusLessThan(String value) {
            addCriterion("at_status <", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusLessThanOrEqualTo(String value) {
            addCriterion("at_status <=", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusLike(String value) {
            addCriterion("at_status like", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusNotLike(String value) {
            addCriterion("at_status not like", value, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusIn(List<String> values) {
            addCriterion("at_status in", values, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusNotIn(List<String> values) {
            addCriterion("at_status not in", values, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusBetween(String value1, String value2) {
            addCriterion("at_status between", value1, value2, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtStatusNotBetween(String value1, String value2) {
            addCriterion("at_status not between", value1, value2, "atStatus");
            return (Criteria) this;
        }

        public Criteria andAtDescIsNull() {
            addCriterion("at_desc is null");
            return (Criteria) this;
        }

        public Criteria andAtDescIsNotNull() {
            addCriterion("at_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAtDescEqualTo(String value) {
            addCriterion("at_desc =", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescNotEqualTo(String value) {
            addCriterion("at_desc <>", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescGreaterThan(String value) {
            addCriterion("at_desc >", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescGreaterThanOrEqualTo(String value) {
            addCriterion("at_desc >=", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescLessThan(String value) {
            addCriterion("at_desc <", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescLessThanOrEqualTo(String value) {
            addCriterion("at_desc <=", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescLike(String value) {
            addCriterion("at_desc like", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescNotLike(String value) {
            addCriterion("at_desc not like", value, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescIn(List<String> values) {
            addCriterion("at_desc in", values, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescNotIn(List<String> values) {
            addCriterion("at_desc not in", values, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescBetween(String value1, String value2) {
            addCriterion("at_desc between", value1, value2, "atDesc");
            return (Criteria) this;
        }

        public Criteria andAtDescNotBetween(String value1, String value2) {
            addCriterion("at_desc not between", value1, value2, "atDesc");
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