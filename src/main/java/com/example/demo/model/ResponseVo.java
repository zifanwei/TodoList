package com.example.demo.model;

import com.example.demo.constant.ResponseEnum;

public class ResponseVo<T> {
    private String statusCode;
    private String message;
    private T data;

    public ResponseVo(String statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public ResponseVo() {

    }

    public ResponseVo<T> success(T data) {
        this.message = ResponseEnum.SUCCESS.message;
        this.statusCode = ResponseEnum.SUCCESS.code;
        this.data = data;
        return this;
    }

    public ResponseVo<T> failed() {
        this.message = ResponseEnum.FAILED.message;
        this.statusCode = ResponseEnum.FAILED.code;
        return this;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
