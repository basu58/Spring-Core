package com.basu.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("dfb")
public class DateFactoryBean implements FactoryBean<Date> {
	@Value("2021")
	private int year;
	@Value("06")
	private int day;
	@Value("01")
	private int month;
	
	
	public DateFactoryBean() {
		System.out.println("DateFactoryBean.DateFactoryBean()");
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
