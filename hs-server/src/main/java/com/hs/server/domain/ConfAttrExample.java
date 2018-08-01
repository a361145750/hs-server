package com.hs.server.domain;

import java.util.ArrayList;
import java.util.List;

public class ConfAttrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfAttrExample() {
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

        public Criteria andConfIdIsNull() {
            addCriterion("CONF_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfIdIsNotNull() {
            addCriterion("CONF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfIdEqualTo(String value) {
            addCriterion("CONF_ID =", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdNotEqualTo(String value) {
            addCriterion("CONF_ID <>", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdGreaterThan(String value) {
            addCriterion("CONF_ID >", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONF_ID >=", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdLessThan(String value) {
            addCriterion("CONF_ID <", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdLessThanOrEqualTo(String value) {
            addCriterion("CONF_ID <=", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdLike(String value) {
            addCriterion("CONF_ID like", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdNotLike(String value) {
            addCriterion("CONF_ID not like", value, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdIn(List<String> values) {
            addCriterion("CONF_ID in", values, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdNotIn(List<String> values) {
            addCriterion("CONF_ID not in", values, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdBetween(String value1, String value2) {
            addCriterion("CONF_ID between", value1, value2, "confId");
            return (Criteria) this;
        }

        public Criteria andConfIdNotBetween(String value1, String value2) {
            addCriterion("CONF_ID not between", value1, value2, "confId");
            return (Criteria) this;
        }

        public Criteria andConfCodeIsNull() {
            addCriterion("CONF_CODE is null");
            return (Criteria) this;
        }

        public Criteria andConfCodeIsNotNull() {
            addCriterion("CONF_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andConfCodeEqualTo(String value) {
            addCriterion("CONF_CODE =", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeNotEqualTo(String value) {
            addCriterion("CONF_CODE <>", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeGreaterThan(String value) {
            addCriterion("CONF_CODE >", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONF_CODE >=", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeLessThan(String value) {
            addCriterion("CONF_CODE <", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeLessThanOrEqualTo(String value) {
            addCriterion("CONF_CODE <=", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeLike(String value) {
            addCriterion("CONF_CODE like", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeNotLike(String value) {
            addCriterion("CONF_CODE not like", value, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeIn(List<String> values) {
            addCriterion("CONF_CODE in", values, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeNotIn(List<String> values) {
            addCriterion("CONF_CODE not in", values, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeBetween(String value1, String value2) {
            addCriterion("CONF_CODE between", value1, value2, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfCodeNotBetween(String value1, String value2) {
            addCriterion("CONF_CODE not between", value1, value2, "confCode");
            return (Criteria) this;
        }

        public Criteria andConfNameIsNull() {
            addCriterion("CONF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConfNameIsNotNull() {
            addCriterion("CONF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConfNameEqualTo(String value) {
            addCriterion("CONF_NAME =", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotEqualTo(String value) {
            addCriterion("CONF_NAME <>", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameGreaterThan(String value) {
            addCriterion("CONF_NAME >", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONF_NAME >=", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameLessThan(String value) {
            addCriterion("CONF_NAME <", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameLessThanOrEqualTo(String value) {
            addCriterion("CONF_NAME <=", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameLike(String value) {
            addCriterion("CONF_NAME like", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotLike(String value) {
            addCriterion("CONF_NAME not like", value, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameIn(List<String> values) {
            addCriterion("CONF_NAME in", values, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotIn(List<String> values) {
            addCriterion("CONF_NAME not in", values, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameBetween(String value1, String value2) {
            addCriterion("CONF_NAME between", value1, value2, "confName");
            return (Criteria) this;
        }

        public Criteria andConfNameNotBetween(String value1, String value2) {
            addCriterion("CONF_NAME not between", value1, value2, "confName");
            return (Criteria) this;
        }

        public Criteria andConfTypeIsNull() {
            addCriterion("CONF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConfTypeIsNotNull() {
            addCriterion("CONF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConfTypeEqualTo(String value) {
            addCriterion("CONF_TYPE =", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotEqualTo(String value) {
            addCriterion("CONF_TYPE <>", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeGreaterThan(String value) {
            addCriterion("CONF_TYPE >", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONF_TYPE >=", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeLessThan(String value) {
            addCriterion("CONF_TYPE <", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeLessThanOrEqualTo(String value) {
            addCriterion("CONF_TYPE <=", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeLike(String value) {
            addCriterion("CONF_TYPE like", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotLike(String value) {
            addCriterion("CONF_TYPE not like", value, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeIn(List<String> values) {
            addCriterion("CONF_TYPE in", values, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotIn(List<String> values) {
            addCriterion("CONF_TYPE not in", values, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeBetween(String value1, String value2) {
            addCriterion("CONF_TYPE between", value1, value2, "confType");
            return (Criteria) this;
        }

        public Criteria andConfTypeNotBetween(String value1, String value2) {
            addCriterion("CONF_TYPE not between", value1, value2, "confType");
            return (Criteria) this;
        }

        public Criteria andConfOrderIsNull() {
            addCriterion("CONF_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andConfOrderIsNotNull() {
            addCriterion("CONF_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andConfOrderEqualTo(String value) {
            addCriterion("CONF_ORDER =", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderNotEqualTo(String value) {
            addCriterion("CONF_ORDER <>", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderGreaterThan(String value) {
            addCriterion("CONF_ORDER >", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderGreaterThanOrEqualTo(String value) {
            addCriterion("CONF_ORDER >=", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderLessThan(String value) {
            addCriterion("CONF_ORDER <", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderLessThanOrEqualTo(String value) {
            addCriterion("CONF_ORDER <=", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderLike(String value) {
            addCriterion("CONF_ORDER like", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderNotLike(String value) {
            addCriterion("CONF_ORDER not like", value, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderIn(List<String> values) {
            addCriterion("CONF_ORDER in", values, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderNotIn(List<String> values) {
            addCriterion("CONF_ORDER not in", values, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderBetween(String value1, String value2) {
            addCriterion("CONF_ORDER between", value1, value2, "confOrder");
            return (Criteria) this;
        }

        public Criteria andConfOrderNotBetween(String value1, String value2) {
            addCriterion("CONF_ORDER not between", value1, value2, "confOrder");
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