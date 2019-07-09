package com.example.demo.autowaired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.core.bean.impl.ABclass;
import com.example.demo.core.bean.impl.Aclass;
import com.example.demo.core.bean.impl.Bclass;
@ComponentScan("com.example.demo")
public class AutowiredCore {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AutowiredCore.class);
		ABclass ab=ctx.getBean(ABclass.class);
		Aclass a=ab.getA();
		Bclass b=ab.getB();
		
		a.say();
		b.listen();
	}
}
