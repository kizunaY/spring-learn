package com.example.demo.beanfactory;

import org.springframework.beans.factory.ObjectFactory;


public class MainBeanObjectFactory {
	
	private ObjectFactory<BeanFactoryTry> objectFactory;
                                                                                                                                                            	
	public void setObjectFactory(ObjectFactory<BeanFactoryTry> objectFactory) {
		this.objectFactory = objectFactory;
	}

	private BeanFactoryTry bean;

	public BeanFactoryTry getBean() {
		return objectFactory.getObject();
	}

	public void setBean(BeanFactoryTry bean) {
		this.bean = bean;
	}
	
}
