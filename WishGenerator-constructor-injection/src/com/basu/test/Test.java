package com.basu.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.basu.beans.WishGenerator;

public class Test {

	public static void main(String[] args) {
		System.out.println("main() clientapp");
		FileSystemResource res=new FileSystemResource("src/com/basu/config/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		WishGenerator bean=factory.getBean("wsg", WishGenerator.class);
		String result=bean.generateWishMsg();
		System.out.println(result);

	}

}
