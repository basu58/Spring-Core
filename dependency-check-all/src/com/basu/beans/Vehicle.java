package com.basu.beans;

import org.springframework.beans.factory.annotation.Required;

public class Vehicle {
	private String vname;
	private Engine engine;
	private int id;
	
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [vname=" + vname + ", engine=" + engine + ", id=" + id + "]";
	}
	
	
	
}
