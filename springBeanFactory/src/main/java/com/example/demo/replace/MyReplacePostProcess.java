package com.example.demo.replace;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MyReplacePostProcess implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		return "对不起，"+obj.getClass().getSimpleName()+"的"+method.getName()+"被替换掉了";
	}

}
