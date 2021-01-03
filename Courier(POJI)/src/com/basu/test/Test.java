package com.basu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.basu.beans.Flipkart;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/basu/config/applicationContext.xml"));
		
		Flipkart bean=factory.getBean("flpkt", Flipkart.class);
		String status=bean.purchase(new String[] {"Shirt","Pant","Mobile"});
		System.out.println(status);

	}

}
