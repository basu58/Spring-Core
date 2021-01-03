package com.basu.beans;
import java.util.Date;

/**
 * @author Basudev
 *
 */
public class WishGenerator {
	private String name;
	private Date date;
	
	public WishGenerator() {
		System.out.println("0-param constructor..");
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String generateWishMsg() {
		return "Good Morning "+name+" "+date;
	}
	
}
