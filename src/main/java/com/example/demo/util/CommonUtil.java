package com.example.demo.util;

import java.util.UUID;

public class CommonUtil {
    public static String getUUID32(){
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
