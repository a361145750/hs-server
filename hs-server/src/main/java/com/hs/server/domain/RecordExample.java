package com.hs.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(String value) {
            addCriterion("RECORD_ID =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(String value) {
            addCriterion("RECORD_ID <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(String value) {
            addCriterion("RECORD_ID >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_ID >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(String value) {
            addCriterion("RECORD_ID <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(String value) {
            addCriterion("RECORD_ID <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLike(String value) {
            addCriterion("RECORD_ID like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotLike(String value) {
            addCriterion("RECORD_ID not like", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<String> values) {
            addCriterion("RECORD_ID in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<String> values) {
            addCriterion("RECORD_ID not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(String value1, String value2) {
            addCriterion("RECORD_ID between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(String value1, String value2) {
            addCriterion("RECORD_ID not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andOprateDateIsNull() {
            addCriterion("OPRATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOprateDateIsNotNull() {
            addCriterion("OPRATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOprateDateEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATE_DATE =", value, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATE_DATE <>", value, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("OPRATE_DATE >", value, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATE_DATE >=", value, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateLessThan(Date value) {
            addCriterionForJDBCDate("OPRATE_DATE <", value, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPRATE_DATE <=", value, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateIn(List<Date> values) {
            addCriterionForJDBCDate("OPRATE_DATE in", values, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPRATE_DATE not in", values, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPRATE_DATE between", value1, value2, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andOprateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPRATE_DATE not between", value1, value2, "oprateDate");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDisinerIdIsNull() {
            addCriterion("DISINER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDisinerIdIsNotNull() {
            addCriterion("DISINER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDisinerIdEqualTo(String value) {
            addCriterion("DISINER_ID =", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdNotEqualTo(String value) {
            addCriterion("DISINER_ID <>", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdGreaterThan(String value) {
            addCriterion("DISINER_ID >", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdGreaterThanOrEqualTo(String value) {
            addCriterion("DISINER_ID >=", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdLessThan(String value) {
            addCriterion("DISINER_ID <", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdLessThanOrEqualTo(String value) {
            addCriterion("DISINER_ID <=", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdLike(String value) {
            addCriterion("DISINER_ID like", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdNotLike(String value) {
            addCriterion("DISINER_ID not like", value, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdIn(List<String> values) {
            addCriterion("DISINER_ID in", values, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdNotIn(List<String> values) {
            addCriterion("DISINER_ID not in", values, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdBetween(String value1, String value2) {
            addCriterion("DISINER_ID between", value1, value2, "disinerId");
            return (Criteria) this;
        }

        public Criteria andDisinerIdNotBetween(String value1, String value2) {
            addCriterion("DISINER_ID not between", value1, value2, "disinerId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNull() {
            addCriterion("CUSTOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNotNull() {
            addCriterion("CUSTOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdEqualTo(String value) {
            addCriterion("CUSTOM_ID =", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotEqualTo(String value) {
            addCriterion("CUSTOM_ID <>", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThan(String value) {
            addCriterion("CUSTOM_ID >", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID >=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThan(String value) {
            addCriterion("CUSTOM_ID <", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID <=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLike(String value) {
            addCriterion("CUSTOM_ID like", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotLike(String value) {
            addCriterion("CUSTOM_ID not like", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIn(List<String> values) {
            addCriterion("CUSTOM_ID in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotIn(List<String> values) {
            addCriterion("CUSTOM_ID not in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID not between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(String value) {
            addCriterion("TOTAL_FEE =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(String value) {
            addCriterion("TOTAL_FEE <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(String value) {
            addCriterion("TOTAL_FEE >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_FEE >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(String value) {
            addCriterion("TOTAL_FEE <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_FEE <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLike(String value) {
            addCriterion("TOTAL_FEE like", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotLike(String value) {
            addCriterion("TOTAL_FEE not like", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<String> values) {
            addCriterion("TOTAL_FEE in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<String> values) {
            addCriterion("TOTAL_FEE not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(String value1, String value2) {
            addCriterion("TOTAL_FEE between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(String value1, String value2) {
            addCriterion("TOTAL_FEE not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andDisinTypeIsNull() {
            addCriterion("DISIN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDisinTypeIsNotNull() {
            addCriterion("DISIN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDisinTypeEqualTo(String value) {
            addCriterion("DISIN_TYPE =", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeNotEqualTo(String value) {
            addCriterion("DISIN_TYPE <>", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeGreaterThan(String value) {
            addCriterion("DISIN_TYPE >", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DISIN_TYPE >=", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeLessThan(String value) {
            addCriterion("DISIN_TYPE <", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeLessThanOrEqualTo(String value) {
            addCriterion("DISIN_TYPE <=", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeLike(String value) {
            addCriterion("DISIN_TYPE like", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeNotLike(String value) {
            addCriterion("DISIN_TYPE not like", value, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeIn(List<String> values) {
            addCriterion("DISIN_TYPE in", values, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeNotIn(List<String> values) {
            addCriterion("DISIN_TYPE not in", values, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeBetween(String value1, String value2) {
            addCriterion("DISIN_TYPE between", value1, value2, "disinType");
            return (Criteria) this;
        }

        public Criteria andDisinTypeNotBetween(String value1, String value2) {
            addCriterion("DISIN_TYPE not between", value1, value2, "disinType");
            return (Criteria) this;
        }

        public Criteria andHairLevelIsNull() {
            addCriterion("HAIR_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andHairLevelIsNotNull() {
            addCriterion("HAIR_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andHairLevelEqualTo(String value) {
            addCriterion("HAIR_LEVEL =", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelNotEqualTo(String value) {
            addCriterion("HAIR_LEVEL <>", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelGreaterThan(String value) {
            addCriterion("HAIR_LEVEL >", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_LEVEL >=", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelLessThan(String value) {
            addCriterion("HAIR_LEVEL <", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelLessThanOrEqualTo(String value) {
            addCriterion("HAIR_LEVEL <=", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelLike(String value) {
            addCriterion("HAIR_LEVEL like", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelNotLike(String value) {
            addCriterion("HAIR_LEVEL not like", value, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelIn(List<String> values) {
            addCriterion("HAIR_LEVEL in", values, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelNotIn(List<String> values) {
            addCriterion("HAIR_LEVEL not in", values, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelBetween(String value1, String value2) {
            addCriterion("HAIR_LEVEL between", value1, value2, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLevelNotBetween(String value1, String value2) {
            addCriterion("HAIR_LEVEL not between", value1, value2, "hairLevel");
            return (Criteria) this;
        }

        public Criteria andHairLengthIsNull() {
            addCriterion("HAIR_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andHairLengthIsNotNull() {
            addCriterion("HAIR_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andHairLengthEqualTo(String value) {
            addCriterion("HAIR_LENGTH =", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthNotEqualTo(String value) {
            addCriterion("HAIR_LENGTH <>", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthGreaterThan(String value) {
            addCriterion("HAIR_LENGTH >", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_LENGTH >=", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthLessThan(String value) {
            addCriterion("HAIR_LENGTH <", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthLessThanOrEqualTo(String value) {
            addCriterion("HAIR_LENGTH <=", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthLike(String value) {
            addCriterion("HAIR_LENGTH like", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthNotLike(String value) {
            addCriterion("HAIR_LENGTH not like", value, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthIn(List<String> values) {
            addCriterion("HAIR_LENGTH in", values, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthNotIn(List<String> values) {
            addCriterion("HAIR_LENGTH not in", values, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthBetween(String value1, String value2) {
            addCriterion("HAIR_LENGTH between", value1, value2, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairLengthNotBetween(String value1, String value2) {
            addCriterion("HAIR_LENGTH not between", value1, value2, "hairLength");
            return (Criteria) this;
        }

        public Criteria andHairBarIsNull() {
            addCriterion("HAIR_BAR is null");
            return (Criteria) this;
        }

        public Criteria andHairBarIsNotNull() {
            addCriterion("HAIR_BAR is not null");
            return (Criteria) this;
        }

        public Criteria andHairBarEqualTo(String value) {
            addCriterion("HAIR_BAR =", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarNotEqualTo(String value) {
            addCriterion("HAIR_BAR <>", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarGreaterThan(String value) {
            addCriterion("HAIR_BAR >", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_BAR >=", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarLessThan(String value) {
            addCriterion("HAIR_BAR <", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarLessThanOrEqualTo(String value) {
            addCriterion("HAIR_BAR <=", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarLike(String value) {
            addCriterion("HAIR_BAR like", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarNotLike(String value) {
            addCriterion("HAIR_BAR not like", value, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarIn(List<String> values) {
            addCriterion("HAIR_BAR in", values, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarNotIn(List<String> values) {
            addCriterion("HAIR_BAR not in", values, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarBetween(String value1, String value2) {
            addCriterion("HAIR_BAR between", value1, value2, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairBarNotBetween(String value1, String value2) {
            addCriterion("HAIR_BAR not between", value1, value2, "hairBar");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandIsNull() {
            addCriterion("HAIR_PERM_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandIsNotNull() {
            addCriterion("HAIR_PERM_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandEqualTo(String value) {
            addCriterion("HAIR_PERM_BRAND =", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandNotEqualTo(String value) {
            addCriterion("HAIR_PERM_BRAND <>", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandGreaterThan(String value) {
            addCriterion("HAIR_PERM_BRAND >", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_PERM_BRAND >=", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandLessThan(String value) {
            addCriterion("HAIR_PERM_BRAND <", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandLessThanOrEqualTo(String value) {
            addCriterion("HAIR_PERM_BRAND <=", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandLike(String value) {
            addCriterion("HAIR_PERM_BRAND like", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandNotLike(String value) {
            addCriterion("HAIR_PERM_BRAND not like", value, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandIn(List<String> values) {
            addCriterion("HAIR_PERM_BRAND in", values, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandNotIn(List<String> values) {
            addCriterion("HAIR_PERM_BRAND not in", values, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandBetween(String value1, String value2) {
            addCriterion("HAIR_PERM_BRAND between", value1, value2, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairPermBrandNotBetween(String value1, String value2) {
            addCriterion("HAIR_PERM_BRAND not between", value1, value2, "hairPermBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandIsNull() {
            addCriterion("HAIR_DYE_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandIsNotNull() {
            addCriterion("HAIR_DYE_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandEqualTo(String value) {
            addCriterion("HAIR_DYE_BRAND =", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandNotEqualTo(String value) {
            addCriterion("HAIR_DYE_BRAND <>", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandGreaterThan(String value) {
            addCriterion("HAIR_DYE_BRAND >", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_DYE_BRAND >=", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandLessThan(String value) {
            addCriterion("HAIR_DYE_BRAND <", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandLessThanOrEqualTo(String value) {
            addCriterion("HAIR_DYE_BRAND <=", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandLike(String value) {
            addCriterion("HAIR_DYE_BRAND like", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandNotLike(String value) {
            addCriterion("HAIR_DYE_BRAND not like", value, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandIn(List<String> values) {
            addCriterion("HAIR_DYE_BRAND in", values, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandNotIn(List<String> values) {
            addCriterion("HAIR_DYE_BRAND not in", values, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandBetween(String value1, String value2) {
            addCriterion("HAIR_DYE_BRAND between", value1, value2, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairDyeBrandNotBetween(String value1, String value2) {
            addCriterion("HAIR_DYE_BRAND not between", value1, value2, "hairDyeBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandIsNull() {
            addCriterion("HAIR_CAIR_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandIsNotNull() {
            addCriterion("HAIR_CAIR_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandEqualTo(String value) {
            addCriterion("HAIR_CAIR_BRAND =", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandNotEqualTo(String value) {
            addCriterion("HAIR_CAIR_BRAND <>", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandGreaterThan(String value) {
            addCriterion("HAIR_CAIR_BRAND >", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_CAIR_BRAND >=", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandLessThan(String value) {
            addCriterion("HAIR_CAIR_BRAND <", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandLessThanOrEqualTo(String value) {
            addCriterion("HAIR_CAIR_BRAND <=", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandLike(String value) {
            addCriterion("HAIR_CAIR_BRAND like", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandNotLike(String value) {
            addCriterion("HAIR_CAIR_BRAND not like", value, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandIn(List<String> values) {
            addCriterion("HAIR_CAIR_BRAND in", values, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandNotIn(List<String> values) {
            addCriterion("HAIR_CAIR_BRAND not in", values, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandBetween(String value1, String value2) {
            addCriterion("HAIR_CAIR_BRAND between", value1, value2, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairCairBrandNotBetween(String value1, String value2) {
            addCriterion("HAIR_CAIR_BRAND not between", value1, value2, "hairCairBrand");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsIsNull() {
            addCriterion("HAIR_HATE_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsIsNotNull() {
            addCriterion("HAIR_HATE_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsEqualTo(String value) {
            addCriterion("HAIR_HATE_ITEMS =", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsNotEqualTo(String value) {
            addCriterion("HAIR_HATE_ITEMS <>", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsGreaterThan(String value) {
            addCriterion("HAIR_HATE_ITEMS >", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_HATE_ITEMS >=", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsLessThan(String value) {
            addCriterion("HAIR_HATE_ITEMS <", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsLessThanOrEqualTo(String value) {
            addCriterion("HAIR_HATE_ITEMS <=", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsLike(String value) {
            addCriterion("HAIR_HATE_ITEMS like", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsNotLike(String value) {
            addCriterion("HAIR_HATE_ITEMS not like", value, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsIn(List<String> values) {
            addCriterion("HAIR_HATE_ITEMS in", values, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsNotIn(List<String> values) {
            addCriterion("HAIR_HATE_ITEMS not in", values, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsBetween(String value1, String value2) {
            addCriterion("HAIR_HATE_ITEMS between", value1, value2, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andHairHateItemsNotBetween(String value1, String value2) {
            addCriterion("HAIR_HATE_ITEMS not between", value1, value2, "hairHateItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsIsNull() {
            addCriterion("CUSTOM_REQUIRE_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsIsNotNull() {
            addCriterion("CUSTOM_REQUIRE_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsEqualTo(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS =", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsNotEqualTo(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS <>", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsGreaterThan(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS >", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS >=", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsLessThan(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS <", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS <=", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsLike(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS like", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsNotLike(String value) {
            addCriterion("CUSTOM_REQUIRE_ITEMS not like", value, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsIn(List<String> values) {
            addCriterion("CUSTOM_REQUIRE_ITEMS in", values, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsNotIn(List<String> values) {
            addCriterion("CUSTOM_REQUIRE_ITEMS not in", values, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsBetween(String value1, String value2) {
            addCriterion("CUSTOM_REQUIRE_ITEMS between", value1, value2, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andCustomRequireItemsNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_REQUIRE_ITEMS not between", value1, value2, "customRequireItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsIsNull() {
            addCriterion("OPRATE_NOTICE_ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsIsNotNull() {
            addCriterion("OPRATE_NOTICE_ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsEqualTo(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS =", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsNotEqualTo(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS <>", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsGreaterThan(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS >", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsGreaterThanOrEqualTo(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS >=", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsLessThan(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS <", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsLessThanOrEqualTo(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS <=", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsLike(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS like", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsNotLike(String value) {
            addCriterion("OPRATE_NOTICE_ITEMS not like", value, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsIn(List<String> values) {
            addCriterion("OPRATE_NOTICE_ITEMS in", values, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsNotIn(List<String> values) {
            addCriterion("OPRATE_NOTICE_ITEMS not in", values, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsBetween(String value1, String value2) {
            addCriterion("OPRATE_NOTICE_ITEMS between", value1, value2, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andOprateNoticeItemsNotBetween(String value1, String value2) {
            addCriterion("OPRATE_NOTICE_ITEMS not between", value1, value2, "oprateNoticeItems");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
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