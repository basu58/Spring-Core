package com.basu.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date> {
	private int year;
	private int day;
	private int month;
	
	
	public DateFactoryBean() {
		System.out.println("DateFactoryBean.DateFactoryBean()");
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		System.out.println("DateFactoryBean.setYear()");
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		System.out.println("DateFactoryBean.setDay()");
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		System.out.println("DateFactoryBean.setMonth()");
		this.month = month;
	}

	@Override
	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		return new Date((year-1900), month-1, day);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean.getObjectType()");
		return Date.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return true;
	}

}
