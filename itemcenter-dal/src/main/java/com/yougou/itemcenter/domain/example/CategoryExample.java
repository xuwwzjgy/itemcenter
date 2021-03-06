package com.yougou.itemcenter.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CategoryExample() {
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

    public CategoryExample(Integer limitStart, Integer limitEnd) {
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProductParameterIsNull() {
            addCriterion("productParameter is null");
            return (Criteria) this;
        }

        public Criteria andProductParameterIsNotNull() {
            addCriterion("productParameter is not null");
            return (Criteria) this;
        }

        public Criteria andProductParameterEqualTo(String value) {
            addCriterion("productParameter =", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterNotEqualTo(String value) {
            addCriterion("productParameter <>", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterGreaterThan(String value) {
            addCriterion("productParameter >", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterGreaterThanOrEqualTo(String value) {
            addCriterion("productParameter >=", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterLessThan(String value) {
            addCriterion("productParameter <", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterLessThanOrEqualTo(String value) {
            addCriterion("productParameter <=", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterLike(String value) {
            addCriterion("productParameter like", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterNotLike(String value) {
            addCriterion("productParameter not like", value, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterIn(List<String> values) {
            addCriterion("productParameter in", values, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterNotIn(List<String> values) {
            addCriterion("productParameter not in", values, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterBetween(String value1, String value2) {
            addCriterion("productParameter between", value1, value2, "productParameter");
            return (Criteria) this;
        }

        public Criteria andProductParameterNotBetween(String value1, String value2) {
            addCriterion("productParameter not between", value1, value2, "productParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterIsNull() {
            addCriterion("saleParameter is null");
            return (Criteria) this;
        }

        public Criteria andSaleParameterIsNotNull() {
            addCriterion("saleParameter is not null");
            return (Criteria) this;
        }

        public Criteria andSaleParameterEqualTo(String value) {
            addCriterion("saleParameter =", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterNotEqualTo(String value) {
            addCriterion("saleParameter <>", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterGreaterThan(String value) {
            addCriterion("saleParameter >", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterGreaterThanOrEqualTo(String value) {
            addCriterion("saleParameter >=", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterLessThan(String value) {
            addCriterion("saleParameter <", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterLessThanOrEqualTo(String value) {
            addCriterion("saleParameter <=", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterLike(String value) {
            addCriterion("saleParameter like", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterNotLike(String value) {
            addCriterion("saleParameter not like", value, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterIn(List<String> values) {
            addCriterion("saleParameter in", values, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterNotIn(List<String> values) {
            addCriterion("saleParameter not in", values, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterBetween(String value1, String value2) {
            addCriterion("saleParameter between", value1, value2, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andSaleParameterNotBetween(String value1, String value2) {
            addCriterion("saleParameter not between", value1, value2, "saleParameter");
            return (Criteria) this;
        }

        public Criteria andShowIndexIsNull() {
            addCriterion("showIndex is null");
            return (Criteria) this;
        }

        public Criteria andShowIndexIsNotNull() {
            addCriterion("showIndex is not null");
            return (Criteria) this;
        }

        public Criteria andShowIndexEqualTo(Integer value) {
            addCriterion("showIndex =", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexNotEqualTo(Integer value) {
            addCriterion("showIndex <>", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexGreaterThan(Integer value) {
            addCriterion("showIndex >", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("showIndex >=", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexLessThan(Integer value) {
            addCriterion("showIndex <", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexLessThanOrEqualTo(Integer value) {
            addCriterion("showIndex <=", value, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexIn(List<Integer> values) {
            addCriterion("showIndex in", values, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexNotIn(List<Integer> values) {
            addCriterion("showIndex not in", values, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexBetween(Integer value1, Integer value2) {
            addCriterion("showIndex between", value1, value2, "showIndex");
            return (Criteria) this;
        }

        public Criteria andShowIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("showIndex not between", value1, value2, "showIndex");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdIsNull() {
            addCriterion("superCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdIsNotNull() {
            addCriterion("superCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdEqualTo(Long value) {
            addCriterion("superCategoryId =", value, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdNotEqualTo(Long value) {
            addCriterion("superCategoryId <>", value, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdGreaterThan(Long value) {
            addCriterion("superCategoryId >", value, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("superCategoryId >=", value, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdLessThan(Long value) {
            addCriterion("superCategoryId <", value, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("superCategoryId <=", value, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdIn(List<Long> values) {
            addCriterion("superCategoryId in", values, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdNotIn(List<Long> values) {
            addCriterion("superCategoryId not in", values, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdBetween(Long value1, Long value2) {
            addCriterion("superCategoryId between", value1, value2, "superCategoryId");
            return (Criteria) this;
        }

        public Criteria andSuperCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("superCategoryId not between", value1, value2, "superCategoryId");
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