package com.yougou.itemcenter.domain.request.trade;

import com.yougou.itemcenter.domain.BaseDomain;

public class OccupyInventoryRequest extends BaseDomain {

    private static final long serialVersionUID = 2247442369637738031L;

    private Long itemId;

    private Boolean isSku;

    private Long skuId;

    private Integer occopyQuantity;

    private String tradeCode;

    private String tradeSubCode;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Integer getOccopyQuantity() {
        return occopyQuantity;
    }

    public void setOccopyQuantity(Integer occopyQuantity) {
        this.occopyQuantity = occopyQuantity;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getTradeSubCode() {
        return tradeSubCode;
    }

    public void setTradeSubCode(String tradeSubCode) {
        this.tradeSubCode = tradeSubCode;
    }

    public Boolean getSku() {
        return isSku;
    }

    public void setSku(Boolean sku) {
        isSku = sku;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
