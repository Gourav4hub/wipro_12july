package com.wipro.office.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.office.entity.Employee;
import com.wipro.office.repository.EmployeeRepository;
import com.wipro.office.response.ApiResponse;

@RestController
@RequestMapping("/employee")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/save")
	public ApiResponse saveEmployee(@RequestBody Employee emp)
	{
		try {
			empRepo.save(emp);
			return new ApiResponse(true, "Employee Saved Successfully !");
		}catch(Exception ex) {
			return new ApiResponse(false, "Employee Not Saved !");
		}
	}	
	
	@GetMapping("/list")
	public ApiResponse listEmployee()
	{
		List<Employee> list = empRepo.findAll();
		return new ApiResponse(true, list);
	}
	
	// PathVariable
	@GetMapping("/get/{empid}")
	public ApiResponse getEmployee(@PathVariable(name = "empid") Integer empId) 
	{
		Optional<Employee> op = empRepo.findById(empId);
		if(op.isPresent()) {
			return new ApiResponse(true, op.get());
		}else {
			return new ApiResponse(false, "No Employee Found !");
		}
	}
}







