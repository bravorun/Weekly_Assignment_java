package com.day_2.Q5;

import java.util.Scanner;

public class Application {
	public static void main(String args[]) {
		int opt;
		String make;
		int model,noOfWheel,noOfPassanger;
		Vehicle vehicle;
		System.out.println("‘1’ – to create a Vehicle object.\r\n" + 
				"‘2’ – to create a Car object.\r\n" + 
				"‘3’– to create a Convertible object.\r\n" + 
				"‘4’– to create a SportCar object.");
		Scanner scanner =new Scanner(System.in);
		opt=scanner.nextInt();
		switch(opt) {
		case 1:
			System.out.println("Enter Make :");
			make=scanner.next();
			System.out.println("Enter Model:");
			model=scanner.nextInt();
			System.out.println("Enter No of Wheels :");
			noOfWheel=scanner.nextInt();
			System.out.println("Enter No of passangers :");
			noOfPassanger=scanner.nextInt();
			vehicle=new Vehicle(noOfWheel,noOfPassanger,model,make);
			vehicle.display();
			break;
		case 2:
			int noOfDoor;
			System.out.println("Enter Make :");
			make=scanner.next();
			System.out.println("Enter Model:");
			model=scanner.nextInt();
			System.out.println("Enter No of Wheels :");
			noOfWheel=scanner.nextInt();
			System.out.println("Enter No of passangers :");
			noOfPassanger=scanner.nextInt();
			System.out.println("Enter no of Doors :");
			noOfDoor=scanner.nextInt();
			vehicle=new Car(noOfWheel,noOfPassanger,model,make,noOfDoor);
			vehicle.display();
			break;
		case 3:
			boolean isConvertable;
			System.out.println("Enter Make :");
			make=scanner.next();
			System.out.println("Enter Model:");
			model=scanner.nextInt();
			System.out.println("Enter No of Wheels :");
			noOfWheel=scanner.nextInt();
			System.out.println("Enter No of passangers :");
			noOfPassanger=scanner.nextInt();
			System.out.println("Enter no of Doors :");
			noOfDoor=scanner.nextInt();
			System.out.println("Convertable :");
			isConvertable=scanner.nextBoolean();
			vehicle=new Convertible(noOfWheel,noOfPassanger,model,make,noOfDoor,isConvertable);
			vehicle.display();
			break;
		case 4:
			System.out.println("Enter Make :");
			make=scanner.next();
			System.out.println("Enter Model:");
			model=scanner.nextInt();
			System.out.println("Enter No of Wheels :");
			noOfWheel=scanner.nextInt();
			System.out.println("Enter No of passangers :");
			noOfPassanger=scanner.nextInt();
			System.out.println("Enter no of Doors :");
			noOfDoor=scanner.nextInt();
			vehicle=new SportCar(noOfWheel,noOfPassanger,model,make);
			vehicle.display();
			break;
			
		}
	}

}
