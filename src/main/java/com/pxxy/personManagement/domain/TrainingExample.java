package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TrainingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainingExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTDateIsNull() {
            addCriterion("t_date is null");
            return (Criteria) this;
        }

        public Criteria andTDateIsNotNull() {
            addCriterion("t_date is not null");
            return (Criteria) this;
        }

        public Criteria andTDateEqualTo(Date value) {
            addCriterionForJDBCDate("t_date =", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("t_date <>", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateGreaterThan(Date value) {
            addCriterionForJDBCDate("t_date >", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_date >=", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateLessThan(Date value) {
            addCriterionForJDBCDate("t_date <", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("t_date <=", value, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateIn(List<Date> values) {
            addCriterionForJDBCDate("t_date in", values, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("t_date not in", values, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_date between", value1, value2, "tDate");
            return (Criteria) this;
        }

        public Criteria andTDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("t_date not between", value1, value2, "tDate");
            return (Criteria) this;
        }

        public Criteria andTPlanIsNull() {
            addCriterion("t_plan is null");
            return (Criteria) this;
        }

        public Criteria andTPlanIsNotNull() {
            addCriterion("t_plan is not null");
            return (Criteria) this;
        }

        public Criteria andTPlanEqualTo(String value) {
            addCriterion("t_plan =", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanNotEqualTo(String value) {
            addCriterion("t_plan <>", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanGreaterThan(String value) {
            addCriterion("t_plan >", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanGreaterThanOrEqualTo(String value) {
            addCriterion("t_plan >=", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanLessThan(String value) {
            addCriterion("t_plan <", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanLessThanOrEqualTo(String value) {
            addCriterion("t_plan <=", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanLike(String value) {
            addCriterion("t_plan like", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanNotLike(String value) {
            addCriterion("t_plan not like", value, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanIn(List<String> values) {
            addCriterion("t_plan in", values, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanNotIn(List<String> values) {
            addCriterion("t_plan not in", values, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanBetween(String value1, String value2) {
            addCriterion("t_plan between", value1, value2, "tPlan");
            return (Criteria) this;
        }

        public Criteria andTPlanNotBetween(String value1, String value2) {
            addCriterion("t_plan not between", value1, value2, "tPlan");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andPPositionIsNull() {
            addCriterion("p_position is null");
            return (Criteria) this;
        }

        public Criteria andPPositionIsNotNull() {
            addCriterion("p_position is not null");
            return (Criteria) this;
        }

        public Criteria andPPositionEqualTo(String value) {
            addCriterion("p_position =", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionNotEqualTo(String value) {
            addCriterion("p_position <>", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionGreaterThan(String value) {
            addCriterion("p_position >", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionGreaterThanOrEqualTo(String value) {
            addCriterion("p_position >=", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionLessThan(String value) {
            addCriterion("p_position <", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionLessThanOrEqualTo(String value) {
            addCriterion("p_position <=", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionLike(String value) {
            addCriterion("p_position like", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionNotLike(String value) {
            addCriterion("p_position not like", value, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionIn(List<String> values) {
            addCriterion("p_position in", values, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionNotIn(List<String> values) {
            addCriterion("p_position not in", values, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionBetween(String value1, String value2) {
            addCriterion("p_position between", value1, value2, "pPosition");
            return (Criteria) this;
        }

        public Criteria andPPositionNotBetween(String value1, String value2) {
            addCriterion("p_position not between", value1, value2, "pPosition");
            return (Criteria) this;
        }

        public Criteria andTManIsNull() {
            addCriterion("t_man is null");
            return (Criteria) this;
        }

        public Criteria andTManIsNotNull() {
            addCriterion("t_man is not null");
            return (Criteria) this;
        }

        public Criteria andTManEqualTo(String value) {
            addCriterion("t_man =", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManNotEqualTo(String value) {
            addCriterion("t_man <>", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManGreaterThan(String value) {
            addCriterion("t_man >", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManGreaterThanOrEqualTo(String value) {
            addCriterion("t_man >=", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManLessThan(String value) {
            addCriterion("t_man <", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManLessThanOrEqualTo(String value) {
            addCriterion("t_man <=", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManLike(String value) {
            addCriterion("t_man like", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManNotLike(String value) {
            addCriterion("t_man not like", value, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManIn(List<String> values) {
            addCriterion("t_man in", values, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManNotIn(List<String> values) {
            addCriterion("t_man not in", values, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManBetween(String value1, String value2) {
            addCriterion("t_man between", value1, value2, "tMan");
            return (Criteria) this;
        }

        public Criteria andTManNotBetween(String value1, String value2) {
            addCriterion("t_man not between", value1, value2, "tMan");
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