package com.day_2.Q3;

import java.util.Scanner;

public class CurrentAccount extends Account {
	private String tradeLicenceNumber;

	public CurrentAccount(String memberName, Double accountBalance, String tradeLicenceNumber) {
		super(memberName, accountBalance);
		this.tradeLicenceNumber = tradeLicenceNumber;
	}

	@Override
	public void withdraw(Double withdrawAmount) {
		Scanner sc = new Scanner(System.in);
		String option;
		System.out.println("Do you want to View Account Balance");
		option = sc.nextLine();
		if (option.equalsIgnoreCase("yes")) {
			System.out.println("Account Balance Before Transaction :" + getAccountBalance());
			if (getAccountBalance() - withdrawAmount < 1)
				System.out.println("In sufficient Account Balance");
			else
				setAccountBalance(getAccountBalance() - withdrawAmount);
			System.out.println("Account Balance After Transaction :" + getAccountBalance());
		} else {
			System.out.println("Account Balance Before Transaction :" + getAccountBalance());
			if (getAccountBalance() - withdrawAmount < 1)
				System.out.println("In sufficient Account Balance");
			else
				setAccountBalance(getAccountBalance() - withdrawAmount);
			System.out.println("Account Balance After Transaction :" + getAccountBalance());

		}

	}
}
