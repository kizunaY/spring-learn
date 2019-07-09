package com.example.demo.core.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ABclass {
	@Autowired
	private Aclass a;
	@Autowired
	private Bclass b;
	public ABclass(Aclass a, Bclass b) {
		super();
		this.a = a;
		this.b = b;
	}
	public ABclass() {
		super();
	}
	public Aclass getA() {
		return a;
	}
	public void setA(Aclass a) {
		this.a = a;
	}
	public Bclass getB() {
		return b;
	}
	public void setB(Bclass b) {
		this.b = b;
	}
	
	
}
