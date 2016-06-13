package com.yougou.itemcenter.service.backend;

import com.yougou.itemcenter.domain.request.BrandRequest;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.result.Result;

public interface BrandWriteService {

	/**
	 * 类目，包括属性的添加删除
	 * @param brandRequest
	 * @param appInfo
	 * @return
	 */
	Result<Long> saveBrand(BrandRequest brandRequest,AppInfo appInfo);
	
	/**
	 * 
	 * @param id
	 * @param appInfo
	 * @return
	 */
	Result<Integer> deleteBrandById(Long id, AppInfo appInfo);
}
