package com.devtool.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
	
	int a= 67;
	int b= 899;
	return "this is just testig . sum of a and b is=" +(a+b);
}
}
