package com.yougou.itemcenter.domain.example;

import java.util.Date;

public class SaleParamOption {
    /**
     * 主键
     */
    private Long id;

    /**
     * 商品参数id
     */
    private Long prodparamid;

    /**
     * 该选项显示的内容
     */
    private String balue;

    /**
     * 修改时间
     */
    private Date gmtmodified;

    /**
     * 创建时间
     */
    private Date gmtcreate;

    /**
     * feature备用
     */
    private String feature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProdparamid() {
        return prodparamid;
    }

    public void setProdparamid(Long prodparamid) {
        this.prodparamid = prodparamid;
    }

    public String getBalue() {
        return balue;
    }

    public void setBalue(String balue) {
        this.balue = balue == null ? null : balue.trim();
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