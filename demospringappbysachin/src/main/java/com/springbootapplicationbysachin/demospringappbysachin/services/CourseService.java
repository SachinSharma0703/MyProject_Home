package com.springbootapplicationbysachin.demospringappbysachin.services;

import java.util.List;

import com.springbootapplicationbysachin.demospringappbysachin.entity.Course;

public interface CourseService {
	
	public List<Course> getAllCourse();

	public Course getCourse(int courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(int parseInt);

	

}
