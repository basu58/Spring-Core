package com.basu.beans;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart 0-param constructor..");
	}
	
	@Override
	public String deliver(int order_id) {
		return "Flipkart order through BlueDart and order id: "+order_id;
	}

}
