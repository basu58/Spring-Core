package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.bean.Vehicle;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Vehicle v=ctx.getBean("vehicle", Vehicle.class);
		System.out.println(v);
	}

}
