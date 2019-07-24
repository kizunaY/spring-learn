package com.example.demo.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.example.demo.postprocess.MyPropertyOverrideBean;

public class TestPropertyOverrideBean {
	
	public static void main(String[] args) {
		ConfigurableListableBeanFactory factory=new XmlBeanFactory(new ClassPathResource("simple.xml"));
//		PropertyOverrideConfigurer configurer=new PropertyOverrideConfigurer();
//		configurer.setLocation(new ClassPathResource("propertyOverride.properties"));
//		configurer.postProcessBeanFactory(factory);
		PropertyOverrideConfigurer config=(PropertyOverrideConfigurer)factory.getBean("dealWithReplace");
		config.postProcessBeanFactory(factory);
		MyPropertyOverrideBean bean=(MyPropertyOverrideBean)factory.getBean("overrideBean");
		bean.say();
	}
}
