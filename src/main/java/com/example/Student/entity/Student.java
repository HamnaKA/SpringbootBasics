package com.example.Student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//@entity tell Jpa that to create a table with id, firstname and lastname
@Entity
public class Student {
//tell the id is the primary key in the table
  @Id
  private String id;
  private String firstname;
  private String lastname;
  //constructor
  //empty or default constructor used to create student object
  // if constructors are not provided default values are assigned to member variables such as null,0 
  public Student() {
  
  }
  //parameterized constructors
  public Student(String id, String firstname, String lastname) {
	  //private attributes
	  super();
	  this.id = id;
	  this.firstname = firstname;
	  this.lastname = lastname;
  }
 // getters and setters allow other classes or componenets to access and modify the private attributes 
 // commented simply this line
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
}
