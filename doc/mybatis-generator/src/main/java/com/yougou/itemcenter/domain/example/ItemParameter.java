package com.yougou.itemcenter.domain.example;

import java.util.Date;

public class ItemParameter {
    /**
     * 主键
     */
    private Long id;

    /**
     * 1:SINGLE_SELECT 
            2:TEXT
            3:TEXT_AREA
            4:MULTI_SELECT
     */
    private Byte detailtype;

    /**
     * 是否必填
     */
    private Boolean isrequired;

    /**
     * 商品参数名称
     */
    private String name;

    /**
     * 填写内容提示文字
     */
    private String text;

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
     * feature备用
     */
    private String feature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getDetailtype() {
        return detailtype;
    }

    public void setDetailtype(Byte detailtype) {
        this.detailtype = detailtype;
    }

    public Boolean getIsrequired() {
        return isrequired;
    }

    public void setIsrequired(Boolean isrequired) {
        this.isrequired = isrequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
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