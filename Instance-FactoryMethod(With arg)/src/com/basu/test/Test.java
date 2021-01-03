package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.beans.Factory;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Factory f1=ctx.getBean("f1", Factory.class);
		System.out.println(f1);

	}

}
