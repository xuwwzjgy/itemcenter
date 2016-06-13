package com.yougou.itemcenter.domain.meta;

import java.util.Date;

public class Country {
    /**
     * id
     */
    private Long id;

    /**
     * 国家编码
     */
    private String countrycode;

    /**
     * 国家英文名
     */
    private String countrynameen;

    /**
     * 国名
     */
    private String countryname;

    /**
     * 国旗
     */
    private String flagurl;

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

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getCountrynameen() {
        return countrynameen;
    }

    public void setCountrynameen(String countrynameen) {
        this.countrynameen = countrynameen == null ? null : countrynameen.trim();
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    public String getFlagurl() {
        return flagurl;
    }

    public void setFlagurl(String flagurl) {
        this.flagurl = flagurl == null ? null : flagurl.trim();
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