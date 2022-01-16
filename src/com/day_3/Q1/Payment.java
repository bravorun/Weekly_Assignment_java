package com.day_3.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {
	static ArrayList<Employee> employee = new ArrayList<Employee>();
	static Scanner sc = new Scanner(System.in);

	static void addEmployee() {
		int empid;
		String name;
		String type;
		System.out.println("Enter Employee id :");
		empid = sc.nextInt();
		System.out.println("Enter Employee Name :");
		name = sc.next();
		System.out.println("Enter Employee type \n\tSalary \n\thourly \n\tComission");
		type = sc.next();
		if (type.equalsIgnoreCase("Salary")) {
			double salary;
			System.out.println("Enter Salary");
			salary = sc.nextDouble();
			employee.add(new SalariedEmployee(empid, name, type, salary));
		} else if (type.equalsIgnoreCase("hourly")) {
			double rate;
			int time;
			System.out.println("Enter Rate");
			rate = sc.nextDouble();
			System.out.println("Enter Duration");
			time = sc.nextInt();
			employee.add(new HourlyEmployee(empid, name, type, rate, time));
		} else if (type.equalsIgnoreCase("Comission")) {
			double percentage;
			int sale;
			System.out.println("Enter Percentage");
			percentage = sc.nextDouble();
			System.out.println("Enter sale");
			sale = sc.nextInt();
			employee.add(new ComissionEmployee(empid, name, type, percentage, sale));
		} else {
			System.out.println("Invalid employee type___");
		}

	}

	public static void main(String args[]) {

		int mainOpt;
		while (true) {
			System.out.println("1. Add New Employee");
			System.out.println("2. View Employee Details");
			System.out.println("3. Refactor Employee Salary");
			System.out.println("0. TO Exit");
			mainOpt = sc.nextInt();
			switch (mainOpt) {
			case 1:
				addEmployee();
				break;
			case 2:
				int empid;
				System.out.println("Enter Employee Id :");
				empid = sc.nextInt();
				if (employee.isEmpty()) {
					System.out.println("No Employee added");
					break;
				} else {
					for (Employee emp : employee) {
						if (emp.getEmpno() == empid) {
							emp.display();
							break;
						}
					}
					break;
				}
			case 3:
				System.out.println("Enter Employee Id :");
				empid = sc.nextInt();
				if (employee.isEmpty()) {
					System.out.println("No Employee added");
					break;
				} else {
					for (Employee emp : employee) {
						if (emp.getEmpno() == empid) {
							emp.refactorSalary();
							break;
						}
						System.out.println("No Employee with emp :" + empid);
					}
					break;
				}
			case 0:
				System.exit(0);

			}

		}
	}
}
