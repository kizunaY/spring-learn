package com.example.demo.beanfactory;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.MethodReplacer;

public class MyMethodReplacer implements MethodReplacer{
	private static final Log logger=LogFactory.getLog(MyMethodReplacer.class);
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		logger.info("before excuting method");
		System.out.println(method.getName()+"on Object :"+obj.getClass().getName());
		logger.info("end of excuting method");
		return null;
	}

}
