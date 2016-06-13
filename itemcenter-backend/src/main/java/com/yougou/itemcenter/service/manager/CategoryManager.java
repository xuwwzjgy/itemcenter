package com.yougou.itemcenter.service.manager;

import java.util.List;

import com.yougou.itemcenter.domain.dto.CategoryDTO;
import com.yougou.itemcenter.domain.request.trade.CategoryRequest;

/**
 * 
 * @author hzxuwangwei
 *
 */
public interface CategoryManager {

	/**
	 * 查询类目树
	 * @param categoryRequest
	 * @return
	 */
	List<CategoryDTO> queryCategoryTree(CategoryRequest categoryRequest);
	
	/**
	 * 根据ID保存类目
	 * @param categoryRequest
	 * @return
	 */
	Long saveCategory(CategoryRequest categoryRequest);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteCategoryById(Long id);
}
