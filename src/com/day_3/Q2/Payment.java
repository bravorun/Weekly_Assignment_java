package com.day_3.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {
	 ArrayList<Employee> employee = new ArrayList<Employee>();
	ArrayList <Invoice>inv=new ArrayList<Invoice>();
	Scanner sc = new Scanner(System.in);
	void addinvoice() {
		int invoiceNo;
		String partnum;
		String partDescription;
		int quantity;
		double pricePerItem;
		System.out.println("Enter invoice Number :");
		invoiceNo=sc.nextInt();
		System.out.println("Enter Part Number :");
		partnum=sc.next();
		System.out.println("Enter Part Description :");
		partDescription=sc.next();
		System.out.println("Enter Quantity :");
		quantity=sc.nextInt();
		System.out.println("Enter Price Per Iteam :");
		pricePerItem=sc.nextInt();
		inv.add(new Invoice(invoiceNo,partnum,partDescription,quantity,pricePerItem));
	}
	private void viewInvoice() {
		if(inv.isEmpty())
			System.out.println("No Invoice Added");
		else {
			int invno;
			System.out.println("Enter Invoice No :");
			invno=sc.nextInt();
			for(Invoice invoice :inv) {
				if(invoice.getInvoiceNo()==invno) {
					System.out.println(invoice);
					System.out.println("Total Payment is : "+invoice.getPayment());
				}
			}

		}
	}
	public void invoicecalling() {
		while(true) {
			int opt;
			System.out.println("Enter 1 To Add New Invoice\nEnter 2 TO View Invoice\nEnter 3 TO Exit");
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				addinvoice();
				break;
			case 2:
				viewInvoice();
				break;
			case 3:
				System.exit(0);
			}
			
			
		}
	}

	private void addEmployee() {
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

	public void employeeCalling() {

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
