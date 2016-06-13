package com.yougou.itemcenter.domain.meta;

import java.util.Date;

public class Category {
    private Long id;

    private Integer level;

    private String name;

    private String productParameter;

    private String saleParameter;

    private Integer showIndex;

    private Long superCategoryId;

    private Integer isDelete;

    private Date gmtModified = new Date();

    private Date gmtCreate;

    private String feature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProductParameter() {
        return productParameter;
    }

    public void setProductParameter(String productParameter) {
        this.productParameter = productParameter == null ? null : productParameter.trim();
    }

    public String getSaleParameter() {
        return saleParameter;
    }

    public void setSaleParameter(String saleParameter) {
        this.saleParameter = saleParameter == null ? null : saleParameter.trim();
    }

    public Integer getShowIndex() {
        return showIndex;
    }

    public void setShowIndex(Integer showIndex) {
        this.showIndex = showIndex;
    }

    public Long getSuperCategoryId() {
        return superCategoryId;
    }

    public void setSuperCategoryId(Long superCategoryId) {
        this.superCategoryId = superCategoryId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}