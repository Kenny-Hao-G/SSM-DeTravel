package com.deTravel.utils;

import org.springframework.util.DigestUtils;

public class MD5Utils {
    public static String getMd5(String password){
        String md5DigestAsHex = DigestUtils.md5DigestAsHex(password.getBytes());
        String substring = md5DigestAsHex.substring(2, 18);
        String salt= "com/wwp";
        String newPassword=md5DigestAsHex+substring+salt;
        return DigestUtils.md5DigestAsHex(newPassword.getBytes());
    }

    /*public static void main(String[] args) {
        System.out.println(getMd5("123456"));
    }*/
}
