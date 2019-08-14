package com.ca.classes;

public class Student extends User{
	private String name;
	private String email;
	private String department;
	private String date_of_birth;
	private String address;
	private String phoneno;
	
	public Student() {
		super();
	}
	
	

	public Student(String name, String email, String department, String date_of_birth,
			String address, String phoneno) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.date_of_birth = date_of_birth;
		this.address = address;
		this.phoneno = phoneno;
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

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
}
