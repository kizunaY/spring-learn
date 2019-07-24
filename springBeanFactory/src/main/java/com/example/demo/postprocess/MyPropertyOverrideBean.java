package com.example.demo.postprocess;

public class MyPropertyOverrideBean {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void say() {
		System.out.println("username:"+username+";password:"+password);
	}
}
