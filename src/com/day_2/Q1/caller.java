package com.day_2.Q1;

public class caller {
	public static void main(String[] args) {
		Circle circle=new Circle();
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		Circle circle2=new Circle(52.3);
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getArea());
	}
}