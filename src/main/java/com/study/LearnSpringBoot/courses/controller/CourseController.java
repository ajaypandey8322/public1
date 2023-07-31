package com.study.LearnSpringBoot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.LearnSpringBoot.courses.bin.Course;
import com.study.LearnSpringBoot.courses.repository.CourseRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CourseRepository repository;
	
	
	/* getting data here */
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		
		return repository.findAll();
		//return Arrays.asList(new Course(1,"Learn SpringBoot ****","in28Min"),new Course(2,"Learn Java","in28Minnow"));
	}
	
	
	/* getting data for specific id */
	// http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public Course getCoursesDetails(@PathVariable long id){
		Optional<Course> course = repository.findById(id);
		if(course.isEmpty())
		{
			throw new RuntimeException("This Course does not exist || Course ID " +id );
		}
		
		return course.get();
		
		
		//return new Course(1,"Learn SpringBoot","in28Min");
	}
	
	
	/* crate new resource*/
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
		
	}
	
	/* update an existing course*/
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id ,@RequestBody Course course) {
		repository.save(course);
		
	}
	
	/* update an existing course*/
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
		
	}
	
	
	

}
