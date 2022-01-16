package com.day_2.Q5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassanger;
	private int model;
	private String make;
	
	public Vehicle(int noOfWheel, int noOfPassanger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassanger = noOfPassanger;
		this.model = model;
		this.make = make;
	}

	public void display() {
		System.out.println("Make :"+make);
		System.out.println("Model : :"+model);
		System.out.println("No of Wheels :"+noOfWheel);
		System.out.println("No of passangers :"+noOfPassanger);
	}
}
