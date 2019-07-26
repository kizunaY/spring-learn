package com.example.demo.test;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.beanpostprocessor.MyBean;
import com.example.demo.beanpostprocessor.MyBeanPostProcessor;


public class BeanPostProcessorTest {
	
	public static void main(String[] args) throws Exception {
//		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions(new ClassPathResource("simple.xml"));
//		MyBeanPostProcessor beanPostProcessor=new MyBeanPostProcessor();
//		factory.addBeanPostProcessor(beanPostProcessor);
//		MyBean bean=(MyBean) factory.getBean("beanPostProcessor");
//		System.out.println("现在的password:"+bean.getPassword());
////		bean.destroy();
//		factory.destroySingletons();
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("simple.xml");
		applicationContext.registerShutdownHook();
	}
}
