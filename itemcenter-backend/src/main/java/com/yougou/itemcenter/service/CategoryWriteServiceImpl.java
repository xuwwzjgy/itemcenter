package com.yougou.itemcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.backend.CategoryWriteService;
import com.yougou.itemcenter.service.manager.CategoryManager;

@Service
public class CategoryWriteServiceImpl implements CategoryWriteService {
	@Autowired
	private CategoryManager categoryManager;
	
	@Override
	public Result<Long> saveCategory(CategoryRequest categoryRequest, AppInfo appInfo) {
		Long cid = categoryManager.saveCategory(categoryRequest);
		Result<Long> result = new Result<>();
		result.setData(cid);
		return result;
	}
	
	@Override
	public Result<Integer> deleteCategoryById(Long id, AppInfo appInfo) {
		Result<Integer> result = new Result<>();
		Integer delnumber = categoryManager.deleteCategoryById(id);
		result.setData(delnumber);
		return result;
	}

}
