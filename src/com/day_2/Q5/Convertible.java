package com.day_2.Q5;

public class Convertible extends Car {
private boolean isHoodOpen;

public Convertible(int noOfWheel, int noOfPassanger, int model, String make,int noOfDoor,boolean isHoodOpen) {
	super(noOfWheel, noOfPassanger, model, make,noOfDoor);
	this.isHoodOpen = isHoodOpen;
}
@Override
public void display() {
	super.display();
	System.out.println("Hood Open :"+isHoodOpen);
}

}
