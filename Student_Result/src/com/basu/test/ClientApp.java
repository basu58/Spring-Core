package com.basu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.basu.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/basu/config/applicationContext.xml"));
		StudentController sc=factory.getBean("controller", StudentController.class);
		System.out.println(sc.process("123", "Basu", "55", "65", "75"));

	}

}
