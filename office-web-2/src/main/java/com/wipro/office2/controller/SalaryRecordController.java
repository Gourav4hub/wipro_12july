package com.wipro.office2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.office2.entity.Employee;
import com.wipro.office2.model.EmployeeModel;
import com.wipro.office2.model.SalaryRecordModel;
import com.wipro.office2.response.ApiResponse;
import com.wipro.office2.service.EmployeeService;
import com.wipro.office2.service.SalaryRecordService;

@RestController
@RequestMapping("/salaryrecord")
public class SalaryRecordController 
{
	@Autowired
	private SalaryRecordService salaryService;
	
	@PostMapping("/save")
	public ApiResponse saveRecord(@RequestBody SalaryRecordModel salModel)	{	
		
		ApiResponse response = salaryService.saveRecord(salModel);
		return response;
	}	
}
