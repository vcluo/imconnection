package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("login")
public class LoginController {
	@RequestMapping("index")
	public String index() {
		System.out.println(123456789);
		return "index";
	}
}
