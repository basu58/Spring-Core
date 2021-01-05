package com.basu.beans;

import lombok.Setter;

@Setter
public class TravelAgent {
	private TourPlan tp;
	
	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent.TravelAgent()");
		this.tp = tp;
	}
	
	public TravelAgent() {
		System.out.println("TravelAgent.TravelAgent()");
	}
	
	public void show() {
		tp.t1();
	}
	
	@Override
	public String toString() {
		return "TravelAgent [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
