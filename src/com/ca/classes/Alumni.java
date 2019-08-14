package com.ca.classes;

import java.sql.Date;

public class Alumni extends User{
	private String name;
	private String email;
	private String department;
	private int phone;
	private Date yearOfJoining;
	private Date yearOfLeaving;
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Date getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(Date yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public Date getYearOfLeaving() {
		return yearOfLeaving;
	}
	public void setYearOfLeaving(Date yearOfLeaving) {
		this.yearOfLeaving = yearOfLeaving;
	}
	public Alumni(String name, String email, String department) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
	}
	public Alumni() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
