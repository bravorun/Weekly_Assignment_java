package com.day_1.Q2;

public class Tables {

	public static void main(String[] args) {
		table();

	}

	public static void table() {
		System.out.println("* | 1 2 3 4 5 6 7 8 9 10");
		System.out.println("-------------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();

		}
	}

}
