package com.day_3.Q1;

public class Employee implements Payable {
	private int empno;
	private String empName;
	private String empType;

	public Employee(int empno, String empName, String empType) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.empType = empType;
	}

	public int getEmpno() {
		return empno;
	}
	public void refactorSalary() {
		
	}

	void display() {
		System.out.println("Emp Number : " + empno);
		System.out.println("Emp Name : " + empName);
		System.out.println("Emp Type : " + empType);
	}
}
