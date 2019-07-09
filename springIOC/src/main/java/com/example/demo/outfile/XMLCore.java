package com.example.demo.outfile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.core.bean.impl.ABclass;
import com.example.demo.core.bean.impl.Aclass;
import com.example.demo.core.bean.impl.Bclass;
@ComponentScan
public class XMLCore {
	//装载xml中的依赖关系
	private static BeanFactory bindViaXmlFile(BeanDefinitionRegistry registry) {
	  XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(registry);
	  reader.loadBeanDefinitions("classpath:simple.xml");
	  return (BeanFactory)registry;
	}
	
	public static void main(String[] args) {
		DefaultListableBeanFactory registry=new DefaultListableBeanFactory();
		BeanFactory beanFactory=bindViaXmlFile(registry);
		ABclass ab=beanFactory.getBean(ABclass.class);
		
		Aclass a=ab.getA();
		Bclass b=ab.getB();
		
		a.say();
		b.listen();
	}
}
