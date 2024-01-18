package com.example.Student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.entity.Student;
import com.example.Student.repository.StudentRepository;

@Service
public class StudentService {
   
	@Autowired
   private StudentRepository studentRepository;
	
   //private List<Student> student = Arrays.asList(
		   //new Student("101","Hamna","K A"),
		   //new Student("102","Henna","K A"),
		   //new Student("103","Nihal","K A"));
   
   public List<Student> getAllstudent(){
	   //return student;
	   //making call to student repository
	   List<Student> student = new ArrayList<>();
	   studentRepository.findAll()
	   .forEach(student::add);
	   return student;
   }
   public void addStudent(Student student) {
	   studentRepository.save(student);
   }
   
   public Student getStudent(String id) {
	   //this  is for return a list from hardcoded list
	   //return student.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	   // this is for returning a method using findbyid from a repository
	   return studentRepository.findById(id).get();
	   
   }
   public void updateStudent(String id,Student student) {
	   studentRepository.save(student);
   }
   public void deleteStudent(String id) {
	   studentRepository.deleteById(id);
   }
}
