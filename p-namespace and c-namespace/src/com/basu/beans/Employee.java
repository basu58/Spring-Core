package com.basu.beans;

public class Employee {
	private String ename;
	private int age;
	private Department dept;
	public Employee() {
		System.out.println("Employee.Employee()");
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age + ", dept=" + dept + "]";
	}
	
	
}
