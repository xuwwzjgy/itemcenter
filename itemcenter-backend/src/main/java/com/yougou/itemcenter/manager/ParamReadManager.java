package com.yougou.itemcenter.manager;

import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.ItemParamDTO;
import com.yougou.itemcenter.domain.request.trade.ParameterRequest;


public interface ParamReadManager {
	
	/**
	 *  商品参数查询功能--按照属性名查找
	 * @param parameterRequest
	 * @return
	 */
	public Pager<ItemParamDTO> queryItemParamListByParaName(ParameterRequest parameterRequest);
	
	/**
	 * 商品参数查询功能--按照属性值查找
	 * @param parameterRequest
	 * @return
	 */
	public Pager<ItemParamDTO> queryItemParamListOptValue(ParameterRequest parameterRequest);
}
