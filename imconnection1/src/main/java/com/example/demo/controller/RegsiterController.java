package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserDao;
import com.example.demo.util.UtilbyPhone;


@RestController
@Controller
@RequestMapping("regsiter")
public class RegsiterController {
	
	@Autowired
	UserDao userdao;
	
	@RequestMapping("verifycode")
	public JSONObject getVerifyCode(@RequestParam("phone")String phone) {
		
		UtilbyPhone.getMessage(phone, "123456");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("value", "验证码已发送 ");
		jsonObject.put("result","Y");
		
		return jsonObject;
	}
	@RequestMapping("user")
	public JSONObject regsiterUser(@RequestParam("username")String username, @RequestParam("password") String password) {
		
		UserBean userBean = new UserBean();
		//第一次存入phonenumber
		userBean.setPhoneNumber(username);
		userBean.setPassword(password);
		
		
		userdao.insertUser(userBean);
		UserBean result = userdao.findbyPhone(username);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", "1");
		jsonObject.put("data", result);
		
		return jsonObject;
	}
	@RequestMapping("username")
	public JSONObject updateusername(@RequestParam("username")String username, @RequestParam("telphone") String phone) {
		
		//修改用户名
		userdao.updateUser(username, phone);
		UserBean result = userdao.findbyPhone(phone);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", "1");
		jsonObject.put("data", result);
		
		return jsonObject;
	}
}
