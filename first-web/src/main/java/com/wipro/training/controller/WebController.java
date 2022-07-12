package com.wipro.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
