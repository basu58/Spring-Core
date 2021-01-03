package com.basu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.beans.TourPlan;
import com.basu.beans.TravelAgent;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TravelAgent t=ctx.getBean("agent", TravelAgent.class);
		System.out.println(t);
		
		t.show();
			
	}

}
