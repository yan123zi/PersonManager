package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
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

        public Criteria andCAnameIsNull() {
            addCriterion("c_aname is null");
            return (Criteria) this;
        }

        public Criteria andCAnameIsNotNull() {
            addCriterion("c_aname is not null");
            return (Criteria) this;
        }

        public Criteria andCAnameEqualTo(String value) {
            addCriterion("c_aname =", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameNotEqualTo(String value) {
            addCriterion("c_aname <>", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameGreaterThan(String value) {
            addCriterion("c_aname >", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_aname >=", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameLessThan(String value) {
            addCriterion("c_aname <", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameLessThanOrEqualTo(String value) {
            addCriterion("c_aname <=", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameLike(String value) {
            addCriterion("c_aname like", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameNotLike(String value) {
            addCriterion("c_aname not like", value, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameIn(List<String> values) {
            addCriterion("c_aname in", values, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameNotIn(List<String> values) {
            addCriterion("c_aname not in", values, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameBetween(String value1, String value2) {
            addCriterion("c_aname between", value1, value2, "cAname");
            return (Criteria) this;
        }

        public Criteria andCAnameNotBetween(String value1, String value2) {
            addCriterion("c_aname not between", value1, value2, "cAname");
            return (Criteria) this;
        }

        public Criteria andCBnameIsNull() {
            addCriterion("c_bname is null");
            return (Criteria) this;
        }

        public Criteria andCBnameIsNotNull() {
            addCriterion("c_bname is not null");
            return (Criteria) this;
        }

        public Criteria andCBnameEqualTo(String value) {
            addCriterion("c_bname =", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameNotEqualTo(String value) {
            addCriterion("c_bname <>", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameGreaterThan(String value) {
            addCriterion("c_bname >", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameGreaterThanOrEqualTo(String value) {
            addCriterion("c_bname >=", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameLessThan(String value) {
            addCriterion("c_bname <", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameLessThanOrEqualTo(String value) {
            addCriterion("c_bname <=", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameLike(String value) {
            addCriterion("c_bname like", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameNotLike(String value) {
            addCriterion("c_bname not like", value, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameIn(List<String> values) {
            addCriterion("c_bname in", values, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameNotIn(List<String> values) {
            addCriterion("c_bname not in", values, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameBetween(String value1, String value2) {
            addCriterion("c_bname between", value1, value2, "cBname");
            return (Criteria) this;
        }

        public Criteria andCBnameNotBetween(String value1, String value2) {
            addCriterion("c_bname not between", value1, value2, "cBname");
            return (Criteria) this;
        }

        public Criteria andCAaddressIsNull() {
            addCriterion("c_aaddress is null");
            return (Criteria) this;
        }

        public Criteria andCAaddressIsNotNull() {
            addCriterion("c_aaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCAaddressEqualTo(String value) {
            addCriterion("c_aaddress =", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressNotEqualTo(String value) {
            addCriterion("c_aaddress <>", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressGreaterThan(String value) {
            addCriterion("c_aaddress >", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_aaddress >=", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressLessThan(String value) {
            addCriterion("c_aaddress <", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressLessThanOrEqualTo(String value) {
            addCriterion("c_aaddress <=", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressLike(String value) {
            addCriterion("c_aaddress like", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressNotLike(String value) {
            addCriterion("c_aaddress not like", value, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressIn(List<String> values) {
            addCriterion("c_aaddress in", values, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressNotIn(List<String> values) {
            addCriterion("c_aaddress not in", values, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressBetween(String value1, String value2) {
            addCriterion("c_aaddress between", value1, value2, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCAaddressNotBetween(String value1, String value2) {
            addCriterion("c_aaddress not between", value1, value2, "cAaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressIsNull() {
            addCriterion("c_baddress is null");
            return (Criteria) this;
        }

        public Criteria andCBaddressIsNotNull() {
            addCriterion("c_baddress is not null");
            return (Criteria) this;
        }

        public Criteria andCBaddressEqualTo(String value) {
            addCriterion("c_baddress =", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressNotEqualTo(String value) {
            addCriterion("c_baddress <>", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressGreaterThan(String value) {
            addCriterion("c_baddress >", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_baddress >=", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressLessThan(String value) {
            addCriterion("c_baddress <", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressLessThanOrEqualTo(String value) {
            addCriterion("c_baddress <=", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressLike(String value) {
            addCriterion("c_baddress like", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressNotLike(String value) {
            addCriterion("c_baddress not like", value, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressIn(List<String> values) {
            addCriterion("c_baddress in", values, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressNotIn(List<String> values) {
            addCriterion("c_baddress not in", values, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressBetween(String value1, String value2) {
            addCriterion("c_baddress between", value1, value2, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBaddressNotBetween(String value1, String value2) {
            addCriterion("c_baddress not between", value1, value2, "cBaddress");
            return (Criteria) this;
        }

        public Criteria andCBnumberIsNull() {
            addCriterion("c_bnumber is null");
            return (Criteria) this;
        }

        public Criteria andCBnumberIsNotNull() {
            addCriterion("c_bnumber is not null");
            return (Criteria) this;
        }

        public Criteria andCBnumberEqualTo(String value) {
            addCriterion("c_bnumber =", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberNotEqualTo(String value) {
            addCriterion("c_bnumber <>", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberGreaterThan(String value) {
            addCriterion("c_bnumber >", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberGreaterThanOrEqualTo(String value) {
            addCriterion("c_bnumber >=", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberLessThan(String value) {
            addCriterion("c_bnumber <", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberLessThanOrEqualTo(String value) {
            addCriterion("c_bnumber <=", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberLike(String value) {
            addCriterion("c_bnumber like", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberNotLike(String value) {
            addCriterion("c_bnumber not like", value, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberIn(List<String> values) {
            addCriterion("c_bnumber in", values, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberNotIn(List<String> values) {
            addCriterion("c_bnumber not in", values, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberBetween(String value1, String value2) {
            addCriterion("c_bnumber between", value1, value2, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBnumberNotBetween(String value1, String value2) {
            addCriterion("c_bnumber not between", value1, value2, "cBnumber");
            return (Criteria) this;
        }

        public Criteria andCBpositionIsNull() {
            addCriterion("c_bposition is null");
            return (Criteria) this;
        }

        public Criteria andCBpositionIsNotNull() {
            addCriterion("c_bposition is not null");
            return (Criteria) this;
        }

        public Criteria andCBpositionEqualTo(String value) {
            addCriterion("c_bposition =", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionNotEqualTo(String value) {
            addCriterion("c_bposition <>", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionGreaterThan(String value) {
            addCriterion("c_bposition >", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionGreaterThanOrEqualTo(String value) {
            addCriterion("c_bposition >=", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionLessThan(String value) {
            addCriterion("c_bposition <", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionLessThanOrEqualTo(String value) {
            addCriterion("c_bposition <=", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionLike(String value) {
            addCriterion("c_bposition like", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionNotLike(String value) {
            addCriterion("c_bposition not like", value, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionIn(List<String> values) {
            addCriterion("c_bposition in", values, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionNotIn(List<String> values) {
            addCriterion("c_bposition not in", values, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionBetween(String value1, String value2) {
            addCriterion("c_bposition between", value1, value2, "cBposition");
            return (Criteria) this;
        }

        public Criteria andCBpositionNotBetween(String value1, String value2) {
            addCriterion("c_bposition not between", value1, value2, "cBposition");
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