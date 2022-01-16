package com.day_3.Q1;

import java.util.Scanner;

public class HourlyEmployee extends Employee implements Payable {
	private double rate;
	private int hourWorked;

	public HourlyEmployee(int empno, String empName, String empType, double rate, int hours) {
		super(empno, empName, empType);
		this.rate = rate;
		this.hourWorked=hours;
	};

	public void refactorSalary() {
		double rate;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter New Salary");
		rate=sc.nextDouble();
		this.rate = rate;
	}
	void display() {
		super.display();
		System.out.println("Payable amount : "+rate*hourWorked);
	}
}
