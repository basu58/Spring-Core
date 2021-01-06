package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.beans.ScheduleReminder;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/basu/cfgs/applicationContext.xml");
		System.out.println("---------------------------------------------");
		ScheduleReminder sr=ctx.getBean("sr", ScheduleReminder.class);
		System.out.println("---------------------------------------------");
		System.out.println(sr.reminderOfTheDay());
		System.out.println("---------------------------------------------");
		((AbstractApplicationContext) ctx).close();
	}

}
