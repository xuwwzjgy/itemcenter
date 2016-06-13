package com.yougou.itemcenter.domain.dto;

import java.util.Date;
import java.util.List;

import com.yougou.itemcenter.domain.BaseDomain;

public class ItemParamDTO  extends BaseDomain {

	private static final long serialVersionUID = 905859329698390861L;

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
    private Integer detailtype;

    /**
     * 是否必填
     */
    private Integer isrequired;

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
    private Integer isdelete;

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
    
    /**
     * 商品参数选项list
     * 
     */
    List<ItemParamOptionDTO> list;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDetailtype() {
		return detailtype;
	}

	public void setDetailtype(Integer detailtype) {
		this.detailtype = detailtype;
	}

	public Integer getIsrequired() {
		return isrequired;
	}

	public void setIsrequired(Integer isrequired) {
		this.isrequired = isrequired;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Integer isdelete) {
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
		this.feature = feature;
	}

	public List<ItemParamOptionDTO> getList() {
		return list;
	}

	public void setList(List<ItemParamOptionDTO> list) {
		this.list = list;
	}

	
}
