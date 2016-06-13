package com.yougou.itemcenter.domain.dto;

import java.math.BigDecimal;

/**
 *  @author hzdingjun
 */
public class ItemDTO {
    private Long id;

    private String goodsno;

    private BigDecimal marketprice;

    private BigDecimal saleprice;

    private Byte infoflag;

    private String showpicpath;

    private Long lowcategoryid;

    private Long brandid;

    private String productname;

    private Long shopid;

    private Long carriagetempid;

    private Byte salemode;

    private Byte status;

    private Long businessid;

    private Byte isdelete;

    private Byte flag;

    private String feature;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsno() {
        return goodsno;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno == null ? null : goodsno.trim();
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public Byte getInfoflag() {
        return infoflag;
    }

    public void setInfoflag(Byte infoflag) {
        this.infoflag = infoflag;
    }

    public String getShowpicpath() {
        return showpicpath;
    }

    public void setShowpicpath(String showpicpath) {
        this.showpicpath = showpicpath == null ? null : showpicpath.trim();
    }

    public Long getLowcategoryid() {
        return lowcategoryid;
    }

    public void setLowcategoryid(Long lowcategoryid) {
        this.lowcategoryid = lowcategoryid;
    }

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public Long getCarriagetempid() {
        return carriagetempid;
    }

    public void setCarriagetempid(Long carriagetempid) {
        this.carriagetempid = carriagetempid;
    }

    public Byte getSalemode() {
        return salemode;
    }

    public void setSalemode(Byte salemode) {
        this.salemode = salemode;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Long businessid) {
        this.businessid = businessid;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }
}