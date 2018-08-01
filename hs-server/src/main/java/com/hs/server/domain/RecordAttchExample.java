package com.hs.server.domain;

import java.util.ArrayList;
import java.util.List;

public class RecordAttchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordAttchExample() {
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

        public Criteria andRecordAttchIdIsNull() {
            addCriterion("RECORD_ATTCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdIsNotNull() {
            addCriterion("RECORD_ATTCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdEqualTo(String value) {
            addCriterion("RECORD_ATTCH_ID =", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdNotEqualTo(String value) {
            addCriterion("RECORD_ATTCH_ID <>", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdGreaterThan(String value) {
            addCriterion("RECORD_ATTCH_ID >", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_ATTCH_ID >=", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdLessThan(String value) {
            addCriterion("RECORD_ATTCH_ID <", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdLessThanOrEqualTo(String value) {
            addCriterion("RECORD_ATTCH_ID <=", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdLike(String value) {
            addCriterion("RECORD_ATTCH_ID like", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdNotLike(String value) {
            addCriterion("RECORD_ATTCH_ID not like", value, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdIn(List<String> values) {
            addCriterion("RECORD_ATTCH_ID in", values, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdNotIn(List<String> values) {
            addCriterion("RECORD_ATTCH_ID not in", values, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdBetween(String value1, String value2) {
            addCriterion("RECORD_ATTCH_ID between", value1, value2, "recordAttchId");
            return (Criteria) this;
        }

        public Criteria andRecordAttchIdNotBetween(String value1, String value2) {
            addCriterion("RECORD_ATTCH_ID not between", value1, value2, "recordAttchId");
            return (Criteria) this;
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

        public Criteria andRecordAttchTypeIsNull() {
            addCriterion("RECORD_ATTCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeIsNotNull() {
            addCriterion("RECORD_ATTCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeEqualTo(String value) {
            addCriterion("RECORD_ATTCH_TYPE =", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeNotEqualTo(String value) {
            addCriterion("RECORD_ATTCH_TYPE <>", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeGreaterThan(String value) {
            addCriterion("RECORD_ATTCH_TYPE >", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_ATTCH_TYPE >=", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeLessThan(String value) {
            addCriterion("RECORD_ATTCH_TYPE <", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeLessThanOrEqualTo(String value) {
            addCriterion("RECORD_ATTCH_TYPE <=", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeLike(String value) {
            addCriterion("RECORD_ATTCH_TYPE like", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeNotLike(String value) {
            addCriterion("RECORD_ATTCH_TYPE not like", value, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeIn(List<String> values) {
            addCriterion("RECORD_ATTCH_TYPE in", values, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeNotIn(List<String> values) {
            addCriterion("RECORD_ATTCH_TYPE not in", values, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeBetween(String value1, String value2) {
            addCriterion("RECORD_ATTCH_TYPE between", value1, value2, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andRecordAttchTypeNotBetween(String value1, String value2) {
            addCriterion("RECORD_ATTCH_TYPE not between", value1, value2, "recordAttchType");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Long value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Long value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Long value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Long value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Long value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Long> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Long> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Long value1, Long value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Long value1, Long value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
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