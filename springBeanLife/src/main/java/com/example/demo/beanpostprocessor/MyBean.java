package com.example.demo.beanpostprocessor;

import java.util.Base64;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements DecodAble,InitializingBean,DisposableBean{
	
	private String password;
	
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public void setPassword(String something) {
		// TODO Auto-generated method stub
		Base64.Encoder en=Base64.getEncoder();
		password=new String(en.encodeToString(something.getBytes()));
	}
	
	public void setValue(String someting) {
		password=someting;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("beanPostProcessor处理后的password："+password);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("bean执行了销毁的方法");
	}
}
