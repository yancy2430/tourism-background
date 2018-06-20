package com.tdeado.tourism.utils;

/**
 * 字符串处理类
 */
public class StringUtils {


    public static boolean isEmpty(String str){

        if (str!=null && !"".equals(str)){
            return true;
        }
        return false;
    }
}
