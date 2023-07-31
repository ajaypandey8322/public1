package com.study.LearnSpringBoot.courses.bin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity//(name="course1")
public class Course {

	@Id
	@GeneratedValue
	private long id;
	
	//@Column(name = "course_name")
	private String name;
	private String author;
	
	public Course() {
		
	}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	
	
	
}
