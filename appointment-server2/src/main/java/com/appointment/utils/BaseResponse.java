package com.appointment.utils;

public class BaseResponse <T> {


    public BaseResponse() {
        this.data = null;//"";
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;//"";
    }

    public BaseResponse(String code, String message, T/*Object*/ data) {
        this.code = code;
        this.message = message;
        this.data = data;//data;
    }

    public BaseResponse(T/*Object*/ data) {
        this.code = "0";
        this.message = "成功";
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T/*Object*/ getData() {
        return data;
    }

    public void setData(T/*Object*/ data) {
        this.data = data;
    }

    private String code;
    private String message;
    private T data;
}
