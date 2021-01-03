package com.basu.beans;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	private String s;

	public String getS() {
		return s;
	}
	
	@Required
	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return s;
	}
	
	

}
