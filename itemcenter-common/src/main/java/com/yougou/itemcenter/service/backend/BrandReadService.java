package com.yougou.itemcenter.service.backend;

import java.util.List;

import com.yougou.itemcenter.Utils.Pager;
import com.yougou.itemcenter.domain.dto.BrandDTO;
import com.yougou.itemcenter.domain.request.BrandRequest;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.result.Result;

public interface BrandReadService {

	/**
	 * 查询品牌
	 * @param brandRequest
	 * @return
	 */
	Result<Pager<List<BrandDTO>>> queryBrandList(BrandRequest brandRequest, AppInfo appInfo);
}
