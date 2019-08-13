package com.ca.classes;

public class Login {
	private int user_id;
	private int faculty_id;
	private int student_id;
	private String password;
	private String role;
	
	public Login(int user_id, int faculty_id, int student_id, String password, String role) {
		super();
		this.user_id = user_id;
		this.faculty_id = faculty_id;
		this.student_id = student_id;
		this.password = password;
		this.role = role;
	}

	public Login() {
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getFaculty_id() {
		return faculty_id;
	}

	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
