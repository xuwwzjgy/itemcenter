package com.yougou.itemcenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yougou.itemcenter.domain.dto.CategoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.backend.CategoryReadService;
import com.yougou.itemcenter.service.manager.CategoryManager;

@Service
public class CategoryReadServiceImpl implements CategoryReadService {

	@Autowired
	private CategoryManager categoryManager;
	
	@Override
	public Result<List<CategoryDTO>> queryCategoryTree(CategoryRequest categoryRequest, AppInfo appInfo) {
		List<CategoryDTO> categoryDTOList = categoryManager.queryCategoryTree(categoryRequest);
		Result<List<CategoryDTO>> result = new Result<>();
		result.setData(categoryDTOList);
		return result;
	}

}
