package com.tdeado.tourism;


import com.aliyuncs.exceptions.ClientException;
import com.google.gson.Gson;
import com.tdeado.tourism.utils.AliSms;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        AliSms aliSms = new AliSms();
        try {
            Map<String, String> stringMap = new HashMap<>();
            stringMap.put("code", "395813");
            stringMap.put("product", "通道网");
            String s = aliSms.sendSms("18152733661", "SMS_12165683", new Gson().toJson(stringMap));
            System.err.println(s);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
