package com.yougou.itemcenter.exception;
public class InventoryException extends Exception {
    private static final long serialVersionUID = 3108619562750109687L;
    private String errorCode;

    private String errorMSG;

    public InventoryException() {
        super();
    }

    public InventoryException(Throwable throwable) {
        super(throwable);
    }

    public InventoryException(String errorCode, String errorMSG) {
        super(errorMSG);
        this.errorCode = errorCode;
        this.errorMSG = errorMSG;
    }

    public InventoryException(String errorCode, String errorMSG, Throwable throwable) {
        super(errorMSG, throwable);
        this.errorCode = errorCode;
        this.errorMSG = errorMSG;
    }


    public InventoryException(String errorMSG, Throwable throwable) {
        super(errorMSG, throwable);
        this.errorMSG = errorMSG;
    }
}
