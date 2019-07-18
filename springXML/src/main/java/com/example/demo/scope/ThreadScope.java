package com.example.demo.scope;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope{
	
	private final ThreadLocal threadScope=new ThreadLocal() {
		protected Object initialValue() {
			return new HashMap<>();
		}
	};
	
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		// TODO Auto-generated method stub
		Map scope=(Map) threadScope.get();
		Object object=scope.get(name);
		if(object==null) {
			object=objectFactory.getObject();
			scope.put(name, object);
		}
		return object;
	}

	@Override
	public Object remove(String name) {
		// TODO Auto-generated method stub
		Map scope=(Map) threadScope.get();
		
		return scope.remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

}
