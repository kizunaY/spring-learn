package com.example.demo.beanpostprocessor;

import java.util.Base64;
import java.util.Base64.Decoder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if (bean instanceof DecodAble) {
			String password=((MyBean)bean).getPassword();
			System.out.println("原bean的password："+password);
			((MyBean)bean).setValue(decodeSomething(password));
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	
	private String decodeSomething(String something) {
		Base64.Decoder decoder=Base64.getDecoder();
		String result=new String(decoder.decode(something.getBytes()));
		return result;
	}
}
