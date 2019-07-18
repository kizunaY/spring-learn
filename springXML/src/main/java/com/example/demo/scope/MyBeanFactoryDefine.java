package com.example.demo.scope;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.example.demo.xmlparse.Aclass;
import com.example.demo.xmlparse.Bclass;

public class MyBeanFactoryDefine {
	
	public static BeanFactory getMyBeanFactory() {
		ConfigurableBeanFactory beanFactory=new DefaultListableBeanFactory();
		Scope myScope=new ThreadScope();
		beanFactory.registerScope("thread", myScope);
		AbstractBeanDefinition beanB=new RootBeanDefinition(Bclass.class);
		AbstractBeanDefinition beanA=new RootBeanDefinition(Aclass.class);
		MutablePropertyValues propertyValuesB=new MutablePropertyValues();
		propertyValuesB.add("a", beanA);
		propertyValuesB.add("b", "BClass类b属性编码方式Setter注入");
		beanB.setPropertyValues(propertyValuesB);
		
		MutablePropertyValues propertyValuesA=new MutablePropertyValues();
		propertyValuesA.add("c", new Aclass("Aclass类 c属性编码Setter注入值",0));
		propertyValuesA.add("b", 2);
		propertyValuesA.add("a", "Aclass类 a属性编码Setter注入值");
		beanA.setPropertyValues(propertyValuesA);
		
		beanB.setScope("thread");
		beanA.setScope("singleton");
		((DefaultListableBeanFactory)beanFactory).registerBeanDefinition("threadScope", beanB);
		((DefaultListableBeanFactory)beanFactory).registerBeanDefinition("singletonScope", beanA);
		return beanFactory;
	}
	
	public static void main(String[] args) {
//		BeanFactory beanFactory=getMyBeanFactory();
//		Aclass aclass=(Aclass)beanFactory.getBean("singletonScope");	
//		Bclass bclass=(Bclass)beanFactory.getBean("threadScope");
//		if(bclass!=null) {
//			System.out.println(bclass.getB());
//			bclass.getA().say();
//		}
		BeanFactory beanFactory=new BeanFactoryScopeTry();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
		reader.loadBeanDefinitions("simple.xml");
		Bclass b=(Bclass) beanFactory.getBean("scopeDefineTry");
		b.getA().say();
	}
}
