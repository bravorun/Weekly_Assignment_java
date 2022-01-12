package com.day_1.Q1;
/*
 * Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
 */
public class Fibonacci {
	public static void main(String args[]) {
		fibo(20);

	}

	public static void fibo(int n) {
		int a = 0, b = 1;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			int temp = a;
			a = b;
			b = temp + b;
			System.out.print(a);
			sum += a;
		}
		System.out.println("Average is " + sum / n);
	}

}
