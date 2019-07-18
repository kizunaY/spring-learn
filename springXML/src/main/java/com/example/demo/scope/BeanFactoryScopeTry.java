package com.example.demo.scope;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanFactoryScopeTry extends DefaultListableBeanFactory{
	public BeanFactoryScopeTry() {
		ThreadScope threadScope=new ThreadScope();
		this.registerScope("thread", threadScope);
	}
}
