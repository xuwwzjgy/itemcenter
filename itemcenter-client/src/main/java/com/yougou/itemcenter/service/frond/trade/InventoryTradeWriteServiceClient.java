package com.yougou.itemcenter.service.frond.trade;

import com.yougou.itemcenter.domain.inventory.InventoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.OccupyInventoryRequest;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.front.trade.InventoryTradeWriteService;

public class InventoryTradeWriteServiceClient implements InventoryTradeWriteService {

    private InventoryTradeWriteService inventoryTradeWriteService;


    @Override
    public Result<InventoryDTO> occupyTradeInventory(OccupyInventoryRequest request, AppInfo appInfo) {
        Result<InventoryDTO> resut = inventoryTradeWriteService.occupyTradeInventory(request, appInfo);
        return resut;
    }


    public void setInventoryTradeWriteService(InventoryTradeWriteService inventoryTradeWriteService) {
        this.inventoryTradeWriteService = inventoryTradeWriteService;
    }
}
