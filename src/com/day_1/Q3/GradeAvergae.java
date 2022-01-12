package com.day_1.Q3;

import java.util.Scanner;

public class GradeAvergae {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of students:");
		int std_no=sc.nextInt();
		grade_average(std_no);
	}
	private static void grade_average(int std_no) {
		double avg=0;
		int grades[]=new int[std_no];
		for(int i=0;i<std_no;i++) {
			System.out.println("Enter grades for Student "+ i+1);
			grades[i]=sc.nextInt();
			while(grades[i]>100) {
				System.out.println("Invalid grades, Try again");
				grades[i]=sc.nextInt();
			}
			avg+=grades[i];
		}
		System.out.println("The average is :"+avg/std_no);
	}
}
