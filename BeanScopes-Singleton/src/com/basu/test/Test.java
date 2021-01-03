package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.bean.Message;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Message m=ctx.getBean("msg", Message.class);
		m.setMessage("Hello");
		m.getMessage();
		
		Message m1=ctx.getBean("msg", Message.class);
		m1.getMessage();
		
		System.out.println("m==m1 "+(m==m1));
		((AbstractApplicationContext) ctx).close();
	}

}
