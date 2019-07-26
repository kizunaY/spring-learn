package com.example.demo.life;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.CglibSubclassingInstantiationStrategy;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.InstantiationStrategy;
import org.springframework.beans.factory.support.SimpleInstantiationStrategy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeginDemo {
	public static void main(String[] args) {
		InstantiationStrategy simple=new SimpleInstantiationStrategy();
		InstantiationStrategy cglib=new CglibSubclassingInstantiationStrategy();
		AbstractBeanFactory factory=new DefaultListableBeanFactory();
		AbstractAutowireCapableBeanFactory factory2=new DefaultListableBeanFactory();
		BeanWrapper wrapper=new BeanWrapperImpl();
		BeanPostProcessor beanPostProcessor=new BeanNameAutoProxyCreator();
		
		DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
		beanFactory.addBeanPostProcessor(beanPostProcessor);
		
		InstantiationAwareBeanPostProcessor instantiationAwareBeanPostProcessor=new BeanNameAutoProxyCreator();
		
		InitializingBean initializingBean=new ClassPathXmlApplicationContext();
		
		DisposableBean disposableBean;
		
		
		ConfigurableListableBeanFactory bean=new DefaultListableBeanFactory();
		bean.destroySingletons();
		
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext();
		applicationContext.registerShutdownHook();
	}
}
