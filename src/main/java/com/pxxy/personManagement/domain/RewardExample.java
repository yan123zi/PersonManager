package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardExample() {
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

        public Criteria andReRepuidIsNull() {
            addCriterion("re_repuid is null");
            return (Criteria) this;
        }

        public Criteria andReRepuidIsNotNull() {
            addCriterion("re_repuid is not null");
            return (Criteria) this;
        }

        public Criteria andReRepuidEqualTo(Integer value) {
            addCriterion("re_repuid =", value, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidNotEqualTo(Integer value) {
            addCriterion("re_repuid <>", value, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidGreaterThan(Integer value) {
            addCriterion("re_repuid >", value, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_repuid >=", value, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidLessThan(Integer value) {
            addCriterion("re_repuid <", value, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidLessThanOrEqualTo(Integer value) {
            addCriterion("re_repuid <=", value, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidIn(List<Integer> values) {
            addCriterion("re_repuid in", values, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidNotIn(List<Integer> values) {
            addCriterion("re_repuid not in", values, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidBetween(Integer value1, Integer value2) {
            addCriterion("re_repuid between", value1, value2, "reRepuid");
            return (Criteria) this;
        }

        public Criteria andReRepuidNotBetween(Integer value1, Integer value2) {
            addCriterion("re_repuid not between", value1, value2, "reRepuid");
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

        public Criteria andReRewardIsNull() {
            addCriterion("re_reward is null");
            return (Criteria) this;
        }

        public Criteria andReRewardIsNotNull() {
            addCriterion("re_reward is not null");
            return (Criteria) this;
        }

        public Criteria andReRewardEqualTo(Integer value) {
            addCriterion("re_reward =", value, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardNotEqualTo(Integer value) {
            addCriterion("re_reward <>", value, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardGreaterThan(Integer value) {
            addCriterion("re_reward >", value, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_reward >=", value, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardLessThan(Integer value) {
            addCriterion("re_reward <", value, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardLessThanOrEqualTo(Integer value) {
            addCriterion("re_reward <=", value, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardIn(List<Integer> values) {
            addCriterion("re_reward in", values, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardNotIn(List<Integer> values) {
            addCriterion("re_reward not in", values, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardBetween(Integer value1, Integer value2) {
            addCriterion("re_reward between", value1, value2, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRewardNotBetween(Integer value1, Integer value2) {
            addCriterion("re_reward not between", value1, value2, "reReward");
            return (Criteria) this;
        }

        public Criteria andReRedateIsNull() {
            addCriterion("re_redate is null");
            return (Criteria) this;
        }

        public Criteria andReRedateIsNotNull() {
            addCriterion("re_redate is not null");
            return (Criteria) this;
        }

        public Criteria andReRedateEqualTo(Date value) {
            addCriterionForJDBCDate("re_redate =", value, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("re_redate <>", value, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateGreaterThan(Date value) {
            addCriterionForJDBCDate("re_redate >", value, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_redate >=", value, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateLessThan(Date value) {
            addCriterionForJDBCDate("re_redate <", value, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_redate <=", value, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateIn(List<Date> values) {
            addCriterionForJDBCDate("re_redate in", values, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("re_redate not in", values, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_redate between", value1, value2, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReRedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_redate not between", value1, value2, "reRedate");
            return (Criteria) this;
        }

        public Criteria andReReresonIsNull() {
            addCriterion("re_rereson is null");
            return (Criteria) this;
        }

        public Criteria andReReresonIsNotNull() {
            addCriterion("re_rereson is not null");
            return (Criteria) this;
        }

        public Criteria andReReresonEqualTo(String value) {
            addCriterion("re_rereson =", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonNotEqualTo(String value) {
            addCriterion("re_rereson <>", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonGreaterThan(String value) {
            addCriterion("re_rereson >", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonGreaterThanOrEqualTo(String value) {
            addCriterion("re_rereson >=", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonLessThan(String value) {
            addCriterion("re_rereson <", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonLessThanOrEqualTo(String value) {
            addCriterion("re_rereson <=", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonLike(String value) {
            addCriterion("re_rereson like", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonNotLike(String value) {
            addCriterion("re_rereson not like", value, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonIn(List<String> values) {
            addCriterion("re_rereson in", values, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonNotIn(List<String> values) {
            addCriterion("re_rereson not in", values, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonBetween(String value1, String value2) {
            addCriterion("re_rereson between", value1, value2, "reRereson");
            return (Criteria) this;
        }

        public Criteria andReReresonNotBetween(String value1, String value2) {
            addCriterion("re_rereson not between", value1, value2, "reRereson");
            return (Criteria) this;
        }

        public Criteria andRePunishIsNull() {
            addCriterion("re_punish is null");
            return (Criteria) this;
        }

        public Criteria andRePunishIsNotNull() {
            addCriterion("re_punish is not null");
            return (Criteria) this;
        }

        public Criteria andRePunishEqualTo(Integer value) {
            addCriterion("re_punish =", value, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishNotEqualTo(Integer value) {
            addCriterion("re_punish <>", value, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishGreaterThan(Integer value) {
            addCriterion("re_punish >", value, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_punish >=", value, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishLessThan(Integer value) {
            addCriterion("re_punish <", value, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishLessThanOrEqualTo(Integer value) {
            addCriterion("re_punish <=", value, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishIn(List<Integer> values) {
            addCriterion("re_punish in", values, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishNotIn(List<Integer> values) {
            addCriterion("re_punish not in", values, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishBetween(Integer value1, Integer value2) {
            addCriterion("re_punish between", value1, value2, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePunishNotBetween(Integer value1, Integer value2) {
            addCriterion("re_punish not between", value1, value2, "rePunish");
            return (Criteria) this;
        }

        public Criteria andRePudateIsNull() {
            addCriterion("re_pudate is null");
            return (Criteria) this;
        }

        public Criteria andRePudateIsNotNull() {
            addCriterion("re_pudate is not null");
            return (Criteria) this;
        }

        public Criteria andRePudateEqualTo(Date value) {
            addCriterionForJDBCDate("re_pudate =", value, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateNotEqualTo(Date value) {
            addCriterionForJDBCDate("re_pudate <>", value, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateGreaterThan(Date value) {
            addCriterionForJDBCDate("re_pudate >", value, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_pudate >=", value, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateLessThan(Date value) {
            addCriterionForJDBCDate("re_pudate <", value, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_pudate <=", value, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateIn(List<Date> values) {
            addCriterionForJDBCDate("re_pudate in", values, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateNotIn(List<Date> values) {
            addCriterionForJDBCDate("re_pudate not in", values, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_pudate between", value1, value2, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePudateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_pudate not between", value1, value2, "rePudate");
            return (Criteria) this;
        }

        public Criteria andRePuresonIsNull() {
            addCriterion("re_pureson is null");
            return (Criteria) this;
        }

        public Criteria andRePuresonIsNotNull() {
            addCriterion("re_pureson is not null");
            return (Criteria) this;
        }

        public Criteria andRePuresonEqualTo(String value) {
            addCriterion("re_pureson =", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonNotEqualTo(String value) {
            addCriterion("re_pureson <>", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonGreaterThan(String value) {
            addCriterion("re_pureson >", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonGreaterThanOrEqualTo(String value) {
            addCriterion("re_pureson >=", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonLessThan(String value) {
            addCriterion("re_pureson <", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonLessThanOrEqualTo(String value) {
            addCriterion("re_pureson <=", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonLike(String value) {
            addCriterion("re_pureson like", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonNotLike(String value) {
            addCriterion("re_pureson not like", value, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonIn(List<String> values) {
            addCriterion("re_pureson in", values, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonNotIn(List<String> values) {
            addCriterion("re_pureson not in", values, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonBetween(String value1, String value2) {
            addCriterion("re_pureson between", value1, value2, "rePureson");
            return (Criteria) this;
        }

        public Criteria andRePuresonNotBetween(String value1, String value2) {
            addCriterion("re_pureson not between", value1, value2, "rePureson");
            return (Criteria) this;
        }

        public Criteria andReDateIsNull() {
            addCriterion("re_date is null");
            return (Criteria) this;
        }

        public Criteria andReDateIsNotNull() {
            addCriterion("re_date is not null");
            return (Criteria) this;
        }

        public Criteria andReDateEqualTo(Date value) {
            addCriterionForJDBCDate("re_date =", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("re_date <>", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateGreaterThan(Date value) {
            addCriterionForJDBCDate("re_date >", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_date >=", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateLessThan(Date value) {
            addCriterionForJDBCDate("re_date <", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_date <=", value, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateIn(List<Date> values) {
            addCriterionForJDBCDate("re_date in", values, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("re_date not in", values, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_date between", value1, value2, "reDate");
            return (Criteria) this;
        }

        public Criteria andReDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_date not between", value1, value2, "reDate");
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