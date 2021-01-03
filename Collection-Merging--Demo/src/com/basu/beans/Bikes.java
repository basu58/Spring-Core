package com.basu.beans;

import java.util.List;

public class Bikes {
	private List<String> bike_name;

	public void setBike_name(List<String> bike_name) {
		this.bike_name = bike_name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bike names = "+bike_name;
	}
	
	
}
