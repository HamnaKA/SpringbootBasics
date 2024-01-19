package com.example.Course.entity;

import com.example.Student.entity.Student;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "mycollection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	@Id
  private String id;
  private String coursename;
  private String department;
  //to tie student id with course id
  //the course will be related to one student
  @ManyToOne
  private Student student;
}
