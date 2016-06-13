package com.yougou.itemcenter.domain.meta;

import java.util.Date;

public class Picmap {
    /**
     * 主键
     */
    private Long id;

    /**
     * 商品id
     */
    private Long productid;

    /**
     * -1:NULL
            1, 商品展示
            2, 详情展示
     */
    private Byte pictype;

    /**
     * 图片路径
     */
    private String picpath;

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

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Byte getPictype() {
        return pictype;
    }

    public void setPictype(Byte pictype) {
        this.pictype = pictype;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
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