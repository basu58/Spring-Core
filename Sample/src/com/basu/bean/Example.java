package com.basu.bean;

import org.springframework.beans.factory.annotation.Required;

public class Example {
	private int id;
	private String name;
	
	public Example() {
		System.out.println("Example 0-param constructor...");
	}
	
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + "]";
	}
}
