package com.basu.beans;
import java.util.Date;

public class WishGenerator {
	private String name;
	private Date date;
	
	public WishGenerator() {
		System.out.println("0-param constructor..");
	}
	
	public WishGenerator(String name, Date date) {
		super();
		this.name = name;
		this.date = date;
	}

	public String generateWishMsg() {
		return "Good Morning "+name+" "+date;
	}
	
}
