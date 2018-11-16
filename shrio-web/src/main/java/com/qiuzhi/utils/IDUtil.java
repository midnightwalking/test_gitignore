package com.qiuzhi.utils;

import java.util.UUID;

/**
 * @author qiuzhi
 * @date 2018/11/16
 * @description
 */
public class IDUtil {
    public static String getUUID32(){
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }

}
