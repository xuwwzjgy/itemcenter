package com.yougou.itemcenter.domain.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ItemExample() {
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

    public ItemExample(Integer limitStart, Integer limitEnd) {
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

        public Criteria andGoodsnoIsNull() {
            addCriterion("goodsNo is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNotNull() {
            addCriterion("goodsNo is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoEqualTo(String value) {
            addCriterion("goodsNo =", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotEqualTo(String value) {
            addCriterion("goodsNo <>", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThan(String value) {
            addCriterion("goodsNo >", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThanOrEqualTo(String value) {
            addCriterion("goodsNo >=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThan(String value) {
            addCriterion("goodsNo <", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThanOrEqualTo(String value) {
            addCriterion("goodsNo <=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLike(String value) {
            addCriterion("goodsNo like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotLike(String value) {
            addCriterion("goodsNo not like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIn(List<String> values) {
            addCriterion("goodsNo in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotIn(List<String> values) {
            addCriterion("goodsNo not in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoBetween(String value1, String value2) {
            addCriterion("goodsNo between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotBetween(String value1, String value2) {
            addCriterion("goodsNo not between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("marketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("marketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(BigDecimal value) {
            addCriterion("marketPrice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("marketPrice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(BigDecimal value) {
            addCriterion("marketPrice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(BigDecimal value) {
            addCriterion("marketPrice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("marketPrice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<BigDecimal> values) {
            addCriterion("marketPrice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("marketPrice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("marketPrice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("salePrice is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("salePrice is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(BigDecimal value) {
            addCriterion("salePrice =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(BigDecimal value) {
            addCriterion("salePrice <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(BigDecimal value) {
            addCriterion("salePrice >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salePrice >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(BigDecimal value) {
            addCriterion("salePrice <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salePrice <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<BigDecimal> values) {
            addCriterion("salePrice in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<BigDecimal> values) {
            addCriterion("salePrice not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salePrice between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salePrice not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andInfoflagIsNull() {
            addCriterion("infoFlag is null");
            return (Criteria) this;
        }

        public Criteria andInfoflagIsNotNull() {
            addCriterion("infoFlag is not null");
            return (Criteria) this;
        }

        public Criteria andInfoflagEqualTo(Byte value) {
            addCriterion("infoFlag =", value, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagNotEqualTo(Byte value) {
            addCriterion("infoFlag <>", value, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagGreaterThan(Byte value) {
            addCriterion("infoFlag >", value, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("infoFlag >=", value, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagLessThan(Byte value) {
            addCriterion("infoFlag <", value, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagLessThanOrEqualTo(Byte value) {
            addCriterion("infoFlag <=", value, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagIn(List<Byte> values) {
            addCriterion("infoFlag in", values, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagNotIn(List<Byte> values) {
            addCriterion("infoFlag not in", values, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagBetween(Byte value1, Byte value2) {
            addCriterion("infoFlag between", value1, value2, "infoflag");
            return (Criteria) this;
        }

        public Criteria andInfoflagNotBetween(Byte value1, Byte value2) {
            addCriterion("infoFlag not between", value1, value2, "infoflag");
            return (Criteria) this;
        }

        public Criteria andShowpicpathIsNull() {
            addCriterion("showPicPath is null");
            return (Criteria) this;
        }

        public Criteria andShowpicpathIsNotNull() {
            addCriterion("showPicPath is not null");
            return (Criteria) this;
        }

        public Criteria andShowpicpathEqualTo(String value) {
            addCriterion("showPicPath =", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathNotEqualTo(String value) {
            addCriterion("showPicPath <>", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathGreaterThan(String value) {
            addCriterion("showPicPath >", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathGreaterThanOrEqualTo(String value) {
            addCriterion("showPicPath >=", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathLessThan(String value) {
            addCriterion("showPicPath <", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathLessThanOrEqualTo(String value) {
            addCriterion("showPicPath <=", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathLike(String value) {
            addCriterion("showPicPath like", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathNotLike(String value) {
            addCriterion("showPicPath not like", value, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathIn(List<String> values) {
            addCriterion("showPicPath in", values, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathNotIn(List<String> values) {
            addCriterion("showPicPath not in", values, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathBetween(String value1, String value2) {
            addCriterion("showPicPath between", value1, value2, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andShowpicpathNotBetween(String value1, String value2) {
            addCriterion("showPicPath not between", value1, value2, "showpicpath");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidIsNull() {
            addCriterion("lowCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidIsNotNull() {
            addCriterion("lowCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidEqualTo(Long value) {
            addCriterion("lowCategoryId =", value, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidNotEqualTo(Long value) {
            addCriterion("lowCategoryId <>", value, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidGreaterThan(Long value) {
            addCriterion("lowCategoryId >", value, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("lowCategoryId >=", value, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidLessThan(Long value) {
            addCriterion("lowCategoryId <", value, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidLessThanOrEqualTo(Long value) {
            addCriterion("lowCategoryId <=", value, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidIn(List<Long> values) {
            addCriterion("lowCategoryId in", values, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidNotIn(List<Long> values) {
            addCriterion("lowCategoryId not in", values, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidBetween(Long value1, Long value2) {
            addCriterion("lowCategoryId between", value1, value2, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andLowcategoryidNotBetween(Long value1, Long value2) {
            addCriterion("lowCategoryId not between", value1, value2, "lowcategoryid");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Long value) {
            addCriterion("brandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Long value) {
            addCriterion("brandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Long value) {
            addCriterion("brandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Long value) {
            addCriterion("brandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Long value) {
            addCriterion("brandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Long value) {
            addCriterion("brandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Long> values) {
            addCriterion("brandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Long> values) {
            addCriterion("brandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Long value1, Long value2) {
            addCriterion("brandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Long value1, Long value2) {
            addCriterion("brandId not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Long value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Long value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Long value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Long value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Long value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Long value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Long> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Long> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Long value1, Long value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Long value1, Long value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidIsNull() {
            addCriterion("carriageTempId is null");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidIsNotNull() {
            addCriterion("carriageTempId is not null");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidEqualTo(Long value) {
            addCriterion("carriageTempId =", value, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidNotEqualTo(Long value) {
            addCriterion("carriageTempId <>", value, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidGreaterThan(Long value) {
            addCriterion("carriageTempId >", value, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidGreaterThanOrEqualTo(Long value) {
            addCriterion("carriageTempId >=", value, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidLessThan(Long value) {
            addCriterion("carriageTempId <", value, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidLessThanOrEqualTo(Long value) {
            addCriterion("carriageTempId <=", value, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidIn(List<Long> values) {
            addCriterion("carriageTempId in", values, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidNotIn(List<Long> values) {
            addCriterion("carriageTempId not in", values, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidBetween(Long value1, Long value2) {
            addCriterion("carriageTempId between", value1, value2, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andCarriagetempidNotBetween(Long value1, Long value2) {
            addCriterion("carriageTempId not between", value1, value2, "carriagetempid");
            return (Criteria) this;
        }

        public Criteria andSalemodeIsNull() {
            addCriterion("saleMode is null");
            return (Criteria) this;
        }

        public Criteria andSalemodeIsNotNull() {
            addCriterion("saleMode is not null");
            return (Criteria) this;
        }

        public Criteria andSalemodeEqualTo(Byte value) {
            addCriterion("saleMode =", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotEqualTo(Byte value) {
            addCriterion("saleMode <>", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeGreaterThan(Byte value) {
            addCriterion("saleMode >", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("saleMode >=", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLessThan(Byte value) {
            addCriterion("saleMode <", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeLessThanOrEqualTo(Byte value) {
            addCriterion("saleMode <=", value, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeIn(List<Byte> values) {
            addCriterion("saleMode in", values, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotIn(List<Byte> values) {
            addCriterion("saleMode not in", values, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeBetween(Byte value1, Byte value2) {
            addCriterion("saleMode between", value1, value2, "salemode");
            return (Criteria) this;
        }

        public Criteria andSalemodeNotBetween(Byte value1, Byte value2) {
            addCriterion("saleMode not between", value1, value2, "salemode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNull() {
            addCriterion("businessId is null");
            return (Criteria) this;
        }

        public Criteria andBusinessidIsNotNull() {
            addCriterion("businessId is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessidEqualTo(Long value) {
            addCriterion("businessId =", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotEqualTo(Long value) {
            addCriterion("businessId <>", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThan(Long value) {
            addCriterion("businessId >", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidGreaterThanOrEqualTo(Long value) {
            addCriterion("businessId >=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThan(Long value) {
            addCriterion("businessId <", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidLessThanOrEqualTo(Long value) {
            addCriterion("businessId <=", value, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidIn(List<Long> values) {
            addCriterion("businessId in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotIn(List<Long> values) {
            addCriterion("businessId not in", values, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidBetween(Long value1, Long value2) {
            addCriterion("businessId between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andBusinessidNotBetween(Long value1, Long value2) {
            addCriterion("businessId not between", value1, value2, "businessid");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Byte value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Byte value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Byte value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Byte value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Byte value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Byte> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Byte> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Byte value1, Byte value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
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

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Byte value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Byte value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Byte value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Byte value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Byte value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Byte> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Byte> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Byte value1, Byte value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("flag not between", value1, value2, "flag");
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