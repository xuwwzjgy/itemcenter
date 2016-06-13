package com.yougou.itemcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.ItemParamDTO;
import com.yougou.itemcenter.domain.request.trade.ParameterRequest;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.manager.ParamReadManager;
import com.yougou.itemcenter.mapper.ItemParameterMapper;
import com.yougou.itemcenter.service.backend.example.ParamReadService;


@Service("paramReadService")
public class ParamReadServiceImpl implements ParamReadService{

	public static final int SEARCHTYPE_NAME = 0;
	
	public static final int SEARCHTYPE_VALUE = 1; 
	
	@Autowired
	private ItemParameterMapper itemParameterMapper;
	
	@Autowired
	private ParamReadManager paramReadManager;
	
	@Override
	public Result<Pager<ItemParamDTO>> queryItemParamList(ParameterRequest parameterRequest) {

		Result<Pager<ItemParamDTO>> result = new Result<Pager<ItemParamDTO>>();
		Pager<ItemParamDTO> pager = null;
		Integer seachKey = parameterRequest.getSeachKey();
		if (seachKey != null && seachKey.intValue() == SEARCHTYPE_NAME) {
			pager = paramReadManager.queryItemParamListByParaName(parameterRequest);
		}else{
			pager = paramReadManager.queryItemParamListOptValue(parameterRequest);
		}
		
		if(pager != null){
			result.setData(pager);
		}
		return result;
	}

}
