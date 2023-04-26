package com.divya.springboot.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.springboot.learnspringboot.entity.Course;

@RestController
public class CourseController {

	
	@GetMapping("/getAllCourse")
	public List<Course> findAll()
	{
		return Arrays.asList(new Course (1,"LearnAws","Divya"),
				new Course(2,"DevOps","Shiva"),
				new Course(3,"DevOps","Raghav"));
	}
	
}
