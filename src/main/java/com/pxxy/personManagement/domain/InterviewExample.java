package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.List;

public class InterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andApIdIsNull() {
            addCriterion("ap_id is null");
            return (Criteria) this;
        }

        public Criteria andApIdIsNotNull() {
            addCriterion("ap_id is not null");
            return (Criteria) this;
        }

        public Criteria andApIdEqualTo(Integer value) {
            addCriterion("ap_id =", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotEqualTo(Integer value) {
            addCriterion("ap_id <>", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThan(Integer value) {
            addCriterion("ap_id >", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ap_id >=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThan(Integer value) {
            addCriterion("ap_id <", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdLessThanOrEqualTo(Integer value) {
            addCriterion("ap_id <=", value, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdIn(List<Integer> values) {
            addCriterion("ap_id in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotIn(List<Integer> values) {
            addCriterion("ap_id not in", values, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdBetween(Integer value1, Integer value2) {
            addCriterion("ap_id between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andApIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ap_id not between", value1, value2, "apId");
            return (Criteria) this;
        }

        public Criteria andIManIsNull() {
            addCriterion("i_man is null");
            return (Criteria) this;
        }

        public Criteria andIManIsNotNull() {
            addCriterion("i_man is not null");
            return (Criteria) this;
        }

        public Criteria andIManEqualTo(String value) {
            addCriterion("i_man =", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManNotEqualTo(String value) {
            addCriterion("i_man <>", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManGreaterThan(String value) {
            addCriterion("i_man >", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManGreaterThanOrEqualTo(String value) {
            addCriterion("i_man >=", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManLessThan(String value) {
            addCriterion("i_man <", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManLessThanOrEqualTo(String value) {
            addCriterion("i_man <=", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManLike(String value) {
            addCriterion("i_man like", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManNotLike(String value) {
            addCriterion("i_man not like", value, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManIn(List<String> values) {
            addCriterion("i_man in", values, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManNotIn(List<String> values) {
            addCriterion("i_man not in", values, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManBetween(String value1, String value2) {
            addCriterion("i_man between", value1, value2, "iMan");
            return (Criteria) this;
        }

        public Criteria andIManNotBetween(String value1, String value2) {
            addCriterion("i_man not between", value1, value2, "iMan");
            return (Criteria) this;
        }

        public Criteria andIPhoneIsNull() {
            addCriterion("i_phone is null");
            return (Criteria) this;
        }

        public Criteria andIPhoneIsNotNull() {
            addCriterion("i_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIPhoneEqualTo(String value) {
            addCriterion("i_phone =", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotEqualTo(String value) {
            addCriterion("i_phone <>", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneGreaterThan(String value) {
            addCriterion("i_phone >", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("i_phone >=", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneLessThan(String value) {
            addCriterion("i_phone <", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneLessThanOrEqualTo(String value) {
            addCriterion("i_phone <=", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneLike(String value) {
            addCriterion("i_phone like", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotLike(String value) {
            addCriterion("i_phone not like", value, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneIn(List<String> values) {
            addCriterion("i_phone in", values, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotIn(List<String> values) {
            addCriterion("i_phone not in", values, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneBetween(String value1, String value2) {
            addCriterion("i_phone between", value1, value2, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIPhoneNotBetween(String value1, String value2) {
            addCriterion("i_phone not between", value1, value2, "iPhone");
            return (Criteria) this;
        }

        public Criteria andIMessageIsNull() {
            addCriterion("i_message is null");
            return (Criteria) this;
        }

        public Criteria andIMessageIsNotNull() {
            addCriterion("i_message is not null");
            return (Criteria) this;
        }

        public Criteria andIMessageEqualTo(String value) {
            addCriterion("i_message =", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageNotEqualTo(String value) {
            addCriterion("i_message <>", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageGreaterThan(String value) {
            addCriterion("i_message >", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageGreaterThanOrEqualTo(String value) {
            addCriterion("i_message >=", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageLessThan(String value) {
            addCriterion("i_message <", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageLessThanOrEqualTo(String value) {
            addCriterion("i_message <=", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageLike(String value) {
            addCriterion("i_message like", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageNotLike(String value) {
            addCriterion("i_message not like", value, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageIn(List<String> values) {
            addCriterion("i_message in", values, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageNotIn(List<String> values) {
            addCriterion("i_message not in", values, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageBetween(String value1, String value2) {
            addCriterion("i_message between", value1, value2, "iMessage");
            return (Criteria) this;
        }

        public Criteria andIMessageNotBetween(String value1, String value2) {
            addCriterion("i_message not between", value1, value2, "iMessage");
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