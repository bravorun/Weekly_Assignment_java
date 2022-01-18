package com.day_4.Q6;

public class CustomException extends Exception {
	CustomException(int n){
		super("Number can not be greater then "+n);
	}

}
