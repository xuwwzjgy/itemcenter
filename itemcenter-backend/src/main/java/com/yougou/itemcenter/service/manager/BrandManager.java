package com.yougou.itemcenter.service.manager;

import java.util.List;

import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.BrandDTO;
import com.yougou.itemcenter.domain.request.BrandRequest;

/**
 * 
 * @author hzxuwangwei
 *
 */
public interface BrandManager {

	/**
	 * 查询品牌
	 * @param brandRequest
	 * @return
	 */
	Pager<List<BrandDTO>> queryBrandList(BrandRequest brandRequest);
	
	/**
	 * 根据ID保存类目
	 * @param brandRequest
	 * @return
	 */
	Long saveBrand(BrandRequest brandRequest);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteBrandById(Long id);
}
