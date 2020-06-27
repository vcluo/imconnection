package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;




public class UtilbyPhone {
	public static void getMessage(String phone, String code) {
	    String host = "https://fesms.market.alicloudapi.com";
	    String path = "/sms/";
	    String method = "GET";
	    String appcode = "f72aa98d01bc4b0ebd42d0a50762c684";
	    Map<String, String> headers = new HashMap<String, String>();
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("code", code);
	    querys.put("phone", phone);
	    querys.put("skin", "1");
	    querys.put("sign", "175622");
	    try {
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    	System.out.println(EntityUtils.toString(response.getEntity()));
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	}

}
