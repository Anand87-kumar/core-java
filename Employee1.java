package com.anand;

//Employee Class increment salary 10%.
public class Employee1 {
	
	private String name;
	private int age;
	private double salary;


	public Employee1() {
		super();
	}
	
	public Employee1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee1 [salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
