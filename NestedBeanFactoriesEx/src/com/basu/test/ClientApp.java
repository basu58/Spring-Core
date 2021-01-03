package com.basu.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.basu.beans.BankLoanApprover;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory pFactory=new XmlBeanFactory(new FileSystemResource("src/com/basu/config/loan-beans.xml"));
		
		BeanFactory cFactory=new XmlBeanFactory(new FileSystemResource("src/com/basu/config/approval-beans.xml"), pFactory);
		
		
		BankLoanApprover approver=cFactory.getBean("bla", BankLoanApprover.class);
		System.out.println(approver.approveLoans());
		

	}

}
