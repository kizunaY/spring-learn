package com.example.demo.xmlparse;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class ABclass {
	
	static {
		Aclass.config().say();
	}
	
	private Aclass a;
	private List<Object> b;
	
	private Set<Object> c;
	
	private Map<Object, Object> d;
	
	private Properties e;
	

	
	public Properties getE() {
		return e;
	}

	public void setE(Properties e) {
		this.e = e;
	}

	public Map<Object, Object> getD() {
		return d;
	}

	public void setD(Map<Object, Object> d) {
		this.d = d;
	}

	public Set<Object> getC() {
		return c;
	}

	public void setC(Set<Object> c) {
		this.c = c;
	}

	public List<Object> getB() {
		return b;
	}

	public void setB(List<Object> b) {
		this.b = b;
	}

	public ABclass(Aclass a) {
		super();
		this.a = a;
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
	
	
}
