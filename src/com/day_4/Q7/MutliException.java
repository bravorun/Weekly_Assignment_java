package com.day_4.Q7;

import java.io.IOException;
import java.util.InputMismatchException;

public class MutliException {
	void throwException() throws InputMismatchException,IOException{
		System.out.println("In exception Block");
		
	}
	public static void main(String args[]) {
		MutliException exp=new MutliException();
		try {
			exp.throwException();
		} catch (InputMismatchException | IOException e) {
			e.printStackTrace();
		}
		/*
		 * Single throw catch block has been added because InputMisMatchException and IOException
		 *  because from java 7 we can have multiple Exception in single catch and by default
		 *  Exception parameter if Final
		 */
		
	}
}
