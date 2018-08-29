package com.demo.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
	/**
	 * 添加实体
	 */
	public void insert(T entity);

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
