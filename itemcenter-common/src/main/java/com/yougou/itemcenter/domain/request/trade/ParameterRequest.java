package com.yougou.itemcenter.domain.request.trade;

import com.yougou.itemcenter.domain.BaseDomain;

public class ParameterRequest  extends BaseDomain {

	private static final long serialVersionUID = 5123277726984844053L;

	/**
	 * 是否必填：1必填；0非必填
	 */
	private Integer isRequired;
	
	/**
	 * 参数类别。	1:SINGLE_SELECT 
			    2:TEXT
				3:TEXT_AREA
				4:MULTI_SELECT（枚举）

	 */
	private Integer detailType;
	/**
	 * 查询关键字类型：1属性名； 2属性值
	 */
	private Integer seachKey;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 查询第几页
	 * @return
	 */
	private Integer offset;
	
	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Integer isRequired) {
		this.isRequired = isRequired;
	}

	public Integer getDetailType() {
		return detailType;
	}

	public void setDetailType(Integer detailType) {
		this.detailType = detailType;
	}

	public Integer getSeachKey() {
		return seachKey;
	}

	public void setSeachKey(Integer seachKey) {
		this.seachKey = seachKey;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	
}
