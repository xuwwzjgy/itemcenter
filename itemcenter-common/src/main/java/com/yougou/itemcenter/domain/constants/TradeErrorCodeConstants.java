package com.yougou.itemcenter.domain.constants;

public enum  TradeErrorCodeConstants {






    ;

    private String errorCode;

    private String errorMSG;

    TradeErrorCodeConstants(String errorCode, String errorMSG) {
        this.errorCode = errorCode;
        this.errorMSG = errorMSG;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMSG() {
        return errorMSG;
    }


}
