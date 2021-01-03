package com.basu.beans;

public class FactoryInstance {
	
	public Factory createInstance(String name) {
		System.out.println("createInstance() method called.. name="+name);
		return new Factory(name);
	}
}
