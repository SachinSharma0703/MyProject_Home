package com.springbootapplicationbysachin.demospringappbysachin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapplicationbysachin.demospringappbysachin.entity.Course;
import com.springbootapplicationbysachin.demospringappbysachin.services.CourseService;
@RestController
public class MyController {
	//just example to check for response url by method call Api
	@GetMapping("/")
	public String home() {
		return "this is home";
	}
	  
	@Autowired
	private CourseService courseService;
	
	//fetching or retrieving all data from database / a List structure using url
	@GetMapping("/courses")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
		
	}
	// fetching or retrieving a single data from list/ DB
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		
		return courseService.getCourse(Integer.parseInt(courseId));
		
	}
	// creating or adding or inserting a data to list/ DB
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return courseService.addCourse(course);
	}
	//Updating a data to list/DB
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		
		return courseService.updateCourse(course);
	}
	//Delete a data to list/DB
	@DeleteMapping("courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int courseId) {
		//try {			
		courseService.deleteCourse(courseId);
		return new ResponseEntity<>(HttpStatus.OK);
//		}catch(Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
	}

}
