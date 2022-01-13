package com.day_2.Q2;

import java.util.Scanner;

public class BookStore {
	private Book[] book=new Book[10];
	private static int noOfBooks;
	
	BookStore() {
		noOfBooks=0;
	}
	public void sell(String title,int no) {
		if(noOfBooks>0) {
			for(int i=0;i<noOfBooks;i++) {
				if(book[i].getBookTitle()==title) {
					if(book[i].getNumOfCopies()>=no)
					book[i].setNumOfCopies(book[i].getNumOfCopies()-no);
					else
						System.out.println("Insufficient Copies available");
				}
				else
					System.out.println("Book Not Available");
			}
			
		}
		System.out.println("No Books Available");
	}
	public void order(String isbn,int qty) {
		{
			int foundFlag=0;
			if(noOfBooks>0) {
			for(int i=1;i<=noOfBooks;i++){
				if(book[i].getIsbn()==isbn) {
					foundFlag=1;
					book[i].setNumOfCopies(book[i].getNumOfCopies()+qty);
				}
			}
			}
			if(foundFlag==0 && noOfBooks<=10  ) {
				System.out.println("No Books Available");
				addbook();
				System.out.println(noOfBooks);
				book[0].display();
			}
			
		}
		
	}
	private void addbook() {
		String bookName;
		String author;
		String isbn;
		int noOfCopies;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Title");
		bookName=sc.next();
		System.out.println("Enter Book Author");
		author=sc.next();
		System.out.println("Enter Book ISBN");
		isbn=sc.next();
		System.out.println("Enter Book Qty");
		noOfCopies=sc.nextInt();
		//sc.close();
		book[noOfBooks]=new Book(bookName,author,isbn,noOfCopies);
		noOfBooks+=1;
	}
	public void display() {
		if(noOfBooks>0) {
		for(int i=0;i<noOfBooks;i++) {
			book[i].display();
		}
		}
		else {
			System.out.println("No Books Available");
		}
	}

}
