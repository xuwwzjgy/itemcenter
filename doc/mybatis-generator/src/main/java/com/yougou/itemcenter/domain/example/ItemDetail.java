package com.yougou.itemcenter.domain.example;

import java.util.Date;

public class ItemDetail {
    /**
     * Id
     */
    private Long id;

    /**
     * 商品id
     */
    private Long itemid;

    /**
     * 属性名+值(id:value)      
            如 1:1001,2:1002,3:1003
     */
    private String parameter;

    /**
     * 用户富文本框编辑的HTML
     */
    private String customedithtml;

    /**
     * 0,null
            1, 件
            2, 个
            3, 双
            4, 支
            5, 副
            6, 套
            7, 台
            8, 本
            9, 片
            10, 盒
            12, 斤
     */
    private Byte unit;

    /**
     * 商品描述
     */
    private String itemdesc;

    /**
     * 产地
     */
    private String producing;

    /**
     * 重量
     */
    private String weight;

    /**
     * 是否拼接大图
     */
    private Byte isjointpic;

    /**
     * 修改时间
     */
    private Date gmtmodified;

    /**
     * 创建时间
     */
    private Date gmtcreate;

    /**
     * 格式如：k1=v1;k2=v2….
     */
    private String feature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getCustomedithtml() {
        return customedithtml;
    }

    public void setCustomedithtml(String customedithtml) {
        this.customedithtml = customedithtml == null ? null : customedithtml.trim();
    }

    public Byte getUnit() {
        return unit;
    }

    public void setUnit(Byte unit) {
        this.unit = unit;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc == null ? null : itemdesc.trim();
    }

    public String getProducing() {
        return producing;
    }

    public void setProducing(String producing) {
        this.producing = producing == null ? null : producing.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Byte getIsjointpic() {
        return isjointpic;
    }

    public void setIsjointpic(Byte isjointpic) {
        this.isjointpic = isjointpic;
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