package com.wipro.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.training.model.Student;

@RestController
public class WebController 
{
	// http://localhost:8080
	@GetMapping("/")
	public String home() {
		return "Welcome My Spring Boot Home Response";
	}
	
	@GetMapping("/about")
	public String about() {
		return "Wipro Java Training is running";
	}
	
	@GetMapping("/getstudent")
	public Student get() {
		Student ob = new Student(101, "Vikas Parmar", 12000f, "Indore");
		return ob;
	}	

	@GetMapping("/liststudent")
	public List<Student> list() {
		List<Student> lst = new ArrayList<>();
		lst.add(new Student(101, "Vikas Parmar", 12000f, "Indore"));
		lst.add(new Student(102, "Mohan Sharma", 43000f, "Ujjain"));
		lst.add(new Student(103, "Vijay Prajpati", 25000f, "Dewas"));
		lst.add(new Student(104, "Lokesh", 22000f, "Indore"));
		return lst;
	}
}
