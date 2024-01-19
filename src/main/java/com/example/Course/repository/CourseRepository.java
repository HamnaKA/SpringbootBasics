package com.example.Course.repository;


import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Course.entity.Course;


public interface CourseRepository extends MongoRepository<Course, String> {
	//when we want cust attribute it shoukld start with findby
	//here we are adding it because we are searching the course by the name what we are giving
	//if the studentid is string we can use this but if it class or object looking into field of that object we need to specify it in method name
//	public List<Course> findByStudent(String studentid);
	
	
    public List<Course> findByStudentId(String studentsId);
//    public List<Course> findByDescription(String )
}
