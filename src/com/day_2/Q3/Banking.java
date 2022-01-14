package com.day_2.Q3;

import java.util.Scanner;

public class Banking {
public static void main(String args[]) {
	Account acc=null;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Welcome to Banking");
	System.out.println("Plese Create Account:");
	System.out.println("Please Enter Name:");
	String name=scanner.nextLine();
	System.out.println("Please Enter Amount:");
	double amount=scanner.nextDouble();
	System.out.println("Please select type of Account:\n1. For Savings\n2. For Current");
	int opt=scanner.nextInt();
	if(opt==1) {
	acc=new SavingsAccount(name,amount);
	}
	else if(opt==2) {
		System.out.println("Enter Trade Licence Number");
		String tradeLicence=scanner.nextLine();
		acc=new CurrentAccount(name,amount,tradeLicence);
	}
	else {
		System.exit(1);
	}
	while(true) {
		System.out.println("1. TO Deposite \n2. To Withdraw \n3. To Display Balance \n4. To Exit");
		int menueOpt=scanner.nextInt();
		switch(menueOpt) {
		case 1:
			System.out.println("Enter Amount to deposite :");
			double amt=scanner.nextDouble();
			acc.deposit(amt);
			break;
		case 2:
			System.out.println("Enter Amount to Withdraw :");
			double widamt=scanner.nextDouble();
			acc.withdraw(widamt);
			break;
		case 3:
			acc.Display();
			break;
		case 4:
			System.exit(0);
			break;
		}
	}
}
}
