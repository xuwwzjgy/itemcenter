package com.yougou.itemcenter.domain.dto;

import com.yougou.itemcenter.domain.BaseDomain;

public class ItemParamOptionDTO  extends BaseDomain {

	private static final long serialVersionUID = -2519732270739474713L;
	
	/*
	 * 商品参数选项ID
	 */
	private Long optId;
	
	
	public Long getOptId() {
		return optId;
	}


	public void setOptId(Long optId) {
		this.optId = optId;
	}


	public String getOptValue() {
		return optValue;
	}


	public void setOptValue(String optValue) {
		this.optValue = optValue;
	}


	/*
	 * 商品参数选项值
	 */
	private String optValue;
}
