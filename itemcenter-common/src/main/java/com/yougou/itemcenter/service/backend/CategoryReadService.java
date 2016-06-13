package com.yougou.itemcenter.service.backend;

import java.util.List;

import com.yougou.itemcenter.domain.dto.CategoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;
import com.yougou.itemcenter.domain.result.Result;

public interface CategoryReadService {

	Result<List<CategoryDTO>> queryCategoryTree(CategoryRequest categoryRequest,AppInfo appInfo);
}
