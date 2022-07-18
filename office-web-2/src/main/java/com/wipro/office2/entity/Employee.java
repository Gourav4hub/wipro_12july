package com.wipro.office2.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.wipro.office2.model.EmployeeModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_info")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee 
{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	private String empName;
	
	private String empEmail;	

	private String empPassword;	
	
	private Float empSalary;
	
	@OneToOne
	@JoinColumn(name = "address")
	private Address address;

	public Employee(EmployeeModel emp) {
		this.empName = emp.getEmpName();
		this.empEmail = emp.getEmpEmail();
		this.empPassword = emp.getEmpPassword();
		this.empSalary = emp.getEmpSalary();
		
		Address address = new Address(emp.getAddress());
		this.address = address;
	}
}
