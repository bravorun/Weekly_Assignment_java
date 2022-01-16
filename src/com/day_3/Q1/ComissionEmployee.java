package com.day_3.Q1;

import java.util.Scanner;

public class ComissionEmployee extends Employee implements Payable {
	private double percentage;
	private int sale;
	public ComissionEmployee(int empno, String empName, String empType, double percentage, int sale) {
		super(empno, empName, empType);
		this.percentage = percentage;
		this.sale = sale;
	}
	public void refactorSalary() {
		double percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter New Salary");
		percentage=sc.nextDouble();
		this.percentage=percentage;
	}
	void display() {
		super.display();
		System.out.println("Payable amount : " +sale*percentage/100);
	}
}
