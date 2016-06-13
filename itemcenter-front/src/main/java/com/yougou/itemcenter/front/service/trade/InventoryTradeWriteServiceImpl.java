package com.yougou.itemcenter.front.service.trade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yougou.itemcenter.domain.inventory.InventoryDTO;
import com.yougou.itemcenter.domain.request.trade.AppInfo;
import com.yougou.itemcenter.domain.request.trade.OccupyInventoryRequest;
import com.yougou.itemcenter.domain.result.Result;
import com.yougou.itemcenter.service.front.trade.InventoryTradeWriteService;

public class InventoryTradeWriteServiceImpl implements InventoryTradeWriteService {

    private final static Logger logger = LoggerFactory.getLogger("trade");

    @Override
    public Result<InventoryDTO> occupyTradeInventory(OccupyInventoryRequest request, AppInfo appInfo) {

        logger.info("INFO@InventoryTradeWriteService.occupyTradeInventory:start, request={}, appInfo={}", new Object[]{
                request,
                appInfo
        });

        Result<Void> resut = new Result<Void>();

        try {




//        } catch (InventoryException e) {
//            logger.info("INFO@InventoryTradeWriteService.occupyTradeInventory:ThrowsInventoryException, request={}, appInfo={}", new Object[]{
//                    request,
//                    appInfo,
//            }, e);

        } catch (Exception e) {

        }

        logger.info("INFO@InventoryTradeWriteService.occupyTradeInventory:end, request={}, appInfo={}, result={}", new Object[]{
                request,
                appInfo,
                resut
        });
        
        return null;
    }
}
