package com.basu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.basu.beans.Triangle_Point;

public class Shape {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/basu/config/applicationContext.xml"));
		Triangle_Point t=factory.getBean("target", Triangle_Point.class);
		t.draw();

	}

}
