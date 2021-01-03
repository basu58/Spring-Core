package com.basu.beans;
public class Bike {
	private String id, make, engineCC;

	
	public void setId(String id) {
		this.id = id;
	}

	

	public void setMake(String make) {
		this.make = make;
	}

	

	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	
	@Override
	public String toString() {
		
		return "Bike id="+id+" make="+make+" engineCC="+engineCC;
	}
	
	
}
