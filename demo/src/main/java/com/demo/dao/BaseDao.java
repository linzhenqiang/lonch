package com.demo.dao;

import java.util.List;
import java.util.Map;

/**
 * 所有业务模块的公用方法
 * 
 */
public interface BaseDao<T> {

	/**
	 * 添加实体
	 */
	public long insert(T entity);

	/**
	 * 修改实体
	 */
	public void update(T entity);

	/**
	 * 删除实体
	 */
	public void delete(String id);

	/**
	 * 获得指定的实体
	 */
	public T get(String id);

	/**
	 * 获得指定的实体List
	 */
	public List<T> getList(Map<String, Object> params);

}
