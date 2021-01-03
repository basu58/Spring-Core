package com.basu.beans;

import java.util.Random;

public class Flipkart {
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart 0-param constructor..");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart: setCourier(-)..");
		this.courier = courier;
	}
	
	public String purchase(String[] items) {
		Random random=new Random();
		int orderid=random.nextInt(70000);
		/*String[] arr=new String[items.length];*/
		System.out.print("Items are: ");
		for(int i=0; i<items.length; i++) {
			System.out.print(items[i]+" ");
		}
		System.out.println();
		String status=courier.deliver(orderid);
		return status+" and Bill amount is: "+7000;
	}
	
	
}
