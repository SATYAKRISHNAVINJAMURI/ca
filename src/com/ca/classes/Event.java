package com.ca.classes;

import java.sql.Time;


public class Event {
	private String name;
	private String description;
	private Time time;
	private String venue;
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	
}
