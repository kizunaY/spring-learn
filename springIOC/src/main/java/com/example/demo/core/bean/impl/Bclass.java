package com.example.demo.core.bean.impl;

import org.springframework.stereotype.Component;

import com.example.demo.core.bean.BClass;
@Component
public class Bclass implements BClass{
	@Override
	public void listen() {
		// TODO Auto-generated method stub
		System.out.println("try listen");
	}
}
