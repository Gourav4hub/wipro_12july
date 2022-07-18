package com.wipro.office2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wipro.office2.model.AddressModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	private String street;
	private String city;
	private String pincode;
	
	public Address(AddressModel address) {
		this.street = address.getStreet();
		this.city = address.getCity();
		this.pincode = address.getPincode();
	}
}
