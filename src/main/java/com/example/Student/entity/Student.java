package com.example.Student.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

//@entity tell Jpa that to create a table with id, firstname and lastname
@Document(collection = "mycollection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
//tell the id is the primary key in the table
  @Id
  private String id;
  private String firstname;
  private String lastname;
  //constructor
  //empty or default constructor used to create student object
  // if constructors are not provided default values are assigned to member variables such as null,0 

}
