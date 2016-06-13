package com.yougou.itemcenter.service.backend;

import com.yougou.itemcenter.domain.dto.ItemDTO;
import com.yougou.itemcenter.domain.request.ItemSearchRequest;
import com.yougou.itemcenter.domain.result.Result;

import java.util.List;

/**
 * @author hzdingjun
 * @date 2016/6/3
 */
public interface ProductReadService {

    /**
     * 根据商品查询参数获取商品列表
     * @param itemSearchRequest
     * @return
     */
    Result<List<ItemDTO>> searchItem(ItemSearchRequest itemSearchRequest);

    /**
     * 根据店铺id，查询商品列表
     * @param shopId
     * @return
     */
    Result<List<ItemDTO>> queryItemListByShopId(Long shopId);

    /**
     * 根据类目id，查询商品列表
     * @param categoryId
     * @return
     */
    Result<List<ItemDTO>> queryItemListByCategoryId(Long categoryId);

    /**
     * 根据品牌id，查询商品列表
     * @param brandId
     * @return
     */
    Result<List<ItemDTO>> queryItemListByBrandId(Long brandId);


    /**
     * 根据供应商id和货号，查询商品列表
     * @param supplierId
     * @param goodsNo
     * @return
     */
    Result<List<ItemDTO>> getItemListBySupplierIdAndGoodsNo(long supplierId, String goodsNo);
}
