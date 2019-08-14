package com.ca.classes;

public class MeritStudent {
	private String name;
	private String course_name;
	private String email;
	private long phoneNum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public MeritStudent(String name, String course_name, String email, long phoneNum) {
		super();
		this.name = name;
		this.course_name = course_name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
}
