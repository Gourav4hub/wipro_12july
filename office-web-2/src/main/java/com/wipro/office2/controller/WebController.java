package com.wipro.office2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController
{
	@GetMapping("/")
	public String home() {
		return "Welcome Wipro Office";
	}
	
	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "Access Denied ";
	}
}
