package com.study.LearnSpringBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.LearnSpringBoot.courses.bin.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

	
	
}
