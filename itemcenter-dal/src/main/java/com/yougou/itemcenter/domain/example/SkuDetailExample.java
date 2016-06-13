package com.yougou.itemcenter.domain.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkuDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public SkuDetailExample() {
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

    public SkuDetailExample(Integer limitStart, Integer limitEnd) {
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

        public Criteria andSkuidIsNull() {
            addCriterion("skuId is null");
            return (Criteria) this;
        }

        public Criteria andSkuidIsNotNull() {
            addCriterion("skuId is not null");
            return (Criteria) this;
        }

        public Criteria andSkuidEqualTo(Long value) {
            addCriterion("skuId =", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotEqualTo(Long value) {
            addCriterion("skuId <>", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThan(Long value) {
            addCriterion("skuId >", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThanOrEqualTo(Long value) {
            addCriterion("skuId >=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThan(Long value) {
            addCriterion("skuId <", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThanOrEqualTo(Long value) {
            addCriterion("skuId <=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidIn(List<Long> values) {
            addCriterion("skuId in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotIn(List<Long> values) {
            addCriterion("skuId not in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidBetween(Long value1, Long value2) {
            addCriterion("skuId between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotBetween(Long value1, Long value2) {
            addCriterion("skuId not between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andParameterIsNull() {
            addCriterion("parameter is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("parameter is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("parameter =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("parameter <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("parameter >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("parameter >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("parameter <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("parameter <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("parameter like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("parameter not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("parameter in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("parameter not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("parameter between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("parameter not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlIsNull() {
            addCriterion("customEditHTML is null");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlIsNotNull() {
            addCriterion("customEditHTML is not null");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlEqualTo(String value) {
            addCriterion("customEditHTML =", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlNotEqualTo(String value) {
            addCriterion("customEditHTML <>", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlGreaterThan(String value) {
            addCriterion("customEditHTML >", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlGreaterThanOrEqualTo(String value) {
            addCriterion("customEditHTML >=", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlLessThan(String value) {
            addCriterion("customEditHTML <", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlLessThanOrEqualTo(String value) {
            addCriterion("customEditHTML <=", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlLike(String value) {
            addCriterion("customEditHTML like", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlNotLike(String value) {
            addCriterion("customEditHTML not like", value, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlIn(List<String> values) {
            addCriterion("customEditHTML in", values, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlNotIn(List<String> values) {
            addCriterion("customEditHTML not in", values, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlBetween(String value1, String value2) {
            addCriterion("customEditHTML between", value1, value2, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andCustomedithtmlNotBetween(String value1, String value2) {
            addCriterion("customEditHTML not between", value1, value2, "customedithtml");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Byte value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Byte value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Byte value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Byte value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Byte value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Byte value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Byte> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Byte> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Byte value1, Byte value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Byte value1, Byte value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNull() {
            addCriterion("itemDesc is null");
            return (Criteria) this;
        }

        public Criteria andItemdescIsNotNull() {
            addCriterion("itemDesc is not null");
            return (Criteria) this;
        }

        public Criteria andItemdescEqualTo(String value) {
            addCriterion("itemDesc =", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotEqualTo(String value) {
            addCriterion("itemDesc <>", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThan(String value) {
            addCriterion("itemDesc >", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescGreaterThanOrEqualTo(String value) {
            addCriterion("itemDesc >=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThan(String value) {
            addCriterion("itemDesc <", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLessThanOrEqualTo(String value) {
            addCriterion("itemDesc <=", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescLike(String value) {
            addCriterion("itemDesc like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotLike(String value) {
            addCriterion("itemDesc not like", value, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescIn(List<String> values) {
            addCriterion("itemDesc in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotIn(List<String> values) {
            addCriterion("itemDesc not in", values, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescBetween(String value1, String value2) {
            addCriterion("itemDesc between", value1, value2, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andItemdescNotBetween(String value1, String value2) {
            addCriterion("itemDesc not between", value1, value2, "itemdesc");
            return (Criteria) this;
        }

        public Criteria andProducingIsNull() {
            addCriterion("producing is null");
            return (Criteria) this;
        }

        public Criteria andProducingIsNotNull() {
            addCriterion("producing is not null");
            return (Criteria) this;
        }

        public Criteria andProducingEqualTo(String value) {
            addCriterion("producing =", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingNotEqualTo(String value) {
            addCriterion("producing <>", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingGreaterThan(String value) {
            addCriterion("producing >", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingGreaterThanOrEqualTo(String value) {
            addCriterion("producing >=", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingLessThan(String value) {
            addCriterion("producing <", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingLessThanOrEqualTo(String value) {
            addCriterion("producing <=", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingLike(String value) {
            addCriterion("producing like", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingNotLike(String value) {
            addCriterion("producing not like", value, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingIn(List<String> values) {
            addCriterion("producing in", values, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingNotIn(List<String> values) {
            addCriterion("producing not in", values, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingBetween(String value1, String value2) {
            addCriterion("producing between", value1, value2, "producing");
            return (Criteria) this;
        }

        public Criteria andProducingNotBetween(String value1, String value2) {
            addCriterion("producing not between", value1, value2, "producing");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andIsjointpicIsNull() {
            addCriterion("isJointPic is null");
            return (Criteria) this;
        }

        public Criteria andIsjointpicIsNotNull() {
            addCriterion("isJointPic is not null");
            return (Criteria) this;
        }

        public Criteria andIsjointpicEqualTo(Byte value) {
            addCriterion("isJointPic =", value, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicNotEqualTo(Byte value) {
            addCriterion("isJointPic <>", value, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicGreaterThan(Byte value) {
            addCriterion("isJointPic >", value, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicGreaterThanOrEqualTo(Byte value) {
            addCriterion("isJointPic >=", value, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicLessThan(Byte value) {
            addCriterion("isJointPic <", value, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicLessThanOrEqualTo(Byte value) {
            addCriterion("isJointPic <=", value, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicIn(List<Byte> values) {
            addCriterion("isJointPic in", values, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicNotIn(List<Byte> values) {
            addCriterion("isJointPic not in", values, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicBetween(Byte value1, Byte value2) {
            addCriterion("isJointPic between", value1, value2, "isjointpic");
            return (Criteria) this;
        }

        public Criteria andIsjointpicNotBetween(Byte value1, Byte value2) {
            addCriterion("isJointPic not between", value1, value2, "isjointpic");
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