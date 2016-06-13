package com.yougou.itemcenter.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CountryExample() {
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

    public CountryExample(Integer limitStart, Integer limitEnd) {
        oredCriteria = new ArrayList<Criteria>();
        this.limitStart=limitStart;
        this.limitEnd=limitEnd;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIsNull() {
            addCriterion("countryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIsNotNull() {
            addCriterion("countryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeEqualTo(String value) {
            addCriterion("countryCode =", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotEqualTo(String value) {
            addCriterion("countryCode <>", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThan(String value) {
            addCriterion("countryCode >", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("countryCode >=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThan(String value) {
            addCriterion("countryCode <", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThanOrEqualTo(String value) {
            addCriterion("countryCode <=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLike(String value) {
            addCriterion("countryCode like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotLike(String value) {
            addCriterion("countryCode not like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIn(List<String> values) {
            addCriterion("countryCode in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotIn(List<String> values) {
            addCriterion("countryCode not in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeBetween(String value1, String value2) {
            addCriterion("countryCode between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotBetween(String value1, String value2) {
            addCriterion("countryCode not between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrynameenIsNull() {
            addCriterion("countryNameEn is null");
            return (Criteria) this;
        }

        public Criteria andCountrynameenIsNotNull() {
            addCriterion("countryNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andCountrynameenEqualTo(String value) {
            addCriterion("countryNameEn =", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenNotEqualTo(String value) {
            addCriterion("countryNameEn <>", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenGreaterThan(String value) {
            addCriterion("countryNameEn >", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenGreaterThanOrEqualTo(String value) {
            addCriterion("countryNameEn >=", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenLessThan(String value) {
            addCriterion("countryNameEn <", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenLessThanOrEqualTo(String value) {
            addCriterion("countryNameEn <=", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenLike(String value) {
            addCriterion("countryNameEn like", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenNotLike(String value) {
            addCriterion("countryNameEn not like", value, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenIn(List<String> values) {
            addCriterion("countryNameEn in", values, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenNotIn(List<String> values) {
            addCriterion("countryNameEn not in", values, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenBetween(String value1, String value2) {
            addCriterion("countryNameEn between", value1, value2, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameenNotBetween(String value1, String value2) {
            addCriterion("countryNameEn not between", value1, value2, "countrynameen");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNull() {
            addCriterion("countryName is null");
            return (Criteria) this;
        }

        public Criteria andCountrynameIsNotNull() {
            addCriterion("countryName is not null");
            return (Criteria) this;
        }

        public Criteria andCountrynameEqualTo(String value) {
            addCriterion("countryName =", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotEqualTo(String value) {
            addCriterion("countryName <>", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThan(String value) {
            addCriterion("countryName >", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("countryName >=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThan(String value) {
            addCriterion("countryName <", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLessThanOrEqualTo(String value) {
            addCriterion("countryName <=", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameLike(String value) {
            addCriterion("countryName like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotLike(String value) {
            addCriterion("countryName not like", value, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameIn(List<String> values) {
            addCriterion("countryName in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotIn(List<String> values) {
            addCriterion("countryName not in", values, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameBetween(String value1, String value2) {
            addCriterion("countryName between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andCountrynameNotBetween(String value1, String value2) {
            addCriterion("countryName not between", value1, value2, "countryname");
            return (Criteria) this;
        }

        public Criteria andFlagurlIsNull() {
            addCriterion("flagUrl is null");
            return (Criteria) this;
        }

        public Criteria andFlagurlIsNotNull() {
            addCriterion("flagUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFlagurlEqualTo(String value) {
            addCriterion("flagUrl =", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlNotEqualTo(String value) {
            addCriterion("flagUrl <>", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlGreaterThan(String value) {
            addCriterion("flagUrl >", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlGreaterThanOrEqualTo(String value) {
            addCriterion("flagUrl >=", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlLessThan(String value) {
            addCriterion("flagUrl <", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlLessThanOrEqualTo(String value) {
            addCriterion("flagUrl <=", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlLike(String value) {
            addCriterion("flagUrl like", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlNotLike(String value) {
            addCriterion("flagUrl not like", value, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlIn(List<String> values) {
            addCriterion("flagUrl in", values, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlNotIn(List<String> values) {
            addCriterion("flagUrl not in", values, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlBetween(String value1, String value2) {
            addCriterion("flagUrl between", value1, value2, "flagurl");
            return (Criteria) this;
        }

        public Criteria andFlagurlNotBetween(String value1, String value2) {
            addCriterion("flagUrl not between", value1, value2, "flagurl");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedIsNull() {
            addCriterion("gmtModified is null");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedIsNotNull() {
            addCriterion("gmtModified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedEqualTo(Date value) {
            addCriterion("gmtModified =", value, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedNotEqualTo(Date value) {
            addCriterion("gmtModified <>", value, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedGreaterThan(Date value) {
            addCriterion("gmtModified >", value, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtModified >=", value, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedLessThan(Date value) {
            addCriterion("gmtModified <", value, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmtModified <=", value, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedIn(List<Date> values) {
            addCriterion("gmtModified in", values, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedNotIn(List<Date> values) {
            addCriterion("gmtModified not in", values, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedBetween(Date value1, Date value2) {
            addCriterion("gmtModified between", value1, value2, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtmodifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmtModified not between", value1, value2, "gmtmodified");
            return (Criteria) this;
        }

        public Criteria andGmtcreateIsNull() {
            addCriterion("gmtCreate is null");
            return (Criteria) this;
        }

        public Criteria andGmtcreateIsNotNull() {
            addCriterion("gmtCreate is not null");
            return (Criteria) this;
        }

        public Criteria andGmtcreateEqualTo(Date value) {
            addCriterion("gmtCreate =", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateNotEqualTo(Date value) {
            addCriterion("gmtCreate <>", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateGreaterThan(Date value) {
            addCriterion("gmtCreate >", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtCreate >=", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateLessThan(Date value) {
            addCriterion("gmtCreate <", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateLessThanOrEqualTo(Date value) {
            addCriterion("gmtCreate <=", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateIn(List<Date> values) {
            addCriterion("gmtCreate in", values, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateNotIn(List<Date> values) {
            addCriterion("gmtCreate not in", values, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateBetween(Date value1, Date value2) {
            addCriterion("gmtCreate between", value1, value2, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateNotBetween(Date value1, Date value2) {
            addCriterion("gmtCreate not between", value1, value2, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNull() {
            addCriterion("feature is null");
            return (Criteria) this;
        }

        public Criteria andFeatureIsNotNull() {
            addCriterion("feature is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureEqualTo(String value) {
            addCriterion("feature =", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotEqualTo(String value) {
            addCriterion("feature <>", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThan(String value) {
            addCriterion("feature >", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureGreaterThanOrEqualTo(String value) {
            addCriterion("feature >=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThan(String value) {
            addCriterion("feature <", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLessThanOrEqualTo(String value) {
            addCriterion("feature <=", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureLike(String value) {
            addCriterion("feature like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotLike(String value) {
            addCriterion("feature not like", value, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureIn(List<String> values) {
            addCriterion("feature in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotIn(List<String> values) {
            addCriterion("feature not in", values, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureBetween(String value1, String value2) {
            addCriterion("feature between", value1, value2, "feature");
            return (Criteria) this;
        }

        public Criteria andFeatureNotBetween(String value1, String value2) {
            addCriterion("feature not between", value1, value2, "feature");
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