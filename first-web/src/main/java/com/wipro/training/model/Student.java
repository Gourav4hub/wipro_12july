package com.wipro.training.model;

public class Student 
{
	private int roll;
	private String name;
	private Float marks;
	private String city;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, Float marks, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
