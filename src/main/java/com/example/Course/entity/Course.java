package com.example.Course.entity;

import com.example.Student.entity.Student;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;


@Entity
public class Course {
  private String id;
  private String coursename;
  private String department;
  //to tie student id with course id
  //the course will be related to one student
  @ManyToOne
  private Student student;
public Course() {
	
}
public Course(String id, String coursename, String department, String studentId)
{   
	super();
	this.id = id;
	this.coursename = coursename;
	this.department = department;
	//creating an instance 
	this.student    = new Student(studentId,"","");
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
}
