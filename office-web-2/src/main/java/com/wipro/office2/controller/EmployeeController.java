package com.wipro.office2.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.office2.entity.Employee;
import com.wipro.office2.model.EmployeeModel;
import com.wipro.office2.repository.EmployeeRepository;
import com.wipro.office2.response.ApiResponse;
import com.wipro.office2.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public ApiResponse saveEmployee(@RequestBody EmployeeModel emp)
	{
		Employee empObj = new Employee(emp);
		ApiResponse response = empService.saveEmployee(empObj);
		return response;
	}	
	
	@GetMapping("/list")
	public ApiResponse listEmployee()
	{
		ApiResponse response = empService.listEmployees();
		return response;
	}
	
	// PathVariable
	@GetMapping("/get/{empid}")
	public ApiResponse getEmployee(@PathVariable(name = "empid") Integer empId) 
	{
		ApiResponse response = empService.get(empId);
		return response;
	}
	
	@PutMapping("/update")
	public ApiResponse updateEmployee(@RequestBody EmployeeModel emp)
	{
		Employee empObj = new Employee(emp);
		ApiResponse response = empService.updateEmployee(empObj);
		return response;
	}	
	
	@DeleteMapping("/delete/{empid}")
	public ApiResponse deleteEmployee(@PathVariable(name = "empid") Integer empId) 
	{
		ApiResponse response = empService.deleteEmployee(empId);
		return response;
	}
}







