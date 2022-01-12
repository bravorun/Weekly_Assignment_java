package com.day_1.Q1;

public class Fibonacci {
		public static void main(String args[]) {
			fibo(20);
			
		}
		public static void fibo(int n) {
			int a=0,b=1;
			double sum=0;
			for(int i=0;i<n;i++) {
				int temp=a;
				a=b;
				b=temp+b;
				System.out.println(a);
				sum+=a;
			}
			System.out.println("Average is "+ sum/n);
		}
		
	}


