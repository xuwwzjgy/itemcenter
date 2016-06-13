package com.yougou.shopcenter.domain.constants;

public enum ErrorCode {
    SUCCESS("200", "成功"),
    SHOP_CREATE_FAILED("300", "店铺创建失败"),
    SHOP_BASE_CREATE_FAILED("301", "店铺基础数据创建失败"),
    SHOP_EXTEND_CREATE_FAILED("302", "店铺扩展数据数据创建失败"),
    SHOP_LOCATION_CREATE_FAILED("303", "店铺地址数据创建失败"),
    ;


    private String errorCode;

    private String errorMSG;

    ErrorCode(String errorCode, String errorMSG) {
        this.errorCode = errorCode;
        this.errorMSG = errorMSG;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMSG() {
        return errorMSG;
    }

    public void setErrorMSG(String errorMSG) {
        this.errorMSG = errorMSG;
    }
}
