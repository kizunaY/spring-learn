package com.example.demo.core.bean.impl;

import org.springframework.stereotype.Component;

import com.example.demo.core.bean.AClass;
@Component
public class Aclass implements AClass{
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hello spring");
	}
}
