package com.promineo.entity;

import java.util.Date;
import java.util.List;

public class TimeEntry {
	
	private Long id;
	private Date dateEntry;
	private double timeEntry; 
	private List<String> category;
	private String description;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateEntry() {
		return dateEntry;
	}

	public void setDateEntry(Date dateEntry) {
		this.dateEntry = dateEntry;
	}

	public double getTimeEntry() {
		return timeEntry;
	}

	public void setTimeEntry(double timeEntry) {
		this.timeEntry = timeEntry;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
