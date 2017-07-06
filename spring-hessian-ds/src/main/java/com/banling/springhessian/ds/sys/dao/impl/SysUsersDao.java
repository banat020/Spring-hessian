package com.banling.springhessian.ds.sys.dao.impl;

import com.banling.springhessian.module.db.sys.SysUsers;
import com.banling.springhessian.ds.base.dao.impl.GenericDao;
import com.banling.springhessian.ds.sys.dao.ISysUsersDao;

import org.springframework.stereotype.Component;

@Component("sysUserDao")
public class SysUsersDao extends GenericDao<SysUsers> implements ISysUsersDao {

}
