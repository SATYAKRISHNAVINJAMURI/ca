package com.ca.classes;

public class Faculty extends User {
	private String email_id;
	private int phone_number;
	
	public Faculty(String email_id, int phone_number) {
		super();
		this.email_id = email_id;
		this.phone_number = phone_number;
	}

	public Faculty() {
		super();
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
