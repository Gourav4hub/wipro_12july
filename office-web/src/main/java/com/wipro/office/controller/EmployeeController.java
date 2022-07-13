package com.wipro.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.office.entity.Employee;
import com.wipro.office.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee emp)
	{
		empRepo.save(emp);
		return "Employee Saved";
	}	
	
	@GetMapping("/list")
	public List<Employee> listEmployee()
	{
		List<Employee> list = empRepo.findAll();
		return list;
	}
}







