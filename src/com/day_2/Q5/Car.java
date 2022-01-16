package com.day_2.Q5;

public class Car extends Vehicle {
	private int noOfDoors;

	public Car(int noOfWheel, int noOfPassanger, int model, String make, int noOfDoors) {
		super(noOfWheel, noOfPassanger, model, make);
		this.noOfDoors = noOfDoors;
	}
	public void display() {
		super.display();
		System.out.println("No of Doors: "+noOfDoors);
	}
}
