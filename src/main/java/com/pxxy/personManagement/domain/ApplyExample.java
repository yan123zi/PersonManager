package com.pxxy.personManagement.domain;

import java.util.ArrayList;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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

        public Criteria andApNameIsNull() {
            addCriterion("ap_name is null");
            return (Criteria) this;
        }

        public Criteria andApNameIsNotNull() {
            addCriterion("ap_name is not null");
            return (Criteria) this;
        }

        public Criteria andApNameEqualTo(String value) {
            addCriterion("ap_name =", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameNotEqualTo(String value) {
            addCriterion("ap_name <>", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameGreaterThan(String value) {
            addCriterion("ap_name >", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameGreaterThanOrEqualTo(String value) {
            addCriterion("ap_name >=", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameLessThan(String value) {
            addCriterion("ap_name <", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameLessThanOrEqualTo(String value) {
            addCriterion("ap_name <=", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameLike(String value) {
            addCriterion("ap_name like", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameNotLike(String value) {
            addCriterion("ap_name not like", value, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameIn(List<String> values) {
            addCriterion("ap_name in", values, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameNotIn(List<String> values) {
            addCriterion("ap_name not in", values, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameBetween(String value1, String value2) {
            addCriterion("ap_name between", value1, value2, "apName");
            return (Criteria) this;
        }

        public Criteria andApNameNotBetween(String value1, String value2) {
            addCriterion("ap_name not between", value1, value2, "apName");
            return (Criteria) this;
        }

        public Criteria andApAgeIsNull() {
            addCriterion("ap_age is null");
            return (Criteria) this;
        }

        public Criteria andApAgeIsNotNull() {
            addCriterion("ap_age is not null");
            return (Criteria) this;
        }

        public Criteria andApAgeEqualTo(String value) {
            addCriterion("ap_age =", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeNotEqualTo(String value) {
            addCriterion("ap_age <>", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeGreaterThan(String value) {
            addCriterion("ap_age >", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeGreaterThanOrEqualTo(String value) {
            addCriterion("ap_age >=", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeLessThan(String value) {
            addCriterion("ap_age <", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeLessThanOrEqualTo(String value) {
            addCriterion("ap_age <=", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeLike(String value) {
            addCriterion("ap_age like", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeNotLike(String value) {
            addCriterion("ap_age not like", value, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeIn(List<String> values) {
            addCriterion("ap_age in", values, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeNotIn(List<String> values) {
            addCriterion("ap_age not in", values, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeBetween(String value1, String value2) {
            addCriterion("ap_age between", value1, value2, "apAge");
            return (Criteria) this;
        }

        public Criteria andApAgeNotBetween(String value1, String value2) {
            addCriterion("ap_age not between", value1, value2, "apAge");
            return (Criteria) this;
        }

        public Criteria andApGenderIsNull() {
            addCriterion("ap_gender is null");
            return (Criteria) this;
        }

        public Criteria andApGenderIsNotNull() {
            addCriterion("ap_gender is not null");
            return (Criteria) this;
        }

        public Criteria andApGenderEqualTo(String value) {
            addCriterion("ap_gender =", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderNotEqualTo(String value) {
            addCriterion("ap_gender <>", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderGreaterThan(String value) {
            addCriterion("ap_gender >", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderGreaterThanOrEqualTo(String value) {
            addCriterion("ap_gender >=", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderLessThan(String value) {
            addCriterion("ap_gender <", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderLessThanOrEqualTo(String value) {
            addCriterion("ap_gender <=", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderLike(String value) {
            addCriterion("ap_gender like", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderNotLike(String value) {
            addCriterion("ap_gender not like", value, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderIn(List<String> values) {
            addCriterion("ap_gender in", values, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderNotIn(List<String> values) {
            addCriterion("ap_gender not in", values, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderBetween(String value1, String value2) {
            addCriterion("ap_gender between", value1, value2, "apGender");
            return (Criteria) this;
        }

        public Criteria andApGenderNotBetween(String value1, String value2) {
            addCriterion("ap_gender not between", value1, value2, "apGender");
            return (Criteria) this;
        }

        public Criteria andApEduIsNull() {
            addCriterion("ap_edu is null");
            return (Criteria) this;
        }

        public Criteria andApEduIsNotNull() {
            addCriterion("ap_edu is not null");
            return (Criteria) this;
        }

        public Criteria andApEduEqualTo(String value) {
            addCriterion("ap_edu =", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduNotEqualTo(String value) {
            addCriterion("ap_edu <>", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduGreaterThan(String value) {
            addCriterion("ap_edu >", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduGreaterThanOrEqualTo(String value) {
            addCriterion("ap_edu >=", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduLessThan(String value) {
            addCriterion("ap_edu <", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduLessThanOrEqualTo(String value) {
            addCriterion("ap_edu <=", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduLike(String value) {
            addCriterion("ap_edu like", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduNotLike(String value) {
            addCriterion("ap_edu not like", value, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduIn(List<String> values) {
            addCriterion("ap_edu in", values, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduNotIn(List<String> values) {
            addCriterion("ap_edu not in", values, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduBetween(String value1, String value2) {
            addCriterion("ap_edu between", value1, value2, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApEduNotBetween(String value1, String value2) {
            addCriterion("ap_edu not between", value1, value2, "apEdu");
            return (Criteria) this;
        }

        public Criteria andApPhoneIsNull() {
            addCriterion("ap_phone is null");
            return (Criteria) this;
        }

        public Criteria andApPhoneIsNotNull() {
            addCriterion("ap_phone is not null");
            return (Criteria) this;
        }

        public Criteria andApPhoneEqualTo(String value) {
            addCriterion("ap_phone =", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneNotEqualTo(String value) {
            addCriterion("ap_phone <>", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneGreaterThan(String value) {
            addCriterion("ap_phone >", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ap_phone >=", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneLessThan(String value) {
            addCriterion("ap_phone <", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneLessThanOrEqualTo(String value) {
            addCriterion("ap_phone <=", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneLike(String value) {
            addCriterion("ap_phone like", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneNotLike(String value) {
            addCriterion("ap_phone not like", value, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneIn(List<String> values) {
            addCriterion("ap_phone in", values, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneNotIn(List<String> values) {
            addCriterion("ap_phone not in", values, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneBetween(String value1, String value2) {
            addCriterion("ap_phone between", value1, value2, "apPhone");
            return (Criteria) this;
        }

        public Criteria andApPhoneNotBetween(String value1, String value2) {
            addCriterion("ap_phone not between", value1, value2, "apPhone");
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

        public Criteria andApResumeIsNull() {
            addCriterion("ap_resume is null");
            return (Criteria) this;
        }

        public Criteria andApResumeIsNotNull() {
            addCriterion("ap_resume is not null");
            return (Criteria) this;
        }

        public Criteria andApResumeEqualTo(String value) {
            addCriterion("ap_resume =", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeNotEqualTo(String value) {
            addCriterion("ap_resume <>", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeGreaterThan(String value) {
            addCriterion("ap_resume >", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeGreaterThanOrEqualTo(String value) {
            addCriterion("ap_resume >=", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeLessThan(String value) {
            addCriterion("ap_resume <", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeLessThanOrEqualTo(String value) {
            addCriterion("ap_resume <=", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeLike(String value) {
            addCriterion("ap_resume like", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeNotLike(String value) {
            addCriterion("ap_resume not like", value, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeIn(List<String> values) {
            addCriterion("ap_resume in", values, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeNotIn(List<String> values) {
            addCriterion("ap_resume not in", values, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeBetween(String value1, String value2) {
            addCriterion("ap_resume between", value1, value2, "apResume");
            return (Criteria) this;
        }

        public Criteria andApResumeNotBetween(String value1, String value2) {
            addCriterion("ap_resume not between", value1, value2, "apResume");
            return (Criteria) this;
        }

        public Criteria andIScheIsNull() {
            addCriterion("i_sche is null");
            return (Criteria) this;
        }

        public Criteria andIScheIsNotNull() {
            addCriterion("i_sche is not null");
            return (Criteria) this;
        }

        public Criteria andIScheEqualTo(Integer value) {
            addCriterion("i_sche =", value, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheNotEqualTo(Integer value) {
            addCriterion("i_sche <>", value, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheGreaterThan(Integer value) {
            addCriterion("i_sche >", value, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_sche >=", value, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheLessThan(Integer value) {
            addCriterion("i_sche <", value, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheLessThanOrEqualTo(Integer value) {
            addCriterion("i_sche <=", value, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheIn(List<Integer> values) {
            addCriterion("i_sche in", values, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheNotIn(List<Integer> values) {
            addCriterion("i_sche not in", values, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheBetween(Integer value1, Integer value2) {
            addCriterion("i_sche between", value1, value2, "iSche");
            return (Criteria) this;
        }

        public Criteria andIScheNotBetween(Integer value1, Integer value2) {
            addCriterion("i_sche not between", value1, value2, "iSche");
            return (Criteria) this;
        }

        public Criteria andApNumberIsNull() {
            addCriterion("ap_number is null");
            return (Criteria) this;
        }

        public Criteria andApNumberIsNotNull() {
            addCriterion("ap_number is not null");
            return (Criteria) this;
        }

        public Criteria andApNumberEqualTo(String value) {
            addCriterion("ap_number =", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberNotEqualTo(String value) {
            addCriterion("ap_number <>", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberGreaterThan(String value) {
            addCriterion("ap_number >", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ap_number >=", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberLessThan(String value) {
            addCriterion("ap_number <", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberLessThanOrEqualTo(String value) {
            addCriterion("ap_number <=", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberLike(String value) {
            addCriterion("ap_number like", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberNotLike(String value) {
            addCriterion("ap_number not like", value, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberIn(List<String> values) {
            addCriterion("ap_number in", values, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberNotIn(List<String> values) {
            addCriterion("ap_number not in", values, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberBetween(String value1, String value2) {
            addCriterion("ap_number between", value1, value2, "apNumber");
            return (Criteria) this;
        }

        public Criteria andApNumberNotBetween(String value1, String value2) {
            addCriterion("ap_number not between", value1, value2, "apNumber");
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