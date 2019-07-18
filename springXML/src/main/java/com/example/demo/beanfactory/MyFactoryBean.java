package com.example.demo.beanfactory;

import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean{

	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		BeanFactoryTry bean=new BeanFactoryTry();
		 bean.setA("A Value");
		 return bean;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return BeanFactoryTry.class;
	}

}
