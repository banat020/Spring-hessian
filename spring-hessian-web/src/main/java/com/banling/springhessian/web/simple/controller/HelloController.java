package com.banling.springhessian.web.simple.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.banling.springhessian.facade.simple.service.IHelloService;
import com.banling.springhessian.module.simple.MsgObj;

@Controller
@RequestMapping("/hello/*")
public class HelloController {
	@Resource
	private IHelloService helloService;
	
	@RequestMapping("sayHi")
	@ResponseBody
	public String sayHi(){
		System.out.println("test say hi ... ");
		return helloService.sayHi(" Hessian ");
	}
	
	@RequestMapping("getMsgs")
	@ResponseBody
	public List<MsgObj> getMsgs(){
		return helloService.getMsgs();
	}
	
}
