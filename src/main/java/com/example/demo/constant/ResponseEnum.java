package com.example.demo.constant;

public enum ResponseEnum {
    SUCCESS("1_SUCCESS", "success"),
    FAILED("2_FAILED", "failed");

    public final String code;
    public final String message;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}