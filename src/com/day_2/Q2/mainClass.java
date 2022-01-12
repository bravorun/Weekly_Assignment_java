package com.day_2.Q2;
import java.util.Scanner;
public class mainClass {
	public static void menueDriven(BookStore bookStore){
		int opt;
		Scanner sc=new Scanner (System.in);
		do {
			System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity.\n" + 
					"Enter “2”, to order new books.\n" + 
					"Enter “3”, to sell books.\n" +
					"Enter 4 to add books"+
					"Enter “0”, to exit the system.");

		
		opt=sc.nextInt();
		if(opt==1)
			bookStore.display();
		else if(opt==2) {
			System.out.println("Enter ISBIN and quantity to order");
			String ISBN=sc.next();
			int noOfCopies=sc.nextInt();
			bookStore.order(ISBN, noOfCopies);
		}
		else if(opt==3) {
			System.out.println("Enter Book Title and quantity to sell");
			String bookTitle=sc.next();
			int noOfCopies=sc.nextInt();
			bookStore.sell(bookTitle, noOfCopies);
		}
		else if(opt==4) {
			bookStore.insertBook();
		}
		}while(opt!=0);
		sc.close();
			
		
	}
	
	public static void main(String args[]) {
		BookStore bookStore=new BookStore();
		menueDriven(bookStore);
		
}
	}
