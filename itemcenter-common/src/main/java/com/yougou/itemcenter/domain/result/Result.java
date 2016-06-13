package com.yougou.itemcenter.domain.result;

import com.yougou.itemcenter.domain.BaseDomain;

public class Result<T> extends BaseDomain {

    private static final long serialVersionUID = -2904652160714221234L;

    private boolean success = Boolean.TRUE;

    private String errorCode;

    private String errorMSG;

    private T data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
