package com.example.demo.test;

import java.beans.PropertyEditor;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.example.demo.postprocess.DateEditorBean;
import com.example.demo.propertyeditor.DatePropertyEditor;

public class CustomEditor {
	
	public static void main(String[] args) {
		ConfigurableListableBeanFactory factory=new XmlBeanFactory(new ClassPathResource("simple.xml"));
		CustomEditorConfigurer configurer=new CustomEditorConfigurer();
		Map<Class<?>, Class<? extends PropertyEditor>> map=new HashMap();
		map.put(Date.class,DatePropertyEditor.class);
		configurer.setCustomEditors(map);
		configurer.postProcessBeanFactory(factory);
		
		DateEditorBean bean=(DateEditorBean)factory.getBean("dateEditor");
		System.out.println(bean.getDate());
	}
}
