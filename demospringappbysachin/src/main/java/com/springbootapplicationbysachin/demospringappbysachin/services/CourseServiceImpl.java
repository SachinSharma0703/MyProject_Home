package com.springbootapplicationbysachin.demospringappbysachin.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapplicationbysachin.demospringappbysachin.Repository.CourseRepository;
import com.springbootapplicationbysachin.demospringappbysachin.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;
    
	@Override
	public List<Course> getAllCourse() {
		return courseRepository.findAll();
	}
	@Override
	public Course getCourse(int courseId) {
		return courseRepository.getReferenceById(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}
	@Override
	public Course updateCourse(Course course) {
		courseRepository.save(course);
		return course;
	}
	@Override
	public void deleteCourse(int parseInt) {
		Course entity=courseRepository.getReferenceById(parseInt);
		courseRepository.delete(entity);
	}

}
