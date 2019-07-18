package com.example.demo.xmlparse;

public class Aclass {

	private static Aclass c;
	
	public static Aclass config() {
		return c;
	}
	public static void setC(Aclass c) {
		Aclass.c = c;
	}
	
	
	public static Aclass getC() {
		return c;
	}


	private String a;
	private int b;
	
	
	public String getA() {
		return a;
	}

	
	
	
	public void setA(String a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public Aclass(String a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Aclass() {
		super();
	}
	
	public void say() {
		System.out.println("this bean ："+this.a +" b:"+this.b);
	}
	
}
