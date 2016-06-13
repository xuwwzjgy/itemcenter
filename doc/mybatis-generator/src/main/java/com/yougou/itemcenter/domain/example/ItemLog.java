package com.yougou.itemcenter.domain.example;

import java.util.Date;

public class ItemLog {
    /**
     * id
     */
    private Long id;

    /**
     * 实体ID
     */
    private Long entityid;

    /**
     * 3.商品修改
            4.商品删除
            5.商品上架
            6.商品下架
            13.sku删除
            14.sku修改
     */
    private Byte type;

    /**
     * 操作人
     */
    private String opraccount;

    /**
     * 操作内容
     */
    private String content;

    /**
     * 操作时间
     */
    private Date oprtime;

    /**
     * 修改时间
     */
    private Date gmtmodified;

    /**
     * 创建时间
     */
    private Date gmtcreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEntityid() {
        return entityid;
    }

    public void setEntityid(Long entityid) {
        this.entityid = entityid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getOpraccount() {
        return opraccount;
    }

    public void setOpraccount(String opraccount) {
        this.opraccount = opraccount == null ? null : opraccount.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getOprtime() {
        return oprtime;
    }

    public void setOprtime(Date oprtime) {
        this.oprtime = oprtime;
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
}