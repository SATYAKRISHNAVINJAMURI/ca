package com.ca.classes;

public class Alumni {
	private int student_id;
	private String password;
	private String name;
	private String email;
	private String department;
	public Alumni(int student_id, String password, String name, String email, String department) {
		super();
		this.student_id = student_id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.department = department;
	}
	public Alumni() {
		super();
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
