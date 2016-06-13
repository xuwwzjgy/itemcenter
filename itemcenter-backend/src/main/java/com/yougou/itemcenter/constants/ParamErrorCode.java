package com.yougou.itemcenter.constants;

public enum ParamErrorCode {
    SUCCESS("1912", "成功"),
    Param_CREATE_FAILED("1927", "商品属性创建失败"),
    Param_UPDATE_FAILED("1945", "商品属性更新失败"),
    Param_DELETE_FAILED("1949", "商品属性删除失败")
    ;


    private String errorCode;

    private String errorMSG;

    ParamErrorCode(String errorCode, String errorMSG) {
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
