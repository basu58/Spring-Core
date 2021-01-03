package com.basu.beans;

import java.util.Arrays;

public class TourPlan {
	private String[] places;

	public void setPlaces(String[] places) {
		this.places = places;
	}
	
	
	public void t1() {
		System.out.println("TourPlan [places=" + Arrays.toString(places) + "]");
	}	
}