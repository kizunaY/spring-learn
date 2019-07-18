package com.example.demo.beanfactory;

public class MyBeanFactory {

	
	public BeanFactoryTry getNonInstance() {
		 BeanFactoryTry bean=new BeanFactoryTry();
		 bean.setA("A Value");
		 return bean;
	}
	
	public static BeanFactoryTry getInstance() {
		 BeanFactoryTry bean=new BeanFactoryTry();
		 bean.setA("A Value");
		 return bean;
	}
}
