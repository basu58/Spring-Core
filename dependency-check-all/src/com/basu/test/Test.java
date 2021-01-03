package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Vehicle v=ctx.getBean("v", Vehicle.class);
		System.out.println(v);
		((AbstractApplicationContext) ctx).close();
	}

}
