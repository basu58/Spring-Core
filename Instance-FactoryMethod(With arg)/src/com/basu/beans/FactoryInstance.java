package com.basu.beans;

public class FactoryInstance {
	
	public Factory createInstance() {
		System.out.println("createInstance() method called..");
		return new Factory();
	}
}
