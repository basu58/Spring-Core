package com.basu.beans;

import java.util.Date;

public class ScheduleReminder {
	private Date date;

	public ScheduleReminder(Date date) {
		System.out.println("ScheduleReminder.ScheduleReminder()");
		this.date = date;
	}
	
	public String reminderOfTheDay() {
		Date sysDate=new Date();
		if(sysDate.getYear()==date.getYear() && sysDate.getMonth()==date.getMonth() && sysDate.getDay()==date.getDay())
			return "Today you have an appointment...";
		else
			return "Today you don't have an appointment...";
	}

	
	
}
