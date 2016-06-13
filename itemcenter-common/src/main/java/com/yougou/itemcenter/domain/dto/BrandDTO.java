package com.yougou.itemcenter.domain.dto;

import java.util.Date;

import com.yougou.itemcenter.domain.BaseDomain;

public class BrandDTO extends BaseDomain {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4387632343562390396L;

	/**
     * 品牌ID
     */
    private Long brandid;

    /**
     * 品牌英文名
     */
    private String brandnameen;

    /**
     * 品牌中文名
     */
    private String brandnamezh;

    /**
     * 国家编码
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
     * 是否删除
     */
    private Integer isdelete;

    /**
     * 1.餐饮 2.酒店 3.商品
     */
    private Integer type;

    /**
     * 格式如：k1=v1;k2=v2…
     */
    private String feature;
    
    private CountryDTO countryDTO;

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

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

	public CountryDTO getCountryDTO() {
		return countryDTO;
	}

	public void setCountryDTO(CountryDTO countryDTO) {
		this.countryDTO = countryDTO;
	}
}