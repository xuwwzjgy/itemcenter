package com.yougou.itemcenter.utils;

public enum DAOErrorConstants {

    DAO0000("DAO0000", "Insert DAO Error"),
    DAO0001("DAO0001", "Update DAO Error"),
    DAO0002("DAO0002", "Query DAO Error"),
    DAO0003("DAO0003", "Delete DAO Error"),
    ;

    private String errorCode;

    private String errorMSG;

    DAOErrorConstants(String errorCode, String errorMSG) {
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
