package com.ca.classes;

public class Faculty {
	private int faculty_id;
	private String password;
	private String email_id;
	private int phone_number;
	
	public Faculty(int faculty_id, String password, String email_id, int phone_number) {
		super();
		this.faculty_id = faculty_id;
		this.password = password;
		this.email_id = email_id;
		this.phone_number = phone_number;
	}

	public Faculty() {
		super();
	}

	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
	


}
