package com.yougou.itemcenter.service.backend;

import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.domain.result.Result;

/**
 * 
 * @author hzxuwangwei
 *
 */
public interface CategoryWriteService {

	/**
	 * 类目，包括属性的添加删除
	 * @param categoryRequest
	 * @param appInfo
	 * @return
	 */
	Result<Long> saveCategory(CategoryRequest categoryRequest,AppInfo appInfo);
	
	/**
	 * 
	 * @param id
	 * @param appInfo
	 * @return
	 */
	Result<Integer> deleteCategoryById(Long id, AppInfo appInfo);
}
