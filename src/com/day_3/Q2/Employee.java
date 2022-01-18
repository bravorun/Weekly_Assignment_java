package com.day_3.Q2;

public abstract class Employee implements Payable {
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

	void display() {
		System.out.println("Emp Number : " + empno);
		System.out.println("Emp Name : " + empName);
		System.out.println("Emp Type : " + empType);
	}

	public void refactorSalary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return 0;
	}
}
