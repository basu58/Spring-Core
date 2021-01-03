package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.beans.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e=ctx.getBean("e", Employee.class);
		System.out.println(e);
		((AbstractApplicationContext) ctx).close();
	}

}
