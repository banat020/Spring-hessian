package com.banling.springhessian.server.ds.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.banling.springhessian.ds.base.service.IGenericService;
import com.banling.springhessian.ds.sys.service.ISysUsersService;
import com.banling.springhessian.facade.ds.sys.service.IDsSysUsersService;
import com.banling.springhessian.module.db.sys.SysUsers;
import com.banling.springhessian.server.ds.service.base.BaseDsService;


@Service
public class DsSysUsersService extends BaseDsService<SysUsers,String> implements IDsSysUsersService {

	@Resource
	private ISysUsersService sysUsersService;

	@Override
	protected IGenericService<SysUsers> getGenericService() {
		// TODO Auto-generated method stub
		return sysUsersService;
	}

	@Override
	public String createJpql() {
		// TODO Auto-generated method stub
		return "select a from SysUsers a where userName like :userName";
	}


}
