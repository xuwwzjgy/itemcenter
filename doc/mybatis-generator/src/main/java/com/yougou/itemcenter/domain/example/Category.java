package com.yougou.itemcenter.domain.example;

import java.util.Date;

public class Category {
    /**
     * Id
     */
    private Long id;

    /**
     * 类目等级
     */
    private Integer level;

    /**
     * 类目名称
     */
    private String name;

    /**
     * 格式如[1,2,3,4]
     */
    private String productparameter;

    /**
     * 如[1,2,3,4]
     */
    private String saleparameter;

    /**
     * 显示顺序
     */
    private Integer showindex;

    /**
     * 父类目的Id
     */
    private Long supercategoryid;

    /**
     * 是否删除
     */
    private Byte isdelete;

    /**
     * 修改时间
     */
    private Date gmtmodified;

    /**
     * 创建时间
     */
    private Date gmtcreate;

    /**
     * 格式如：k1=v1;k2=v2…
     */
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

    public String getProductparameter() {
        return productparameter;
    }

    public void setProductparameter(String productparameter) {
        this.productparameter = productparameter == null ? null : productparameter.trim();
    }

    public String getSaleparameter() {
        return saleparameter;
    }

    public void setSaleparameter(String saleparameter) {
        this.saleparameter = saleparameter == null ? null : saleparameter.trim();
    }

    public Integer getShowindex() {
        return showindex;
    }

    public void setShowindex(Integer showindex) {
        this.showindex = showindex;
    }

    public Long getSupercategoryid() {
        return supercategoryid;
    }

    public void setSupercategoryid(Long supercategoryid) {
        this.supercategoryid = supercategoryid;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    public Date getGmtmodified() {
        return gmtmodified;
    }

    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
    }

    public Date getGmtcreate() {
        return gmtcreate;
    }

    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}