package com.example.demo.xmlparse.xml;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.xmlparse.ABclass;
import com.example.demo.xmlparse.Aclass;
import com.example.demo.xmlparse.Bclass;
import com.example.demo.xmlparse.Cclass;
import com.example.demo.xmlparse.Dclass;

public class XMLCore {
	
//	public static void main(String[] args) {
//		DefaultListableBeanFactory registry=new DefaultListableBeanFactory(); 
//		ApplicationContext registry=new ClassPathXmlApplicationContext("classpath:simple.xml");
//		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(registry);
//		reader.loadBeanDefinitions("simple.xml");
//	    Aclass x=(Aclass)registry.getBean("x");
//	    Aclass b=(Aclass)registry.getBean("property");
	    
//	    ABclass ab=(ABclass)registry.getBean("idreftry");
//		ABclass ab=(ABclass)registry.getBean("innerBeanTry");
//		ABclass ab=(ABclass)registry.getBean("listTry");
//		List<Object> a=ab.getB();
//		ABclass ab=(ABclass)registry.getBean("setTry");
//		Set<Object> c= ab.getC();
//	    System.out.println(c);
		
//		ABclass ab=(ABclass)registry.getBean("mapTry");
//		Map<Object,Object> d=ab.getD();

//		ABclass ab=(ABclass)registry.getBean("propertiesTry");
//		Properties e=ab.getE();
//		Set<Entry<Object, Object>> entries= e.entrySet();
//		Iterator<Entry<Object, Object>> iterator=entries.iterator();
//		while(iterator.hasNext()) {
//			Entry<Object, Object> param=iterator.next();
//			System.out.println(param);
//		}
//		ABclass ab=(ABclass)registry.getBean("dependsOnTry");
		
//		Bclass b=(Bclass)registry.getBean("autoByName");
//		Bclass b=(Bclass)registry.getBean("autoByType");
//		Bclass b=(Bclass)registry.getBean("autoByConstructor");
//		b.getA().say();
		
//	}
	
	public static void main(String[] args) {
		DefaultListableBeanFactory registry=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(registry);
		beanDefinitionReader.loadBeanDefinitions("simple.xml");
	    Cclass cclass=(Cclass)registry.getBean("abstractChildren1");
	    Dclass dclass=(Dclass)registry.getBean("abstractChildren2");
	    System.out.println(cclass.getA().equals(dclass.getA()));
	    System.out.println(cclass.getB().equals(dclass.getB()));
	    
	}
	
	
	
}
