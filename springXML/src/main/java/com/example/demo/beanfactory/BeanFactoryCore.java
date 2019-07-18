package com.example.demo.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.jndi.JndiObjectFactoryBean;

import com.example.demo.xmlparse.Aclass;

public class BeanFactoryCore {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("simple2.xml");
//		MainBeanObjectFactory mainBean=(MainBeanObjectFactory) beanFactory.getBean("objectFactoryMainBean");
//		System.out.println(mainBean.getBean());
//		System.out.println(mainBean.getBean());
//		MainBean mainBean=(MainBean) beanFactory.getBean("lookup-method");
//		System.out.println(mainBean.getBean());
//		System.out.println(mainBean.getBean());
//		MainBean mainBean=(MainBean) beanFactory.getBean("beanFactoryAware");
//		System.out.println(mainBean.getBean());
//		System.out.println(mainBean.getBean());
		
//		MyFactoryBean factoryBean=(MyFactoryBean) beanFactory.getBean("&factoryBean");
//		MainBean bean=(MainBean) beanFactory.getBean("main");
//		System.out.println(bean.getBean().getA());
		
		Aclass a=(Aclass)beanFactory.getBean("replaceAMethod");
		a.say();
	}
}
