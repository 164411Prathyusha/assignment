package com.example.springboot.Controller;

public class User {

	private String Username;
	private Long salary;
	public User(String username, Long salary) {
		super();
		Username = username;
		this.salary = salary;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", salary=" + salary + "]";
	}
	
}
