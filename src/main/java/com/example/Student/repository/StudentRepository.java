package com.example.Student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.Student.entity.Student;

public interface StudentRepository extends MongoRepository<Student,String> {
	//here we are making a generic type student is the entity and string the type
    //getAllstudents()
    //getStudent(String id)
    //updateStudent(Student t)
    // deleteStudent(String id)
	
}
