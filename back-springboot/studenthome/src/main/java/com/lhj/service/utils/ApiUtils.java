package com.lhj.service.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

public class ApiUtils {
    public static String apiHead(List<String> strList1, List<String> strList2) {
            String pdNull = pdNull(strList1, strList2);
            if (pdNull.equals("1")) {

            } else {
                //必参为空
                return pdNull;
            }
        strList1.clear();
        strList2.clear();
        return "1";
    }

    //判断必参是否为空
    public static String pdNull(List<String> strList1, List<String> strList2) {
        try {
            for (int i = 0; i < strList1.size(); i++) {
                if (strList2.get(i) == null || strList2.get(i).equals("")) {
                    //返回空值参数
                    return strList1.get(i) + "参数错误";
                }
            }
            return "1";
        } catch (Exception e) {
            e.printStackTrace();
            return "参数出错";
        }
    }

    //api尾部
    public static String apiFoot(int code, String parameter, String message, JsonArray dataJson, JsonObject result) {
        switch (code) {
            case 200:
                message = "success";
                break;
            case 500:
                message = "fail";
                break;
            case 300:
                message = parameter;
                break;
        }
        result.addProperty("code", code);
        result.addProperty("message", message);
        if (code == 200) {
            //成功数据
            result.add("data", dataJson);
        }
        return result.toString();
    }

}
