package com.wipro.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.training.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@GetMapping("/req1")
	public Student req1(@RequestParam(name = "rollnumber") int roll,
			@RequestParam(name = "name") String name,
			@RequestParam(name = "marks") float marks,
			@RequestParam(name = "city") String city) 
	{
		Student ob = new Student(roll,name,marks,city);
		return ob;
	}
	
	
	@GetMapping("/req2")
	public Student req2(@RequestParam(name = "rollnumber") int roll,
			@RequestParam(name = "name") String name,
			@RequestParam(name = "marks") float marks,
			@RequestParam(name = "city",required = false) String city) 
	{
		Student ob = new Student(roll,name,marks,city);
		return ob;
	}
	
	@GetMapping("/req3")
	public Student req3(@RequestParam(name = "rollnumber") int roll,
			@RequestParam(name = "name") String name,
			@RequestParam(name = "marks",required = false,defaultValue = "0") float marks,
			@RequestParam(name = "city",required = false) String city) 
	{
		Student ob = new Student(roll,name,marks,city);
		return ob;
	}
	
	
	@GetMapping("/req4")
	public Student req4(@RequestParam(name = "rollnumber") int roll,
			@RequestParam(name = "name") String name,
			@RequestParam(name = "marks",required = false) Float marks,
			@RequestParam(name = "city",required = false) String city) 
	{
		Student ob = new Student(roll,name,marks,city);
		return ob;
	}
	
	
	
	
	
	
	
}
