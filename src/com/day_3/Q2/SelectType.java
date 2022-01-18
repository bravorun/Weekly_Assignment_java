package com.day_3.Q2;

import java.util.Scanner;

public class SelectType {
	static Payment p=new Payment();
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int opt;
	while(true) {
		System.out.println("1: for Employee \n2: For Invoice\n"
				+ "3: Exit");
		opt=sc.nextInt();
		switch(opt) {
		case 1:
			p.employeeCalling();
			break;
		case 2:
			p.invoicecalling();
			break;
		case 3:
			System.exit(0);
		}
	}
}
}
