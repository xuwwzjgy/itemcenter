package com.yougou.itemcenter.service.backend;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yougou.itemcenter.domain.dto.CategoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.domain.result.Result;

@Service
public class CategoryReadServiceClient implements CategoryReadService {

    @Resource
    private CategoryReadService categoryReadService;
    
	@Override
	public Result<List<CategoryDTO>> queryCategoryTree(CategoryRequest categoryRequest, AppInfo appInfo) {
		Result<List<CategoryDTO>> resut = categoryReadService.queryCategoryTree(categoryRequest, appInfo);
		return resut;
	}
}
