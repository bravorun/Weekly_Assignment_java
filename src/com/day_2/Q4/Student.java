package com.day_2.Q4;

import java.util.Scanner;

public class Student {
	private String name;
	private String id;
	private double grade;
	Student(String id){
		this.id=id;
	}
	Student(String id,String name){
		this(id);
		this.name=name;
				
	}
	Student(String id,String name,Double grades){
		this(id,name);
		this.grade=grades;
	}
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
	}
	
	public void display(int year) {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println("Year: "+year);
	}
}
