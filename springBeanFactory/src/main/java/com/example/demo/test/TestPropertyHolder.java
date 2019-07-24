package com.example.demo.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.postprocess.MyPropertyHolderBean;

public class TestPropertyHolder {
	public static void main(String[] args) {
		/**
		  DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		  XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions("simple.xml");
		*/
//		ConfigurableListableBeanFactory factory=new XmlBeanFactory(new ClassPathResource("simple.xml"));
//		PropertyPlaceholderConfigurer configurer=new PropertyPlaceholderConfigurer();
//		configurer.setLocation(new ClassPathResource("propertyHolder.properties"));
//		configurer.setSystemPropertiesModeName(constantName);(PropertyPlaceholderConfigurer.SYSTEM_PROPERTIES_MODE_NEVER);
		
//		configurer.postProcessBeanFactory(factory);
		ApplicationContext factory=new ClassPathXmlApplicationContext("simple.xml");
		MyPropertyHolderBean bean=(MyPropertyHolderBean) factory.getBean("propertyHolder");
		bean.say();
	}
}
