package com.banling.springhessian.web.ds.sys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.banling.springhessian.facade.ds.sys.service.IDsSysUsersService;
import com.banling.springhessian.module.db.sys.SysUsers;

@Controller
@RequestMapping("/sysUsers/*")
public class SysUsersController {
	@Resource
	private IDsSysUsersService dsSysUsersService;
	
	@RequestMapping("query")
	@ResponseBody
	public List<SysUsers> query(String userName){
		Map<String,Object> paramsMap=new HashMap<String,Object>();
		paramsMap.put("userName", "%user%");
		return dsSysUsersService.query(paramsMap, 1, 3);
	}
}
