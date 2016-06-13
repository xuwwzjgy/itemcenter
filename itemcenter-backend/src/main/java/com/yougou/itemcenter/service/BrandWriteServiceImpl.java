package com.yougou.itemcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yougou.itemcenter.domain.request.BrandRequest;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.backend.BrandWriteService;
import com.yougou.itemcenter.service.manager.BrandManager;
@Service
public class BrandWriteServiceImpl implements BrandWriteService {

	@Autowired
	private BrandManager brandManager;

	@Override
	public Result<Long> saveBrand(BrandRequest brandRequest, AppInfo appInfo) {
		Long bid = brandManager.saveBrand(brandRequest);
		Result<Long> result = new Result<>();
		result.setData(bid);
		return result;
	}

	@Override
	public Result<Integer> deleteBrandById(Long id, AppInfo appInfo) {
		Integer bid = brandManager.deleteBrandById(id);
		Result<Integer> result = new Result<>();
		result.setData(bid);
		return result;
	}
	

}
