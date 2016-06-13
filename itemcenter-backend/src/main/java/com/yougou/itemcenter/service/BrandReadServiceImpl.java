package com.yougou.itemcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.BrandDTO;
import com.yougou.itemcenter.domain.request.BrandRequest;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.backend.BrandReadService;
import com.yougou.itemcenter.service.manager.BrandManager;
@Service
public class BrandReadServiceImpl implements BrandReadService {

	@Autowired
	private BrandManager brandManager;
	
	@Override
	public Result<Pager<List<BrandDTO>>> queryBrandList(BrandRequest brandRequest, AppInfo appInfo) {
		Pager<List<BrandDTO>> list = brandManager.queryBrandList(brandRequest);
		Result<Pager<List<BrandDTO>>> result = new Result<>();
		result.setData(list);
		return result;
	}

}
