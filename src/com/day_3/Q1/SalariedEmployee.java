package com.day_3.Q1;

import java.util.Scanner;

public class SalariedEmployee extends Employee implements Payable {
	private double salary;

	public SalariedEmployee(int empno, String name, String empType, double salary) {
		super(empno, name, empType);
		this.salary = salary;
	}

	public void refactorSalary() {
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter New Salary");
		sal=sc.nextDouble();
		this.salary = sal;
	}

	public void display() {
		super.display();
		System.out.println("Salary : " + salary);
	}

}
