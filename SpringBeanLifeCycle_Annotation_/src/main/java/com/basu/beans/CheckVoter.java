package com.basu.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CheckVoter {
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
	@PostConstruct
	public void check()throws Exception{
		System.out.println("CheckVoter.check() custom init method.");
			if(age<0 || name==null)
				throw new IllegalArgumentException("please enter correct values...");
	}
	public String checkVoter() {
		if(age<18)
			return name+"U are not eligible to give vote.";
		else
			return name+" U are eligible to give vote.";
	}
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("CheckVoter.destroy()");
		name=null;
		age=0;
	}
}
