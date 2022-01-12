package com.day_2.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
	private ArrayList<Book> books=new ArrayList<>();

	public void sell(String bookTitle, int noOfCopies) {
		for (Book b : books) {
			if (b.getBookTitle() == bookTitle) {
				if (b.getNumOfCopies() >= noOfCopies) {
					b.setNumOfCopies(b.getNumOfCopies() - noOfCopies);
				} else {
					System.out.println("Less no of copies available");
				}
			} 
			else {
				System.out.println("Book Not Available");
			}

		}
	}

	public void order(String ISBN, int noOfCopies) {
		for (Book b : books) {
			if (b.getISBN() == ISBN) {
					b.setNumOfCopies(b.getNumOfCopies() +noOfCopies);
				} else {
					System.out.println("Book not in store please add book");
					insertBook();
				}
			} 
			

		}


	public void insertBook() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Books Details");
		String bookTitle=sc.next();
		String author=sc.next();
		String ISBN=sc.next();
		int noOfCopies=sc.nextInt();
		Book b=new Book(bookTitle,author,ISBN,noOfCopies);
		books.add(b);
		sc.close();
	}

	public void display() {
		if (books.size()==0) {
			System.out.println("Book Shop is Empty Please add Book");
		}
		else {
		for(Book b :books) {
			b.display();
		}
		}

	}

}
