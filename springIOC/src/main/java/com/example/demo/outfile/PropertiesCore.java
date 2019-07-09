package com.example.demo.outfile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import com.example.demo.core.bean.impl.ABclass;
import com.example.demo.core.bean.impl.Aclass;
import com.example.demo.core.bean.impl.Bclass;

public class PropertiesCore {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanRegistry=new DefaultListableBeanFactory();
		BeanFactory provider=bindViaPropertiesFile(beanRegistry);
		
	   ABclass ab=provider.getBean(ABclass.class);
	   Aclass a=ab.getA();
	   Bclass b=ab.getB();
	   a.say();
	   b.listen();
	}
	
	private static BeanFactory bindViaPropertiesFile(BeanDefinitionRegistry registry) {
		PropertiesBeanDefinitionReader reader=new PropertiesBeanDefinitionReader(registry);
		reader.loadBeanDefinitions("classpath:simple.properties");
		return (BeanFactory)registry;
	}
}
