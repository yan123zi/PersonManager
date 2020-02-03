package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andEGenderIsNull() {
            addCriterion("e_gender is null");
            return (Criteria) this;
        }

        public Criteria andEGenderIsNotNull() {
            addCriterion("e_gender is not null");
            return (Criteria) this;
        }

        public Criteria andEGenderEqualTo(String value) {
            addCriterion("e_gender =", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderNotEqualTo(String value) {
            addCriterion("e_gender <>", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderGreaterThan(String value) {
            addCriterion("e_gender >", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderGreaterThanOrEqualTo(String value) {
            addCriterion("e_gender >=", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderLessThan(String value) {
            addCriterion("e_gender <", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderLessThanOrEqualTo(String value) {
            addCriterion("e_gender <=", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderLike(String value) {
            addCriterion("e_gender like", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderNotLike(String value) {
            addCriterion("e_gender not like", value, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderIn(List<String> values) {
            addCriterion("e_gender in", values, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderNotIn(List<String> values) {
            addCriterion("e_gender not in", values, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderBetween(String value1, String value2) {
            addCriterion("e_gender between", value1, value2, "eGender");
            return (Criteria) this;
        }

        public Criteria andEGenderNotBetween(String value1, String value2) {
            addCriterion("e_gender not between", value1, value2, "eGender");
            return (Criteria) this;
        }

        public Criteria andEAgeIsNull() {
            addCriterion("e_age is null");
            return (Criteria) this;
        }

        public Criteria andEAgeIsNotNull() {
            addCriterion("e_age is not null");
            return (Criteria) this;
        }

        public Criteria andEAgeEqualTo(String value) {
            addCriterion("e_age =", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeNotEqualTo(String value) {
            addCriterion("e_age <>", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeGreaterThan(String value) {
            addCriterion("e_age >", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeGreaterThanOrEqualTo(String value) {
            addCriterion("e_age >=", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeLessThan(String value) {
            addCriterion("e_age <", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeLessThanOrEqualTo(String value) {
            addCriterion("e_age <=", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeLike(String value) {
            addCriterion("e_age like", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeNotLike(String value) {
            addCriterion("e_age not like", value, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeIn(List<String> values) {
            addCriterion("e_age in", values, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeNotIn(List<String> values) {
            addCriterion("e_age not in", values, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeBetween(String value1, String value2) {
            addCriterion("e_age between", value1, value2, "eAge");
            return (Criteria) this;
        }

        public Criteria andEAgeNotBetween(String value1, String value2) {
            addCriterion("e_age not between", value1, value2, "eAge");
            return (Criteria) this;
        }

        public Criteria andEPhoneIsNull() {
            addCriterion("e_phone is null");
            return (Criteria) this;
        }

        public Criteria andEPhoneIsNotNull() {
            addCriterion("e_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEPhoneEqualTo(String value) {
            addCriterion("e_phone =", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotEqualTo(String value) {
            addCriterion("e_phone <>", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneGreaterThan(String value) {
            addCriterion("e_phone >", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("e_phone >=", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneLessThan(String value) {
            addCriterion("e_phone <", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneLessThanOrEqualTo(String value) {
            addCriterion("e_phone <=", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneLike(String value) {
            addCriterion("e_phone like", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotLike(String value) {
            addCriterion("e_phone not like", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneIn(List<String> values) {
            addCriterion("e_phone in", values, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotIn(List<String> values) {
            addCriterion("e_phone not in", values, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneBetween(String value1, String value2) {
            addCriterion("e_phone between", value1, value2, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotBetween(String value1, String value2) {
            addCriterion("e_phone not between", value1, value2, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPasswordIsNull() {
            addCriterion("e_password is null");
            return (Criteria) this;
        }

        public Criteria andEPasswordIsNotNull() {
            addCriterion("e_password is not null");
            return (Criteria) this;
        }

        public Criteria andEPasswordEqualTo(String value) {
            addCriterion("e_password =", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotEqualTo(String value) {
            addCriterion("e_password <>", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordGreaterThan(String value) {
            addCriterion("e_password >", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("e_password >=", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordLessThan(String value) {
            addCriterion("e_password <", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordLessThanOrEqualTo(String value) {
            addCriterion("e_password <=", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordLike(String value) {
            addCriterion("e_password like", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotLike(String value) {
            addCriterion("e_password not like", value, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordIn(List<String> values) {
            addCriterion("e_password in", values, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotIn(List<String> values) {
            addCriterion("e_password not in", values, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordBetween(String value1, String value2) {
            addCriterion("e_password between", value1, value2, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEPasswordNotBetween(String value1, String value2) {
            addCriterion("e_password not between", value1, value2, "ePassword");
            return (Criteria) this;
        }

        public Criteria andEBornIsNull() {
            addCriterion("e_born is null");
            return (Criteria) this;
        }

        public Criteria andEBornIsNotNull() {
            addCriterion("e_born is not null");
            return (Criteria) this;
        }

        public Criteria andEBornEqualTo(Date value) {
            addCriterionForJDBCDate("e_born =", value, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornNotEqualTo(Date value) {
            addCriterionForJDBCDate("e_born <>", value, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornGreaterThan(Date value) {
            addCriterionForJDBCDate("e_born >", value, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("e_born >=", value, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornLessThan(Date value) {
            addCriterionForJDBCDate("e_born <", value, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("e_born <=", value, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornIn(List<Date> values) {
            addCriterionForJDBCDate("e_born in", values, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornNotIn(List<Date> values) {
            addCriterionForJDBCDate("e_born not in", values, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("e_born between", value1, value2, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEBornNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("e_born not between", value1, value2, "eBorn");
            return (Criteria) this;
        }

        public Criteria andEIfworkIsNull() {
            addCriterion("e_ifwork is null");
            return (Criteria) this;
        }

        public Criteria andEIfworkIsNotNull() {
            addCriterion("e_ifwork is not null");
            return (Criteria) this;
        }

        public Criteria andEIfworkEqualTo(Integer value) {
            addCriterion("e_ifwork =", value, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkNotEqualTo(Integer value) {
            addCriterion("e_ifwork <>", value, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkGreaterThan(Integer value) {
            addCriterion("e_ifwork >", value, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_ifwork >=", value, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkLessThan(Integer value) {
            addCriterion("e_ifwork <", value, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkLessThanOrEqualTo(Integer value) {
            addCriterion("e_ifwork <=", value, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkIn(List<Integer> values) {
            addCriterion("e_ifwork in", values, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkNotIn(List<Integer> values) {
            addCriterion("e_ifwork not in", values, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkBetween(Integer value1, Integer value2) {
            addCriterion("e_ifwork between", value1, value2, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEIfworkNotBetween(Integer value1, Integer value2) {
            addCriterion("e_ifwork not between", value1, value2, "eIfwork");
            return (Criteria) this;
        }

        public Criteria andEBeginIsNull() {
            addCriterion("e_begin is null");
            return (Criteria) this;
        }

        public Criteria andEBeginIsNotNull() {
            addCriterion("e_begin is not null");
            return (Criteria) this;
        }

        public Criteria andEBeginEqualTo(Date value) {
            addCriterionForJDBCDate("e_begin =", value, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("e_begin <>", value, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("e_begin >", value, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("e_begin >=", value, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginLessThan(Date value) {
            addCriterionForJDBCDate("e_begin <", value, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("e_begin <=", value, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginIn(List<Date> values) {
            addCriterionForJDBCDate("e_begin in", values, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("e_begin not in", values, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("e_begin between", value1, value2, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("e_begin not between", value1, value2, "eBegin");
            return (Criteria) this;
        }

        public Criteria andEEduIsNull() {
            addCriterion("e_edu is null");
            return (Criteria) this;
        }

        public Criteria andEEduIsNotNull() {
            addCriterion("e_edu is not null");
            return (Criteria) this;
        }

        public Criteria andEEduEqualTo(String value) {
            addCriterion("e_edu =", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduNotEqualTo(String value) {
            addCriterion("e_edu <>", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduGreaterThan(String value) {
            addCriterion("e_edu >", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduGreaterThanOrEqualTo(String value) {
            addCriterion("e_edu >=", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduLessThan(String value) {
            addCriterion("e_edu <", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduLessThanOrEqualTo(String value) {
            addCriterion("e_edu <=", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduLike(String value) {
            addCriterion("e_edu like", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduNotLike(String value) {
            addCriterion("e_edu not like", value, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduIn(List<String> values) {
            addCriterion("e_edu in", values, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduNotIn(List<String> values) {
            addCriterion("e_edu not in", values, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduBetween(String value1, String value2) {
            addCriterion("e_edu between", value1, value2, "eEdu");
            return (Criteria) this;
        }

        public Criteria andEEduNotBetween(String value1, String value2) {
            addCriterion("e_edu not between", value1, value2, "eEdu");
            return (Criteria) this;
        }

        public Criteria andENumberIsNull() {
            addCriterion("e_number is null");
            return (Criteria) this;
        }

        public Criteria andENumberIsNotNull() {
            addCriterion("e_number is not null");
            return (Criteria) this;
        }

        public Criteria andENumberEqualTo(String value) {
            addCriterion("e_number =", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotEqualTo(String value) {
            addCriterion("e_number <>", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberGreaterThan(String value) {
            addCriterion("e_number >", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberGreaterThanOrEqualTo(String value) {
            addCriterion("e_number >=", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberLessThan(String value) {
            addCriterion("e_number <", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberLessThanOrEqualTo(String value) {
            addCriterion("e_number <=", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberLike(String value) {
            addCriterion("e_number like", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotLike(String value) {
            addCriterion("e_number not like", value, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberIn(List<String> values) {
            addCriterion("e_number in", values, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotIn(List<String> values) {
            addCriterion("e_number not in", values, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberBetween(String value1, String value2) {
            addCriterion("e_number between", value1, value2, "eNumber");
            return (Criteria) this;
        }

        public Criteria andENumberNotBetween(String value1, String value2) {
            addCriterion("e_number not between", value1, value2, "eNumber");
            return (Criteria) this;
        }

        public Criteria andEAddressIsNull() {
            addCriterion("e_address is null");
            return (Criteria) this;
        }

        public Criteria andEAddressIsNotNull() {
            addCriterion("e_address is not null");
            return (Criteria) this;
        }

        public Criteria andEAddressEqualTo(String value) {
            addCriterion("e_address =", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotEqualTo(String value) {
            addCriterion("e_address <>", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressGreaterThan(String value) {
            addCriterion("e_address >", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressGreaterThanOrEqualTo(String value) {
            addCriterion("e_address >=", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressLessThan(String value) {
            addCriterion("e_address <", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressLessThanOrEqualTo(String value) {
            addCriterion("e_address <=", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressLike(String value) {
            addCriterion("e_address like", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotLike(String value) {
            addCriterion("e_address not like", value, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressIn(List<String> values) {
            addCriterion("e_address in", values, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotIn(List<String> values) {
            addCriterion("e_address not in", values, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressBetween(String value1, String value2) {
            addCriterion("e_address between", value1, value2, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEAddressNotBetween(String value1, String value2) {
            addCriterion("e_address not between", value1, value2, "eAddress");
            return (Criteria) this;
        }

        public Criteria andEImageIsNull() {
            addCriterion("e_image is null");
            return (Criteria) this;
        }

        public Criteria andEImageIsNotNull() {
            addCriterion("e_image is not null");
            return (Criteria) this;
        }

        public Criteria andEImageEqualTo(String value) {
            addCriterion("e_image =", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageNotEqualTo(String value) {
            addCriterion("e_image <>", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageGreaterThan(String value) {
            addCriterion("e_image >", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageGreaterThanOrEqualTo(String value) {
            addCriterion("e_image >=", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageLessThan(String value) {
            addCriterion("e_image <", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageLessThanOrEqualTo(String value) {
            addCriterion("e_image <=", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageLike(String value) {
            addCriterion("e_image like", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageNotLike(String value) {
            addCriterion("e_image not like", value, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageIn(List<String> values) {
            addCriterion("e_image in", values, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageNotIn(List<String> values) {
            addCriterion("e_image not in", values, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageBetween(String value1, String value2) {
            addCriterion("e_image between", value1, value2, "eImage");
            return (Criteria) this;
        }

        public Criteria andEImageNotBetween(String value1, String value2) {
            addCriterion("e_image not between", value1, value2, "eImage");
            return (Criteria) this;
        }

        public Criteria andEEmailIsNull() {
            addCriterion("e_email is null");
            return (Criteria) this;
        }

        public Criteria andEEmailIsNotNull() {
            addCriterion("e_email is not null");
            return (Criteria) this;
        }

        public Criteria andEEmailEqualTo(String value) {
            addCriterion("e_email =", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotEqualTo(String value) {
            addCriterion("e_email <>", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailGreaterThan(String value) {
            addCriterion("e_email >", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailGreaterThanOrEqualTo(String value) {
            addCriterion("e_email >=", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLessThan(String value) {
            addCriterion("e_email <", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLessThanOrEqualTo(String value) {
            addCriterion("e_email <=", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLike(String value) {
            addCriterion("e_email like", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotLike(String value) {
            addCriterion("e_email not like", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailIn(List<String> values) {
            addCriterion("e_email in", values, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotIn(List<String> values) {
            addCriterion("e_email not in", values, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailBetween(String value1, String value2) {
            addCriterion("e_email between", value1, value2, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotBetween(String value1, String value2) {
            addCriterion("e_email not between", value1, value2, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEPoliticalIsNull() {
            addCriterion("e_political is null");
            return (Criteria) this;
        }

        public Criteria andEPoliticalIsNotNull() {
            addCriterion("e_political is not null");
            return (Criteria) this;
        }

        public Criteria andEPoliticalEqualTo(String value) {
            addCriterion("e_political =", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalNotEqualTo(String value) {
            addCriterion("e_political <>", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalGreaterThan(String value) {
            addCriterion("e_political >", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("e_political >=", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalLessThan(String value) {
            addCriterion("e_political <", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalLessThanOrEqualTo(String value) {
            addCriterion("e_political <=", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalLike(String value) {
            addCriterion("e_political like", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalNotLike(String value) {
            addCriterion("e_political not like", value, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalIn(List<String> values) {
            addCriterion("e_political in", values, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalNotIn(List<String> values) {
            addCriterion("e_political not in", values, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalBetween(String value1, String value2) {
            addCriterion("e_political between", value1, value2, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEPoliticalNotBetween(String value1, String value2) {
            addCriterion("e_political not between", value1, value2, "ePolitical");
            return (Criteria) this;
        }

        public Criteria andEIftalentIsNull() {
            addCriterion("e_iftalent is null");
            return (Criteria) this;
        }

        public Criteria andEIftalentIsNotNull() {
            addCriterion("e_iftalent is not null");
            return (Criteria) this;
        }

        public Criteria andEIftalentEqualTo(Integer value) {
            addCriterion("e_iftalent =", value, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentNotEqualTo(Integer value) {
            addCriterion("e_iftalent <>", value, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentGreaterThan(Integer value) {
            addCriterion("e_iftalent >", value, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_iftalent >=", value, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentLessThan(Integer value) {
            addCriterion("e_iftalent <", value, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentLessThanOrEqualTo(Integer value) {
            addCriterion("e_iftalent <=", value, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentIn(List<Integer> values) {
            addCriterion("e_iftalent in", values, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentNotIn(List<Integer> values) {
            addCriterion("e_iftalent not in", values, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentBetween(Integer value1, Integer value2) {
            addCriterion("e_iftalent between", value1, value2, "eIftalent");
            return (Criteria) this;
        }

        public Criteria andEIftalentNotBetween(Integer value1, Integer value2) {
            addCriterion("e_iftalent not between", value1, value2, "eIftalent");
            return (Criteria) this;
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