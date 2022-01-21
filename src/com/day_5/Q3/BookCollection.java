package com.day_5.Q3;

import java.util.Arrays;

public class BookCollection {
	private String name;
	private Book[] book;
	@Override
	public String toString() {
		return "BookCollection \nName Of the Owner =" + name + ", bookWith " + Arrays.toString(book) ;
	}
	
}
