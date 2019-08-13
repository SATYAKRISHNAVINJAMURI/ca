package com.ca.classes;

public class Branches {
	private String branch_id;
	private String branch_course;
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_course() {
		return branch_course;
	}
	public void setBranch_course(String branch_course) {
		this.branch_course = branch_course;
	}
	public Branches(String branch_id, String branch_course) {
		super();
		this.branch_id = branch_id;
		this.branch_course = branch_course;
	}
	public Branches() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
