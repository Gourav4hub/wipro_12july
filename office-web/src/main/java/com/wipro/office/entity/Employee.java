package com.wipro.office.entity;


import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee 
{
	@Id
	private String empId;
	
	private String empName;
	
	private String empEmail;	

	private String empPassword;	
	
	private Float empSalary;
	
}
