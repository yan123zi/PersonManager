package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.List;

public class SalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
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

        public Criteria andSSalaryIsNull() {
            addCriterion("s_salary is null");
            return (Criteria) this;
        }

        public Criteria andSSalaryIsNotNull() {
            addCriterion("s_salary is not null");
            return (Criteria) this;
        }

        public Criteria andSSalaryEqualTo(Double value) {
            addCriterion("s_salary =", value, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryNotEqualTo(Double value) {
            addCriterion("s_salary <>", value, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryGreaterThan(Double value) {
            addCriterion("s_salary >", value, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("s_salary >=", value, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryLessThan(Double value) {
            addCriterion("s_salary <", value, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryLessThanOrEqualTo(Double value) {
            addCriterion("s_salary <=", value, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryIn(List<Double> values) {
            addCriterion("s_salary in", values, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryNotIn(List<Double> values) {
            addCriterion("s_salary not in", values, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryBetween(Double value1, Double value2) {
            addCriterion("s_salary between", value1, value2, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSalaryNotBetween(Double value1, Double value2) {
            addCriterion("s_salary not between", value1, value2, "sSalary");
            return (Criteria) this;
        }

        public Criteria andSSocialIsNull() {
            addCriterion("s_social is null");
            return (Criteria) this;
        }

        public Criteria andSSocialIsNotNull() {
            addCriterion("s_social is not null");
            return (Criteria) this;
        }

        public Criteria andSSocialEqualTo(Double value) {
            addCriterion("s_social =", value, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialNotEqualTo(Double value) {
            addCriterion("s_social <>", value, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialGreaterThan(Double value) {
            addCriterion("s_social >", value, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialGreaterThanOrEqualTo(Double value) {
            addCriterion("s_social >=", value, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialLessThan(Double value) {
            addCriterion("s_social <", value, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialLessThanOrEqualTo(Double value) {
            addCriterion("s_social <=", value, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialIn(List<Double> values) {
            addCriterion("s_social in", values, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialNotIn(List<Double> values) {
            addCriterion("s_social not in", values, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialBetween(Double value1, Double value2) {
            addCriterion("s_social between", value1, value2, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSocialNotBetween(Double value1, Double value2) {
            addCriterion("s_social not between", value1, value2, "sSocial");
            return (Criteria) this;
        }

        public Criteria andSSubsidyIsNull() {
            addCriterion("s_subsidy is null");
            return (Criteria) this;
        }

        public Criteria andSSubsidyIsNotNull() {
            addCriterion("s_subsidy is not null");
            return (Criteria) this;
        }

        public Criteria andSSubsidyEqualTo(Double value) {
            addCriterion("s_subsidy =", value, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyNotEqualTo(Double value) {
            addCriterion("s_subsidy <>", value, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyGreaterThan(Double value) {
            addCriterion("s_subsidy >", value, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyGreaterThanOrEqualTo(Double value) {
            addCriterion("s_subsidy >=", value, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyLessThan(Double value) {
            addCriterion("s_subsidy <", value, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyLessThanOrEqualTo(Double value) {
            addCriterion("s_subsidy <=", value, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyIn(List<Double> values) {
            addCriterion("s_subsidy in", values, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyNotIn(List<Double> values) {
            addCriterion("s_subsidy not in", values, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyBetween(Double value1, Double value2) {
            addCriterion("s_subsidy between", value1, value2, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSSubsidyNotBetween(Double value1, Double value2) {
            addCriterion("s_subsidy not between", value1, value2, "sSubsidy");
            return (Criteria) this;
        }

        public Criteria andSFinalIsNull() {
            addCriterion("s_final is null");
            return (Criteria) this;
        }

        public Criteria andSFinalIsNotNull() {
            addCriterion("s_final is not null");
            return (Criteria) this;
        }

        public Criteria andSFinalEqualTo(Double value) {
            addCriterion("s_final =", value, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalNotEqualTo(Double value) {
            addCriterion("s_final <>", value, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalGreaterThan(Double value) {
            addCriterion("s_final >", value, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalGreaterThanOrEqualTo(Double value) {
            addCriterion("s_final >=", value, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalLessThan(Double value) {
            addCriterion("s_final <", value, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalLessThanOrEqualTo(Double value) {
            addCriterion("s_final <=", value, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalIn(List<Double> values) {
            addCriterion("s_final in", values, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalNotIn(List<Double> values) {
            addCriterion("s_final not in", values, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalBetween(Double value1, Double value2) {
            addCriterion("s_final between", value1, value2, "sFinal");
            return (Criteria) this;
        }

        public Criteria andSFinalNotBetween(Double value1, Double value2) {
            addCriterion("s_final not between", value1, value2, "sFinal");
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