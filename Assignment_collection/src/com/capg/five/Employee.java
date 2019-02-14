package com.capg.five;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object arg0) {
		
		return true;
	}
	
	@Override
	public int hashCode() {
		
		return 12345;
	}
}
