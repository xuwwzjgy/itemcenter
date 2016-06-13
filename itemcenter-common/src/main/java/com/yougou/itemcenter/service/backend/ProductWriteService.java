package com.yougou.itemcenter.service.backend;

import com.yougou.itemcenter.domain.dto.ItemDTO;
import com.yougou.itemcenter.domain.request.ItemSaveRequest;
import com.yougou.itemcenter.domain.result.Result;

/**
 * ProductWriteService
 *
 * @author hzdingjun
 * @date 2016/6/6
 */
public interface ProductWriteService {

    Result<ItemDTO> saveProduct(ItemSaveRequest itemSaveRequest);

    Result<ItemDTO> updateProduct(ItemSaveRequest itemSaveRequest);

}
