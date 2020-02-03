package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaveinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveinfoExample() {
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

        public Criteria andLAnameIsNull() {
            addCriterion("l_aname is null");
            return (Criteria) this;
        }

        public Criteria andLAnameIsNotNull() {
            addCriterion("l_aname is not null");
            return (Criteria) this;
        }

        public Criteria andLAnameEqualTo(String value) {
            addCriterion("l_aname =", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameNotEqualTo(String value) {
            addCriterion("l_aname <>", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameGreaterThan(String value) {
            addCriterion("l_aname >", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameGreaterThanOrEqualTo(String value) {
            addCriterion("l_aname >=", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameLessThan(String value) {
            addCriterion("l_aname <", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameLessThanOrEqualTo(String value) {
            addCriterion("l_aname <=", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameLike(String value) {
            addCriterion("l_aname like", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameNotLike(String value) {
            addCriterion("l_aname not like", value, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameIn(List<String> values) {
            addCriterion("l_aname in", values, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameNotIn(List<String> values) {
            addCriterion("l_aname not in", values, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameBetween(String value1, String value2) {
            addCriterion("l_aname between", value1, value2, "lAname");
            return (Criteria) this;
        }

        public Criteria andLAnameNotBetween(String value1, String value2) {
            addCriterion("l_aname not between", value1, value2, "lAname");
            return (Criteria) this;
        }

        public Criteria andLBnameIsNull() {
            addCriterion("l_bname is null");
            return (Criteria) this;
        }

        public Criteria andLBnameIsNotNull() {
            addCriterion("l_bname is not null");
            return (Criteria) this;
        }

        public Criteria andLBnameEqualTo(String value) {
            addCriterion("l_bname =", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameNotEqualTo(String value) {
            addCriterion("l_bname <>", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameGreaterThan(String value) {
            addCriterion("l_bname >", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameGreaterThanOrEqualTo(String value) {
            addCriterion("l_bname >=", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameLessThan(String value) {
            addCriterion("l_bname <", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameLessThanOrEqualTo(String value) {
            addCriterion("l_bname <=", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameLike(String value) {
            addCriterion("l_bname like", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameNotLike(String value) {
            addCriterion("l_bname not like", value, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameIn(List<String> values) {
            addCriterion("l_bname in", values, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameNotIn(List<String> values) {
            addCriterion("l_bname not in", values, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameBetween(String value1, String value2) {
            addCriterion("l_bname between", value1, value2, "lBname");
            return (Criteria) this;
        }

        public Criteria andLBnameNotBetween(String value1, String value2) {
            addCriterion("l_bname not between", value1, value2, "lBname");
            return (Criteria) this;
        }

        public Criteria andLJobIsNull() {
            addCriterion("l_job is null");
            return (Criteria) this;
        }

        public Criteria andLJobIsNotNull() {
            addCriterion("l_job is not null");
            return (Criteria) this;
        }

        public Criteria andLJobEqualTo(String value) {
            addCriterion("l_job =", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobNotEqualTo(String value) {
            addCriterion("l_job <>", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobGreaterThan(String value) {
            addCriterion("l_job >", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobGreaterThanOrEqualTo(String value) {
            addCriterion("l_job >=", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobLessThan(String value) {
            addCriterion("l_job <", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobLessThanOrEqualTo(String value) {
            addCriterion("l_job <=", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobLike(String value) {
            addCriterion("l_job like", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobNotLike(String value) {
            addCriterion("l_job not like", value, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobIn(List<String> values) {
            addCriterion("l_job in", values, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobNotIn(List<String> values) {
            addCriterion("l_job not in", values, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobBetween(String value1, String value2) {
            addCriterion("l_job between", value1, value2, "lJob");
            return (Criteria) this;
        }

        public Criteria andLJobNotBetween(String value1, String value2) {
            addCriterion("l_job not between", value1, value2, "lJob");
            return (Criteria) this;
        }

        public Criteria andLIntimeIsNull() {
            addCriterion("l_intime is null");
            return (Criteria) this;
        }

        public Criteria andLIntimeIsNotNull() {
            addCriterion("l_intime is not null");
            return (Criteria) this;
        }

        public Criteria andLIntimeEqualTo(String value) {
            addCriterion("l_intime =", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeNotEqualTo(String value) {
            addCriterion("l_intime <>", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeGreaterThan(String value) {
            addCriterion("l_intime >", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeGreaterThanOrEqualTo(String value) {
            addCriterion("l_intime >=", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeLessThan(String value) {
            addCriterion("l_intime <", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeLessThanOrEqualTo(String value) {
            addCriterion("l_intime <=", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeLike(String value) {
            addCriterion("l_intime like", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeNotLike(String value) {
            addCriterion("l_intime not like", value, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeIn(List<String> values) {
            addCriterion("l_intime in", values, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeNotIn(List<String> values) {
            addCriterion("l_intime not in", values, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeBetween(String value1, String value2) {
            addCriterion("l_intime between", value1, value2, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLIntimeNotBetween(String value1, String value2) {
            addCriterion("l_intime not between", value1, value2, "lIntime");
            return (Criteria) this;
        }

        public Criteria andLNumberIsNull() {
            addCriterion("l_number is null");
            return (Criteria) this;
        }

        public Criteria andLNumberIsNotNull() {
            addCriterion("l_number is not null");
            return (Criteria) this;
        }

        public Criteria andLNumberEqualTo(String value) {
            addCriterion("l_number =", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotEqualTo(String value) {
            addCriterion("l_number <>", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberGreaterThan(String value) {
            addCriterion("l_number >", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberGreaterThanOrEqualTo(String value) {
            addCriterion("l_number >=", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberLessThan(String value) {
            addCriterion("l_number <", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberLessThanOrEqualTo(String value) {
            addCriterion("l_number <=", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberLike(String value) {
            addCriterion("l_number like", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotLike(String value) {
            addCriterion("l_number not like", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberIn(List<String> values) {
            addCriterion("l_number in", values, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotIn(List<String> values) {
            addCriterion("l_number not in", values, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberBetween(String value1, String value2) {
            addCriterion("l_number between", value1, value2, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotBetween(String value1, String value2) {
            addCriterion("l_number not between", value1, value2, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLLevtimeIsNull() {
            addCriterion("l_levtime is null");
            return (Criteria) this;
        }

        public Criteria andLLevtimeIsNotNull() {
            addCriterion("l_levtime is not null");
            return (Criteria) this;
        }

        public Criteria andLLevtimeEqualTo(Date value) {
            addCriterion("l_levtime =", value, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeNotEqualTo(Date value) {
            addCriterion("l_levtime <>", value, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeGreaterThan(Date value) {
            addCriterion("l_levtime >", value, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("l_levtime >=", value, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeLessThan(Date value) {
            addCriterion("l_levtime <", value, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeLessThanOrEqualTo(Date value) {
            addCriterion("l_levtime <=", value, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeIn(List<Date> values) {
            addCriterion("l_levtime in", values, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeNotIn(List<Date> values) {
            addCriterion("l_levtime not in", values, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeBetween(Date value1, Date value2) {
            addCriterion("l_levtime between", value1, value2, "lLevtime");
            return (Criteria) this;
        }

        public Criteria andLLevtimeNotBetween(Date value1, Date value2) {
            addCriterion("l_levtime not between", value1, value2, "lLevtime");
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