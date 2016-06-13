package com.yougou.itemcenter.service.front.trade;

import com.yougou.itemcenter.domain.inventory.InventoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.OccupyInventoryRequest;
import com.yougou.itemcenter.domain.result.Result;

public interface InventoryTradeWriteService {

    public Result<InventoryDTO> occupyTradeInventory(OccupyInventoryRequest request, AppInfo appInfo);


}
