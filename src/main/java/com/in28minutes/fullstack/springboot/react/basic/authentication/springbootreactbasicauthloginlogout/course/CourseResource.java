package com.in28minutes.fullstack.springboot.react.basic.authentication.springbootreactbasicauthloginlogout.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200", "http://localhost:8080" ,"http://10.0.0.107:8080"})
@RestController
public class CourseResource {

	@Autowired
	private CoursesHardcodedService courseManagementService;

	@GetMapping("10.0.1.39:8080/courses")
	public List<Course> getAllCourses(@PathVariable String username) {
		return courseManagementService.findAll();
	}
}