package com.basu.beans;

public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC 0-param constructor..");
	}

	@Override
	public String deliver(int order_id) {
		
		return "Flipkart order through DTDC and order id: "+order_id;
	}

}
