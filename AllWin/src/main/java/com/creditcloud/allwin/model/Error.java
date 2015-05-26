package com.creditcloud.allwin.model;

public class Error {

    private String errorCode;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "Error [errorCode=" + errorCode + ", msg=" + msg + "]";
    }
}
