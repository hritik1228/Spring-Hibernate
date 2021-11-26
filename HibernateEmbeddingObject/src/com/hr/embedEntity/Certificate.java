package com.hr.embedEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	@Column
	private String course;
	@Column
	private String duration;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Certificate() {
		
		// TODO Auto-generated constructor stub
	}
	public Certificate(String course, String duration) {
		this.course = course;
		this.duration = duration;
	}
	
	

}
