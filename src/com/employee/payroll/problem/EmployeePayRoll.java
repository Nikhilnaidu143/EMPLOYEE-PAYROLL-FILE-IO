package com.employee.payroll.problem;

public class EmployeePayRoll {

	// Instance variables.
	int id;
	String name;
	double salary;

	// Parameterized Constructor
	public EmployeePayRoll(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EMPLOYEE PLAY ROLL [id :- " + id + " , Name :- " + name + " , Salary :- " + salary + "]";
	}
}
