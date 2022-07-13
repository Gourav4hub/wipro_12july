package com.wipro.office.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	private Integer empId;
	private String empName;
	private String empEmail;
	private String empPassword;
	private Float empSalary;
	
	// Default Constuctor / Parameter Constructor
	// Getter and Setter
	// toString
}
