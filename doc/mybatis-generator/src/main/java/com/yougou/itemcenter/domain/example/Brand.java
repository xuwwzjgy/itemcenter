package com.yougou.itemcenter.domain.example;

import java.util.Date;

public class Brand {
    /**
     * brandId
     */
    private Long brandid;

    /**
     * brandNameEn
     */
    private String brandnameen;

    /**
     * brandNameZh
     */
    private String brandnamezh;

    /**
     * countryCode
     */
    private String countrycode;

    /**
     * 创建时间
     */
    private Date gmtcreate;

    /**
     * 修改时间
     */
    private Date gmtmodified;

    /**
     * isDelete
     */
    private Byte isdelete;

    /**
     * 1.餐饮 2.酒店 3.商品
     */
    private Byte type;

    /**
     * 格式如：k1=v1;k2=v2…
     */
    private String feature;

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public String getBrandnameen() {
        return brandnameen;
    }

    public void setBrandnameen(String brandnameen) {
        this.brandnameen = brandnameen == null ? null : brandnameen.trim();
    }

    public String getBrandnamezh() {
        return brandnamezh;
    }

    public void setBrandnamezh(String brandnamezh) {
        this.brandnamezh = brandnamezh == null ? null : brandnamezh.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public Date getGmtcreate() {
        return gmtcreate;
    }

    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
    }

    public Date getGmtmodified() {
        return gmtmodified;
    }

    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}