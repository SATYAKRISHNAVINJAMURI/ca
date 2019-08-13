package com.ca.classes;

public class Student {
	private int student_id;
	private String password;
	private String name;
	private String email;
	private String department;
	private String date_of_birth;
	private String address;
	private String phoneno;
	
	public Student() {
		super();
	}
	
	

	public Student(int student_id, String password, String name, String email, String department, String date_of_birth,
			String address, String phoneno) {
		super();
		this.student_id = student_id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.department = department;
		this.date_of_birth = date_of_birth;
		this.address = address;
		this.phoneno = phoneno;
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
