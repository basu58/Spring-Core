package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.beans.CheckVoter;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/basu/cfgs/applicationContext.xml");
		CheckVoter cv=ctx.getBean("cv", CheckVoter.class);
		System.out.println(cv.checkVoter());
		((AbstractApplicationContext) ctx).close();
	}

}
