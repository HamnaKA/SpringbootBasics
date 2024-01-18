package com.example.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.entity.Student;
import com.example.Student.service.*;

@RestController
@RequestMapping("/student")
public class StudentController {
   @Autowired
   private StudentService studentservice;
   @GetMapping
   public List<Student> getAllstudent(){
	   return studentservice.getAllstudent();
   }
   @GetMapping("/{id}")
   public Student getStudent(@PathVariable String id) {
	return studentservice.getStudent(id);
	   
   }
   @PostMapping
   public void addStudent(@RequestBody Student student) {
	   studentservice.addStudent(student);
   }
   @DeleteMapping("/{id}")
   public void deleteStudent(@PathVariable String id) {
	   studentservice.deleteStudent(id);
   }
}
