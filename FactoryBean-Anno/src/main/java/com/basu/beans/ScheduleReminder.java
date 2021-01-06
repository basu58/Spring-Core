package com.basu.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("reminder")
public class ScheduleReminder {
	@Autowired
	private Date date;

	
	public String reminderOfTheDay() {
		Date sysDate=new Date();
		if(sysDate.getYear()==date.getYear() && sysDate.getMonth()==date.getMonth() && sysDate.getDay()==date.getDay())
			return "Today you have an appointment...";
		else
			return "Today you don't have an appointment...";
	}

	
	
}
