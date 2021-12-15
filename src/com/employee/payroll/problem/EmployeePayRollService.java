package com.employee.payroll.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {

	List<EmployeePayRoll> employeeList;

	// Parameterized Constructor.
	public EmployeePayRollService(List<EmployeePayRoll> employeeList) {
		super();
		this.employeeList = employeeList;
	}

	// Main method.
	public static void main(String[] args) {
		ArrayList<EmployeePayRoll> employeeArrayList = new ArrayList<>();

		EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeeArrayList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayRollService.readEmployeeData(consoleInputReader);
		employeePayRollService.writeEmployeeData();
	}
	
	// Reading employee data from console.
	public void readEmployeeData(Scanner consoleInputReader) {
		System.out.println("------------WELCOME-TO-EMPLOYEE-PAYROLL------------\n");
		System.out.print("Enter Employee ID :- ");
		int employeeID = consoleInputReader.nextInt();
		System.out.print("Enter Employee Name :- ");
		String employeeName = consoleInputReader.next();
		System.out.print("Enter Employee Salary :- ");
		double employeeSalary = consoleInputReader.nextDouble();
		
		employeeList.add(new EmployeePayRoll(employeeID, employeeName, employeeSalary));   // Adding data into list.
	}
	
	// Writing employee data to console.
	public void writeEmployeeData() {
		System.out.println("Writing employee pay roll into console :- " + employeeList);
	}
}
