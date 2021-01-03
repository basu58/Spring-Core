package com.basu.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.basu.beans.Bike;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/basu/config/applicationContext.xml"));
		//Bike bean=factory.getBean("pulsor1", Bike.class);
		//System.out.println(bean);
		System.out.println(factory.getBean("pulsor1", Bike.class));

	}

}
