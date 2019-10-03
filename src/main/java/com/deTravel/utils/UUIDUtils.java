package com.deTravel.utils;

import java.util.UUID;

/**
 * @author WWP
 * @description: TODO
 * @date 2019/8/29  11:59
 */
public class UUIDUtils {
    //uuid 是一个字符串，不可重复
    public static String  getUUID(){
        //uuid 全球唯一
        // ip + 电脑设备 + 时间戳
        String uuidStr =  UUID.randomUUID().toString().replace("-","");
        return uuidStr;
    }
}

