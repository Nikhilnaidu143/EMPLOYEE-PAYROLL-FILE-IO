package com.employee.payroll.problem;

public class EmployeePayRoll {

	// Instance variables.
	int id;
	String name;
	double salary;

	//Default Constructor.
	public EmployeePayRoll() {
		
	}
	
	// Parameterized Constructor
	public EmployeePayRoll(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getter and Setter methods.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	public String toString() {
		return "EMPLOYEE PLAY ROLL [id :- " + id + " , Name :- " + name + " , Salary :- " + salary + "]";
	}
}
