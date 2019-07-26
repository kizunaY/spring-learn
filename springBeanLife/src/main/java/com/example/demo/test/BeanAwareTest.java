package com.example.demo.test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import org.springframework.core.io.ClassPathResource;

import com.example.demo.aware.BeanNameAwareDemo;

public class BeanAwareTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("simple.xml"));
		BeanNameAwareDemo demo=(BeanNameAwareDemo)factory.getBean("beanNameAware");
		demo.say();
	}
}
