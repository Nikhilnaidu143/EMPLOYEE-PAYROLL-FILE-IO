package com.employee.payroll.problem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
	public static void main(String[] args) throws IOException {
		ArrayList<EmployeePayRoll> employeeArrayList = new ArrayList<>();

		EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeeArrayList);
		Scanner consoleInputReader = new Scanner(System.in);
		employeePayRollService.readEmployeeData(consoleInputReader);
		employeePayRollService.writeEmployeeData();
		
		String home = "Data/Temp/temp.txt";
		Path path = Paths.get(home);
		
		System.out.println(Files.exists(path));  //returns true if file exist.
		
//		Files.delete(path);                      //deleting file
		
		System.out.println(Files.exists(path));  //returns false if file does not exist.
		
//		Files.createDirectories(path);
//		Files.createFile(path);
	}
	
	// Reading employee data from console.
	public void readEmployeeData(Scanner consoleInputReader) throws IOException {
		System.out.println("------------WELCOME-TO-EMPLOYEE-PAYROLL------------\n");
		System.out.print("Enter Employee ID :- ");
		int employeeID = consoleInputReader.nextInt();
		System.out.print("Enter Employee Name :- ");
		String employeeName = consoleInputReader.next();
		System.out.print("Enter Employee Salary :- ");
		double employeeSalary = consoleInputReader.nextDouble();
		
		employeeList.add(new EmployeePayRoll(employeeID, employeeName, employeeSalary));   // Adding data into list.
		
		/*** Adding employee pay-roll data into a text file. ***/
		EmployeePayRoll employeePayRoll = new EmployeePayRoll();
		employeePayRoll.setId(employeeID);
		employeePayRoll.setName(employeeName);
		employeePayRoll.setSalary(employeeSalary);
		
		String employeePayRollString = employeePayRoll.toString();
		byte[] employeePayRollByteArray = employeePayRollString.getBytes();
		Path paths = Paths.get("Data/Temp/temp.txt");
		
		Files.write(paths, employeePayRollByteArray);     //writing into file.
	}
	
	// Writing employee data to console.
	public void writeEmployeeData() {
		System.out.println("Writing employee pay roll into console :- " + employeeList);
	}
}
