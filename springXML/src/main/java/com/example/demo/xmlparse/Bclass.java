package com.example.demo.xmlparse;

public class Bclass {
	private Aclass a;
	private String b;
	
	
	
	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public Aclass getA() {
		return a;
	}

	public void setA(Aclass a) {
		this.a = a;
	}

	public Bclass(Aclass a) {
		super();
		this.a = a;
	}

	public Bclass() {
		super();
	}
	
}
