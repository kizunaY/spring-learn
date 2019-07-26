package com.example.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareDemo implements BeanNameAware,BeanClassLoaderAware,BeanFactoryAware{
	
	private String beanName;
	
	private BeanFactory factory;
	
	private ClassLoader loader;
	
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName=name;
	}
	
	public void say() {
		System.out.println(beanName+"被实例化了,它的beanFactory是："+factory+",它的ClassLoader是："+loader);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.factory=beanFactory;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		this.loader=classLoader;
	}

}
