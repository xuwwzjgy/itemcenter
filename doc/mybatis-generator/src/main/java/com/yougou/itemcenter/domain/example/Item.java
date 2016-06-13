package com.yougou.itemcenter.domain.example;

import java.math.BigDecimal;
import java.util.Date;

public class Item {
    /**
     * 商品id
     */
    private Long id;

    /**
     * 商品货号
     */
    private String goodsno;

    /**
     * 正品价
     */
    private BigDecimal marketprice;

    /**
     * 销售价
     */
    private BigDecimal saleprice;

    /**
     * 位从右到左分别表示商品基本信息是否录入、图片是否录入、详情信息是否录入
     */
    private Byte infoflag;

    /**
     * 缩略图地址
     */
    private String showpicpath;

    /**
     * 最低层类目id
     */
    private Long lowcategoryid;

    /**
     * 所属品牌
     */
    private Long brandid;

    /**
     * 商品名称
     */
    private String productname;

    /**
     * 店铺id
     */
    private Long shopid;

    /**
     * 运费模板id
     */
    private Long carriagetempid;

    /**
     * 1, 平台自采
            2, 平台代销
            3, 商家自运营
     */
    private Byte salemode;

    /**
     * 1在售中
             0已下架
     */
    private Byte status;

    /**
     * 商家
     */
    private Long businessid;

    /**
     * 是否被删除
     */
    private Byte isdelete;

    /**
     * 修改时间
     */
    private Date gmtmodified;

    /**
     * 创建时间
     */
    private Date gmtcreate;

    /**
     * 标识
     */
    private Byte flag;

    /**
     * 格式如：k1=v1;k2=v2…
     */
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

    public Date getGmtmodified() {
        return gmtmodified;
    }

    public void setGmtmodified(Date gmtmodified) {
        this.gmtmodified = gmtmodified;
    }

    public Date getGmtcreate() {
        return gmtcreate;
    }

    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
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