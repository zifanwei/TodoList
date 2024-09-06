package com.example.demo.model;

import com.example.demo.constant.ResponseEnum;
import org.apache.coyote.Response;

import java.util.List;

public class ResponseVo<T> {
    private String statusCode;
    private String message;
    private List<T> data;

    public ResponseVo(String statusCode, String message, List<T> data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public ResponseVo() {

    }

    public ResponseVo<T> success(List<T> data) {
        this.message = ResponseEnum.SUCCESS.message;
        this.statusCode = ResponseEnum.SUCCESS.code;
        this.data = data;
        return this;
    }

    public ResponseVo<T> failed(String message) {
        this.statusCode = ResponseEnum.FAILED.code;
        this.message = message;
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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
