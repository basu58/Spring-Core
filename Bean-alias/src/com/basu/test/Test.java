package com.basu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.basu.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/basu/config/applicationContext.xml"));
		Vehicle vehicle=factory.getBean("v", Vehicle.class);
		vehicle.move();

	}

}
