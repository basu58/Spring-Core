package com.basu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {

	@Autowired
	@Qualifier("b")
	private Engine eng1;
	
	@Autowired(required = true)
	public void assign(Engine eng) {
		System.out.println("assign..");
		this.eng1=eng1;
	}

	@Override
	public String toString() {
		return "Vehicle [eng1=" + eng1 + "]";
	}
	
	

}
