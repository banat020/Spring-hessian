package com.banling.springhessian.server.ds.service.base;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.banling.springhessian.ds.base.query.IQuery;
import com.banling.springhessian.facade.ds.service.base.IQueryService;

/**MyBatis查询工具类
 * @author Ban
 *
 */
@Service
public class QueryService implements IQueryService {
	
	@Resource
	private IQuery query;
	
	@Override
	public int queryForCount(String statementName, Map<String, Object> paramsMap) {
		// TODO Auto-generated method stub
		return query.queryForCount(statementName, paramsMap);
	}

	@Override
	public boolean isExists(String statementName, Map<String, Object> paramsMap) {
		// TODO Auto-generated method stub		
		return query.isExists(statementName, paramsMap);
	}

	@Override
	public List<Map<String, Object>> queryForList(String statementName,
			Map<String, Object> paramsMap) {
		// TODO Auto-generated method stub
		return query.queryForList(statementName, paramsMap);
	}

	@Override
	public List<Map<String, Object>> queryForList(String statementName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> queryForPage(String statementName,
			Map<String, Object> paramsMap, int skip, int size) {
		// TODO Auto-generated method stub
		return query.queryForPage(statementName, paramsMap, skip, size);
	}

	@Override
	public Map<String, Object> queryForObject(String statementName,
			Map<String, Object> paramsMap) {
		// TODO Auto-generated method stub
		return query.queryForObject(statementName, paramsMap);
	}

}
