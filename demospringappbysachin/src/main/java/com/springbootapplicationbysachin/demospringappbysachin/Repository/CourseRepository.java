package com.springbootapplicationbysachin.demospringappbysachin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapplicationbysachin.demospringappbysachin.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
  