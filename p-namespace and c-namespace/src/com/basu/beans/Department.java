package com.basu.beans;

import java.util.Date;

public class Department {
	private String deptno;
	private String name;
	private Date date;
	
	public Department(String deptno, String name, Date date) {
		System.out.println("Department.Department()");
		this.deptno = deptno;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", name=" + name + ", date=" + date + "]";
	}
	
}
