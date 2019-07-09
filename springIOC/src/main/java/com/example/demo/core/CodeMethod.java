package com.example.demo.core;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

import com.example.demo.core.bean.impl.ABclass;
import com.example.demo.core.bean.impl.Aclass;
import com.example.demo.core.bean.impl.Bclass;

public class CodeMethod {
	
	
	private static BeanFactory bindVidCode(BeanDefinitionRegistry registry) {
		//定义bean
		AbstractBeanDefinition a=new RootBeanDefinition(Aclass.class);
		AbstractBeanDefinition b=new RootBeanDefinition(Bclass.class);
		AbstractBeanDefinition ab=new RootBeanDefinition(ABclass.class);
		//注册bean
		registry.registerBeanDefinition("a", a);
		registry.registerBeanDefinition("b", b);
		registry.registerBeanDefinition("c", ab);
		
		/**
		 * 对象的依赖关系处理
		 */
		
		//1.构造器注入
		ConstructorArgumentValues argValues=new ConstructorArgumentValues();
		argValues.addIndexedArgumentValue(0, a);
		argValues.addIndexedArgumentValue(1, b);
		ab.setConstructorArgumentValues(argValues);
		
		//2.setter注入
		MutablePropertyValues propertyValues=new MutablePropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("a",a));
		propertyValues.addPropertyValue(new PropertyValue("b",b));
		ab.setPropertyValues(propertyValues);
		
		return (BeanFactory)registry;
	}
	
	
	public static void main(String[] args) {
		BeanDefinitionRegistry registry=new DefaultListableBeanFactory();
		BeanFactory beanFactory= (BeanFactory)bindVidCode(registry);
		
		ABclass ab=beanFactory.getBean(ABclass.class);
		Aclass a=ab.getA();
		Bclass b=ab.getB();
		a.say();
		b.listen(); 
	}
}
