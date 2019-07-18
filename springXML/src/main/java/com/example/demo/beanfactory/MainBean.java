package com.example.demo.beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MainBean implements BeanFactoryAware{
	
	private BeanFactory beanFactory;
	

	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		this.beanFactory=beanFactory;
	}

	private BeanFactoryTry bean;

	public BeanFactoryTry getBean() {
		return (BeanFactoryTry) beanFactory.getBean("prototype");
	}

	public void setBean(BeanFactoryTry bean) {
		this.bean = bean;
	}
	
}
