package com.yougou.itemcenter.exception;

public class DAOException extends Exception {
    private static final long serialVersionUID = -1126394311702841261L;

    private String errorCode;

    private String errorMSG;

    public DAOException() {
        super();
    }

    public DAOException(Throwable throwable) {
        super(throwable);
    }

    public DAOException(String errorCode, String errorMSG) {
        super(errorMSG);
        this.errorCode = errorCode;
        this.errorMSG = errorMSG;
    }

    public DAOException(String errorCode, String errorMSG, Throwable throwable) {
        super(errorMSG, throwable);
        this.errorCode = errorCode;
        this.errorMSG = errorMSG;
    }


    public DAOException(String errorMSG, Throwable throwable) {
        super(errorMSG, throwable);
        this.errorMSG = errorMSG;
    }

}
