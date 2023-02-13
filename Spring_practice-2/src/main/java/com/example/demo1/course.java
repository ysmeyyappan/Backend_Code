package com.example.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course {

	@Id
	int Couse_Id;
	String Course_name;
	
	public course(int couse_Id, String course_name) {
		super();
		Couse_Id = couse_Id;
		Course_name = course_name;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public int getCouse_Id() {
		return Couse_Id;
	}
	public void setCouse_Id(int couse_Id) {
		Couse_Id = couse_Id;
	}
	
}
