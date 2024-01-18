package com.example.Course.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Course.entity.Course;
import com.example.Course.repository.CourseRepository;
@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAllCourses(String studentsId){
	 try {
		 
		List<Course> courses = new ArrayList<>();
		courseRepository.findByStudentId(studentsId)
		.forEach(courses::add);
		return courses;
	 }catch (Exception e) {
		 e.printStackTrace();
		 return  null;
	}
		
	}
	
	public Course getCourse(String id) {
			return courseRepository.findById(id).get();
	}
	
	public void addCourse(Course course ) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	  
}
