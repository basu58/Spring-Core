package com.basu.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/basu/config/applicationContext.xml"));
		Class c1=factory.getBean("c1", Class.class);
		System.out.println("c1 data:"+c1+" & c1 class name: "+c1.getClass());
		Calendar c2=factory.getBean("c2", Calendar.class);
		System.out.println("c2 data: "+c2+" & c2 class name:"+c2.getClass());
		String s1=factory.getBean("s1", String.class);
		System.out.println("s1 data: "+s1+" & s1 class name:"+s1.getClass());
		String s2=factory.getBean("s2", String.class);
		System.out.println("s2 data: "+s2+" & s2 class name:"+s2.getClass());
		StringBuffer sb=factory.getBean("sb", StringBuffer.class);
		System.out.println("sb data: "+sb+" sb class name:"+sb.getClass());
		StringBuffer sb1=factory.getBean("sb1", StringBuffer.class);
		System.out.println("sb1 data: "+sb1+" & sb1 class name:"+sb1.getClass());
		

	}

}
