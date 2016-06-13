package com.yougou.itemcenter.service.backend.example;

import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.ItemParamDTO;
import com.yougou.itemcenter.domain.request.trade.ParameterRequest;
import com.yougou.itemcenter.domain.result.Result;

public interface ParamReadService {

	public Result<Pager<ItemParamDTO>> queryItemParamList(ParameterRequest parameterRequest);
	
}
