package com.example.demo.test;

import java.lang.reflect.Field;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.example.demo.beanwrapper.MyBean;

public class BeanWrapperTest {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException {
		Object bean=Class.forName("com.example.demo.beanwrapper.MyBean").newInstance();
		Object a=Class.forName("com.example.demo.beanwrapper.MyBeanA").newInstance();
		Object b=Class.forName("com.example.demo.beanwrapper.MyBeanB").newInstance();
		
//		BeanWrapper wrapper=new BeanWrapperImpl(bean);
//		wrapper.setPropertyValue("a",a);
//		wrapper.setPropertyValue("b",b);
//		if (wrapper.getWrappedInstance() instanceof MyBean) {
//			System.out.println("1");
//		}
		
		Class beanClass=bean.getClass();
		Field fa=beanClass.getField("a");
		Field fb=beanClass.getField("b");
		fa.set(bean,a);
		fb.set(bean, b); 
		
		
	}
}
