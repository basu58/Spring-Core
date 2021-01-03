package com.basu.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Vehicle {
	private String beanId;
	
	public Vehicle() {
		System.out.println("Vehicle 0-param constructor...");
	}

	public void setBeanId(String beanId) {
		this.beanId=beanId;
	}
	/*public Vehicle(String beanId) {
		System.out.println("parameterized constructor of Vehicle...");
		this.beanId=beanId;
	}*/
	public void move() {
		BeanFactory factory=
				new XmlBeanFactory(new FileSystemResource("src/com/basu/config/applicationContext.xml"));
		Engine engine=factory.getBean(beanId, Engine.class);
		engine.start();
		System.out.println("Engine moved");
	}
}
