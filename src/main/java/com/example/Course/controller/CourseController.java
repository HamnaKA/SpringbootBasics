package com.example.Course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.entity.Student;
import com.example.Course.entity.Course;
import com.example.Course.service.CourseService;
@RestController
public class CourseController {
  @Autowired
  private CourseService courseService;
  
  @GetMapping("/student/{studentsId}/course")
  public List<Course> getAllCourses(@PathVariable String studentsId){
	  return courseService.getAllCourses(studentsId);
  }
  
  @GetMapping("/student/{studentsId}/course/{id}")
  public Course getCourse(@PathVariable String Id) {
	  return courseService.getCourse(Id);
  }
  
  @PostMapping("/student/{studentsId}/course")
  public void addCourse(@RequestBody Course course , @PathVariable String studentsId) {
	  course.setStudent(new Student(studentsId,"",""));
	  courseService.addCourse(course);
  }
  @PutMapping("/student/{studentsId}/course/{id}")
  public void updateCourse(@RequestBody Course course, @PathVariable String studentsId, @PathVariable String id) {
	  course.setStudent(new Student(studentsId,"",""));
	  courseService.updateCourse(course);
  }
  @DeleteMapping("/student/{studentId}/course/{id}")
  public void deleteCourse(@PathVariable String id) {
	  courseService.deleteCourse(id);
  }
}
