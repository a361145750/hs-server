package com.hs.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIsNull() {
            addCriterion("USER_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIsNotNull() {
            addCriterion("USER_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEnEqualTo(String value) {
            addCriterion("USER_NAME_EN =", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotEqualTo(String value) {
            addCriterion("USER_NAME_EN <>", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnGreaterThan(String value) {
            addCriterion("USER_NAME_EN >", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_EN >=", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLessThan(String value) {
            addCriterion("USER_NAME_EN <", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_EN <=", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLike(String value) {
            addCriterion("USER_NAME_EN like", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotLike(String value) {
            addCriterion("USER_NAME_EN not like", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIn(List<String> values) {
            addCriterion("USER_NAME_EN in", values, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotIn(List<String> values) {
            addCriterion("USER_NAME_EN not in", values, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnBetween(String value1, String value2) {
            addCriterion("USER_NAME_EN between", value1, value2, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_EN not between", value1, value2, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("ADRESS =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("ADRESS <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("ADRESS >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("ADRESS >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("ADRESS <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("ADRESS <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("ADRESS like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("ADRESS not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("ADRESS in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("ADRESS not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("ADRESS between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("ADRESS not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andPreferIsNull() {
            addCriterion("PREFER is null");
            return (Criteria) this;
        }

        public Criteria andPreferIsNotNull() {
            addCriterion("PREFER is not null");
            return (Criteria) this;
        }

        public Criteria andPreferEqualTo(String value) {
            addCriterion("PREFER =", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferNotEqualTo(String value) {
            addCriterion("PREFER <>", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferGreaterThan(String value) {
            addCriterion("PREFER >", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferGreaterThanOrEqualTo(String value) {
            addCriterion("PREFER >=", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferLessThan(String value) {
            addCriterion("PREFER <", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferLessThanOrEqualTo(String value) {
            addCriterion("PREFER <=", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferLike(String value) {
            addCriterion("PREFER like", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferNotLike(String value) {
            addCriterion("PREFER not like", value, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferIn(List<String> values) {
            addCriterion("PREFER in", values, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferNotIn(List<String> values) {
            addCriterion("PREFER not in", values, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferBetween(String value1, String value2) {
            addCriterion("PREFER between", value1, value2, "prefer");
            return (Criteria) this;
        }

        public Criteria andPreferNotBetween(String value1, String value2) {
            addCriterion("PREFER not between", value1, value2, "prefer");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("LEVEL like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("LEVEL not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("WEIXIN is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("WEIXIN is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("WEIXIN =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("WEIXIN <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("WEIXIN >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("WEIXIN >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("WEIXIN <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("WEIXIN <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("WEIXIN like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("WEIXIN not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("WEIXIN in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("WEIXIN not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("WEIXIN between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("WEIXIN not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterIsNull() {
            addCriterion("CUSTOM_CHARACTER is null");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterIsNotNull() {
            addCriterion("CUSTOM_CHARACTER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterEqualTo(String value) {
            addCriterion("CUSTOM_CHARACTER =", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterNotEqualTo(String value) {
            addCriterion("CUSTOM_CHARACTER <>", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterGreaterThan(String value) {
            addCriterion("CUSTOM_CHARACTER >", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_CHARACTER >=", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterLessThan(String value) {
            addCriterion("CUSTOM_CHARACTER <", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_CHARACTER <=", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterLike(String value) {
            addCriterion("CUSTOM_CHARACTER like", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterNotLike(String value) {
            addCriterion("CUSTOM_CHARACTER not like", value, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterIn(List<String> values) {
            addCriterion("CUSTOM_CHARACTER in", values, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterNotIn(List<String> values) {
            addCriterion("CUSTOM_CHARACTER not in", values, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterBetween(String value1, String value2) {
            addCriterion("CUSTOM_CHARACTER between", value1, value2, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andCustomCharacterNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_CHARACTER not between", value1, value2, "customCharacter");
            return (Criteria) this;
        }

        public Criteria andHairNumberIsNull() {
            addCriterion("HAIR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andHairNumberIsNotNull() {
            addCriterion("HAIR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andHairNumberEqualTo(String value) {
            addCriterion("HAIR_NUMBER =", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberNotEqualTo(String value) {
            addCriterion("HAIR_NUMBER <>", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberGreaterThan(String value) {
            addCriterion("HAIR_NUMBER >", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_NUMBER >=", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberLessThan(String value) {
            addCriterion("HAIR_NUMBER <", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberLessThanOrEqualTo(String value) {
            addCriterion("HAIR_NUMBER <=", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberLike(String value) {
            addCriterion("HAIR_NUMBER like", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberNotLike(String value) {
            addCriterion("HAIR_NUMBER not like", value, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberIn(List<String> values) {
            addCriterion("HAIR_NUMBER in", values, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberNotIn(List<String> values) {
            addCriterion("HAIR_NUMBER not in", values, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberBetween(String value1, String value2) {
            addCriterion("HAIR_NUMBER between", value1, value2, "hairNumber");
            return (Criteria) this;
        }

        public Criteria andHairNumberNotBetween(String value1, String value2) {
            addCriterion("HAIR_NUMBER not between", value1, value2, "hairNumber");
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

        public Criteria andHairQualityIsNull() {
            addCriterion("HAIR_QUALITY is null");
            return (Criteria) this;
        }

        public Criteria andHairQualityIsNotNull() {
            addCriterion("HAIR_QUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andHairQualityEqualTo(String value) {
            addCriterion("HAIR_QUALITY =", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityNotEqualTo(String value) {
            addCriterion("HAIR_QUALITY <>", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityGreaterThan(String value) {
            addCriterion("HAIR_QUALITY >", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_QUALITY >=", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityLessThan(String value) {
            addCriterion("HAIR_QUALITY <", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityLessThanOrEqualTo(String value) {
            addCriterion("HAIR_QUALITY <=", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityLike(String value) {
            addCriterion("HAIR_QUALITY like", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityNotLike(String value) {
            addCriterion("HAIR_QUALITY not like", value, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityIn(List<String> values) {
            addCriterion("HAIR_QUALITY in", values, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityNotIn(List<String> values) {
            addCriterion("HAIR_QUALITY not in", values, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityBetween(String value1, String value2) {
            addCriterion("HAIR_QUALITY between", value1, value2, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairQualityNotBetween(String value1, String value2) {
            addCriterion("HAIR_QUALITY not between", value1, value2, "hairQuality");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeIsNull() {
            addCriterion("HAIR_OPRATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeIsNotNull() {
            addCriterion("HAIR_OPRATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeEqualTo(String value) {
            addCriterion("HAIR_OPRATE_TYPE =", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeNotEqualTo(String value) {
            addCriterion("HAIR_OPRATE_TYPE <>", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeGreaterThan(String value) {
            addCriterion("HAIR_OPRATE_TYPE >", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_OPRATE_TYPE >=", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeLessThan(String value) {
            addCriterion("HAIR_OPRATE_TYPE <", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeLessThanOrEqualTo(String value) {
            addCriterion("HAIR_OPRATE_TYPE <=", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeLike(String value) {
            addCriterion("HAIR_OPRATE_TYPE like", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeNotLike(String value) {
            addCriterion("HAIR_OPRATE_TYPE not like", value, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeIn(List<String> values) {
            addCriterion("HAIR_OPRATE_TYPE in", values, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeNotIn(List<String> values) {
            addCriterion("HAIR_OPRATE_TYPE not in", values, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeBetween(String value1, String value2) {
            addCriterion("HAIR_OPRATE_TYPE between", value1, value2, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairOprateTypeNotBetween(String value1, String value2) {
            addCriterion("HAIR_OPRATE_TYPE not between", value1, value2, "hairOprateType");
            return (Criteria) this;
        }

        public Criteria andHairPreferIsNull() {
            addCriterion("HAIR_PREFER is null");
            return (Criteria) this;
        }

        public Criteria andHairPreferIsNotNull() {
            addCriterion("HAIR_PREFER is not null");
            return (Criteria) this;
        }

        public Criteria andHairPreferEqualTo(String value) {
            addCriterion("HAIR_PREFER =", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferNotEqualTo(String value) {
            addCriterion("HAIR_PREFER <>", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferGreaterThan(String value) {
            addCriterion("HAIR_PREFER >", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_PREFER >=", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferLessThan(String value) {
            addCriterion("HAIR_PREFER <", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferLessThanOrEqualTo(String value) {
            addCriterion("HAIR_PREFER <=", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferLike(String value) {
            addCriterion("HAIR_PREFER like", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferNotLike(String value) {
            addCriterion("HAIR_PREFER not like", value, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferIn(List<String> values) {
            addCriterion("HAIR_PREFER in", values, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferNotIn(List<String> values) {
            addCriterion("HAIR_PREFER not in", values, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferBetween(String value1, String value2) {
            addCriterion("HAIR_PREFER between", value1, value2, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairPreferNotBetween(String value1, String value2) {
            addCriterion("HAIR_PREFER not between", value1, value2, "hairPrefer");
            return (Criteria) this;
        }

        public Criteria andHairExcludeIsNull() {
            addCriterion("HAIR_EXCLUDE is null");
            return (Criteria) this;
        }

        public Criteria andHairExcludeIsNotNull() {
            addCriterion("HAIR_EXCLUDE is not null");
            return (Criteria) this;
        }

        public Criteria andHairExcludeEqualTo(String value) {
            addCriterion("HAIR_EXCLUDE =", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeNotEqualTo(String value) {
            addCriterion("HAIR_EXCLUDE <>", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeGreaterThan(String value) {
            addCriterion("HAIR_EXCLUDE >", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_EXCLUDE >=", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeLessThan(String value) {
            addCriterion("HAIR_EXCLUDE <", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeLessThanOrEqualTo(String value) {
            addCriterion("HAIR_EXCLUDE <=", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeLike(String value) {
            addCriterion("HAIR_EXCLUDE like", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeNotLike(String value) {
            addCriterion("HAIR_EXCLUDE not like", value, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeIn(List<String> values) {
            addCriterion("HAIR_EXCLUDE in", values, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeNotIn(List<String> values) {
            addCriterion("HAIR_EXCLUDE not in", values, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeBetween(String value1, String value2) {
            addCriterion("HAIR_EXCLUDE between", value1, value2, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairExcludeNotBetween(String value1, String value2) {
            addCriterion("HAIR_EXCLUDE not between", value1, value2, "hairExclude");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyIsNull() {
            addCriterion("HAIR_FREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyIsNotNull() {
            addCriterion("HAIR_FREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyEqualTo(String value) {
            addCriterion("HAIR_FREQUENCY =", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyNotEqualTo(String value) {
            addCriterion("HAIR_FREQUENCY <>", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyGreaterThan(String value) {
            addCriterion("HAIR_FREQUENCY >", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("HAIR_FREQUENCY >=", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyLessThan(String value) {
            addCriterion("HAIR_FREQUENCY <", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyLessThanOrEqualTo(String value) {
            addCriterion("HAIR_FREQUENCY <=", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyLike(String value) {
            addCriterion("HAIR_FREQUENCY like", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyNotLike(String value) {
            addCriterion("HAIR_FREQUENCY not like", value, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyIn(List<String> values) {
            addCriterion("HAIR_FREQUENCY in", values, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyNotIn(List<String> values) {
            addCriterion("HAIR_FREQUENCY not in", values, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyBetween(String value1, String value2) {
            addCriterion("HAIR_FREQUENCY between", value1, value2, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andHairFrequencyNotBetween(String value1, String value2) {
            addCriterion("HAIR_FREQUENCY not between", value1, value2, "hairFrequency");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("COMMENT =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("COMMENT <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("COMMENT >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("COMMENT <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("COMMENT <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("COMMENT like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("COMMENT not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("COMMENT in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("COMMENT not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("COMMENT between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("COMMENT not between", value1, value2, "comment");
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