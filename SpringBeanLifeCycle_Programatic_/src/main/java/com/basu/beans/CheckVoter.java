package com.basu.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVoter implements InitializingBean, DisposableBean {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("CheckVoter.setName()");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("CheckVoter.setAge()");
		this.age = age;
	}
	//custom init method
	public String checkVoter() {
		if(age<18)
			return name+"U are not eligible to give vote.";
		else
			return name+" U are eligible to give vote.";
	}
	public void destroy() {
		System.out.println("CheckVoter.destroy()");
		name=null;
		age=0;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CheckVoter.afterPropertiesSet() spring provide init method...");
		if(age<0 || name==null)
			throw new IllegalArgumentException("please enter correct values...");
		
	}
}
