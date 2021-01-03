package com.basu.beans;

public class TravelAgent {
	private TourPlan tp;
	
	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent.TravelAgent()");
		this.tp = tp;
	}

	public TravelAgent() {
		System.out.println("0: param constrictor");
	}
	
	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent.setTp()");
		this.tp = tp;
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
