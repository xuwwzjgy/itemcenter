package com.yougou.itemcenter.domain.meta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public BrandExample() {
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

    public BrandExample(Integer limitStart, Integer limitEnd) {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brandId =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brandId <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brandId >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brandId >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brandId <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brandId <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brandId in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brandId not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brandId between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brandId not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnIsNull() {
            addCriterion("brandNameEn is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnIsNotNull() {
            addCriterion("brandNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnEqualTo(String value) {
            addCriterion("brandNameEn =", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnNotEqualTo(String value) {
            addCriterion("brandNameEn <>", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnGreaterThan(String value) {
            addCriterion("brandNameEn >", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("brandNameEn >=", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnLessThan(String value) {
            addCriterion("brandNameEn <", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnLessThanOrEqualTo(String value) {
            addCriterion("brandNameEn <=", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnLike(String value) {
            addCriterion("brandNameEn like", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnNotLike(String value) {
            addCriterion("brandNameEn not like", value, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnIn(List<String> values) {
            addCriterion("brandNameEn in", values, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnNotIn(List<String> values) {
            addCriterion("brandNameEn not in", values, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnBetween(String value1, String value2) {
            addCriterion("brandNameEn between", value1, value2, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameEnNotBetween(String value1, String value2) {
            addCriterion("brandNameEn not between", value1, value2, "brandNameEn");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhIsNull() {
            addCriterion("brandNameZh is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhIsNotNull() {
            addCriterion("brandNameZh is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhEqualTo(String value) {
            addCriterion("brandNameZh =", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhNotEqualTo(String value) {
            addCriterion("brandNameZh <>", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhGreaterThan(String value) {
            addCriterion("brandNameZh >", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("brandNameZh >=", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhLessThan(String value) {
            addCriterion("brandNameZh <", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhLessThanOrEqualTo(String value) {
            addCriterion("brandNameZh <=", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhLike(String value) {
            addCriterion("brandNameZh like", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhNotLike(String value) {
            addCriterion("brandNameZh not like", value, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhIn(List<String> values) {
            addCriterion("brandNameZh in", values, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhNotIn(List<String> values) {
            addCriterion("brandNameZh not in", values, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhBetween(String value1, String value2) {
            addCriterion("brandNameZh between", value1, value2, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andBrandNameZhNotBetween(String value1, String value2) {
            addCriterion("brandNameZh not between", value1, value2, "brandNameZh");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("countryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("countryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("countryCode =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("countryCode <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("countryCode >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("countryCode >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("countryCode <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("countryCode <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("countryCode like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("countryCode not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("countryCode in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("countryCode not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("countryCode between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("countryCode not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmtCreate is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmtCreate is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmtCreate =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmtCreate <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmtCreate >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtCreate >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmtCreate <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmtCreate <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmtCreate in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmtCreate not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmtCreate between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmtCreate not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmtModified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmtModified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmtModified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmtModified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmtModified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtModified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmtModified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmtModified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmtModified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmtModified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmtModified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmtModified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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