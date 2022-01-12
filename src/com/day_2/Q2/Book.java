package com.day_2.Q2;

public class Book {
private String bookTitle;
private String author;
private String ISBN;
private int numOfCopies;
public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
	this.bookTitle = bookTitle;
	this.author = author;
	ISBN = iSBN;
	this.numOfCopies = numOfCopies;
}
public String getBookTitle() {
	return bookTitle;
}
public String getISBN() {
	return ISBN;
}
public int getNumOfCopies() {
	return numOfCopies;
}
public void setNumOfCopies(int numOfCopies) {
	this.numOfCopies = numOfCopies;
}
public void display() {
	System.out.println("Book Title : "+bookTitle);
	System.out.println("Book Author : "+author);
	System.out.println("Book ISBN : "+ISBN);
	System.out.println("No Of coipes : "+numOfCopies);
}

}
