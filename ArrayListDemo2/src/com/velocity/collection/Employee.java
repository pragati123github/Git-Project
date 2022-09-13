package com.velocity.collection;

public class Employee {
	String firstName ;
	int id ;
	int salary;
	String city;
	public Employee(String firstName, int id, int salary, String city) {
		super();
		this.firstName = firstName;
		this.id = id;
		this.salary = salary;
		this.city = city;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", id=" + id + ", salary=" + salary + ", city=" + city + "]";
	}
	

}
