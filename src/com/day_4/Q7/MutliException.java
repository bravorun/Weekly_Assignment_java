package com.day_4.Q7;

import java.io.IOException;
import java.util.InputMismatchException;

public class MutliException {
	void throwException()  {
		throw new InputMismatchException();
		throw new IOException();
		
	}
	public static void main(String args[]) {
		throwException();
	}
}
