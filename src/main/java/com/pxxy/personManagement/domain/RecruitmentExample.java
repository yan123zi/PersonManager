package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecruitmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitmentExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNull() {
            addCriterion("r_time is null");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNotNull() {
            addCriterion("r_time is not null");
            return (Criteria) this;
        }

        public Criteria andRTimeEqualTo(Date value) {
            addCriterion("r_time =", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotEqualTo(Date value) {
            addCriterion("r_time <>", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThan(Date value) {
            addCriterion("r_time >", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_time >=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThan(Date value) {
            addCriterion("r_time <", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThanOrEqualTo(Date value) {
            addCriterion("r_time <=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeIn(List<Date> values) {
            addCriterion("r_time in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotIn(List<Date> values) {
            addCriterion("r_time not in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeBetween(Date value1, Date value2) {
            addCriterion("r_time between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotBetween(Date value1, Date value2) {
            addCriterion("r_time not between", value1, value2, "rTime");
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

        public Criteria andRNumberIsNull() {
            addCriterion("r_number is null");
            return (Criteria) this;
        }

        public Criteria andRNumberIsNotNull() {
            addCriterion("r_number is not null");
            return (Criteria) this;
        }

        public Criteria andRNumberEqualTo(String value) {
            addCriterion("r_number =", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotEqualTo(String value) {
            addCriterion("r_number <>", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThan(String value) {
            addCriterion("r_number >", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberGreaterThanOrEqualTo(String value) {
            addCriterion("r_number >=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThan(String value) {
            addCriterion("r_number <", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLessThanOrEqualTo(String value) {
            addCriterion("r_number <=", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberLike(String value) {
            addCriterion("r_number like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotLike(String value) {
            addCriterion("r_number not like", value, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberIn(List<String> values) {
            addCriterion("r_number in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotIn(List<String> values) {
            addCriterion("r_number not in", values, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberBetween(String value1, String value2) {
            addCriterion("r_number between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRNumberNotBetween(String value1, String value2) {
            addCriterion("r_number not between", value1, value2, "rNumber");
            return (Criteria) this;
        }

        public Criteria andRTitleIsNull() {
            addCriterion("r_title is null");
            return (Criteria) this;
        }

        public Criteria andRTitleIsNotNull() {
            addCriterion("r_title is not null");
            return (Criteria) this;
        }

        public Criteria andRTitleEqualTo(String value) {
            addCriterion("r_title =", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotEqualTo(String value) {
            addCriterion("r_title <>", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleGreaterThan(String value) {
            addCriterion("r_title >", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleGreaterThanOrEqualTo(String value) {
            addCriterion("r_title >=", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLessThan(String value) {
            addCriterion("r_title <", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLessThanOrEqualTo(String value) {
            addCriterion("r_title <=", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleLike(String value) {
            addCriterion("r_title like", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotLike(String value) {
            addCriterion("r_title not like", value, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleIn(List<String> values) {
            addCriterion("r_title in", values, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotIn(List<String> values) {
            addCriterion("r_title not in", values, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleBetween(String value1, String value2) {
            addCriterion("r_title between", value1, value2, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRTitleNotBetween(String value1, String value2) {
            addCriterion("r_title not between", value1, value2, "rTitle");
            return (Criteria) this;
        }

        public Criteria andRSalaryIsNull() {
            addCriterion("r_salary is null");
            return (Criteria) this;
        }

        public Criteria andRSalaryIsNotNull() {
            addCriterion("r_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRSalaryEqualTo(Integer value) {
            addCriterion("r_salary =", value, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryNotEqualTo(Integer value) {
            addCriterion("r_salary <>", value, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryGreaterThan(Integer value) {
            addCriterion("r_salary >", value, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_salary >=", value, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryLessThan(Integer value) {
            addCriterion("r_salary <", value, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("r_salary <=", value, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryIn(List<Integer> values) {
            addCriterion("r_salary in", values, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryNotIn(List<Integer> values) {
            addCriterion("r_salary not in", values, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryBetween(Integer value1, Integer value2) {
            addCriterion("r_salary between", value1, value2, "rSalary");
            return (Criteria) this;
        }

        public Criteria andRSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("r_salary not between", value1, value2, "rSalary");
            return (Criteria) this;
        }

        public Criteria andREduIsNull() {
            addCriterion("r_edu is null");
            return (Criteria) this;
        }

        public Criteria andREduIsNotNull() {
            addCriterion("r_edu is not null");
            return (Criteria) this;
        }

        public Criteria andREduEqualTo(String value) {
            addCriterion("r_edu =", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduNotEqualTo(String value) {
            addCriterion("r_edu <>", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduGreaterThan(String value) {
            addCriterion("r_edu >", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduGreaterThanOrEqualTo(String value) {
            addCriterion("r_edu >=", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduLessThan(String value) {
            addCriterion("r_edu <", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduLessThanOrEqualTo(String value) {
            addCriterion("r_edu <=", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduLike(String value) {
            addCriterion("r_edu like", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduNotLike(String value) {
            addCriterion("r_edu not like", value, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduIn(List<String> values) {
            addCriterion("r_edu in", values, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduNotIn(List<String> values) {
            addCriterion("r_edu not in", values, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduBetween(String value1, String value2) {
            addCriterion("r_edu between", value1, value2, "rEdu");
            return (Criteria) this;
        }

        public Criteria andREduNotBetween(String value1, String value2) {
            addCriterion("r_edu not between", value1, value2, "rEdu");
            return (Criteria) this;
        }

        public Criteria andRExpIsNull() {
            addCriterion("r_exp is null");
            return (Criteria) this;
        }

        public Criteria andRExpIsNotNull() {
            addCriterion("r_exp is not null");
            return (Criteria) this;
        }

        public Criteria andRExpEqualTo(String value) {
            addCriterion("r_exp =", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpNotEqualTo(String value) {
            addCriterion("r_exp <>", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpGreaterThan(String value) {
            addCriterion("r_exp >", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpGreaterThanOrEqualTo(String value) {
            addCriterion("r_exp >=", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpLessThan(String value) {
            addCriterion("r_exp <", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpLessThanOrEqualTo(String value) {
            addCriterion("r_exp <=", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpLike(String value) {
            addCriterion("r_exp like", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpNotLike(String value) {
            addCriterion("r_exp not like", value, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpIn(List<String> values) {
            addCriterion("r_exp in", values, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpNotIn(List<String> values) {
            addCriterion("r_exp not in", values, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpBetween(String value1, String value2) {
            addCriterion("r_exp between", value1, value2, "rExp");
            return (Criteria) this;
        }

        public Criteria andRExpNotBetween(String value1, String value2) {
            addCriterion("r_exp not between", value1, value2, "rExp");
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