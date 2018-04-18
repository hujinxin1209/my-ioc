package com.ugia.ioc;

import java.beans.beancontext.BeanContext;
import java.util.Set;

public interface Container {
	// 根据class 获取Bean
	public <T> T getBean(Class<T> clazz);
	
	// 根据名称获取Bean
	public <T> T getBeanByName(String name);
	
	// 注册一个Bean到容器中
	public Object registerBean(Object bean);
	
	// 注册一个class到容器中
	public Object registerBean(Class<?> clazz);
	
	// 注册一个带名称的Bean到容器中
	public Object registerBean(String name, Object bean);
	
	// 删除一个Bean
	public void remove(Class<?> clazz);
	
	// 根据一个名称删除Bean
	public void removeByName(String name);
	
	// 返回所有Bean对象名称
	public Set<String> getBeanNames();
	
	// 初始化装配
	public void initWrited();
}
