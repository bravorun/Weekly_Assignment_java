package com.day_2.Q3;

import java.util.Random;

public abstract class Account {
	private String memberName;
	private String accountNumber;
	private Double accountBalance;

	public Account(String memberName, Double accountBalance) {
		Random rand = new Random();
		accountNumber = 10000 + rand.nextInt(89999) + "";
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	abstract public void withdraw(Double withdrawAmount);

	public void deposit(double amt) {
		accountBalance += amt;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}

	void Display() {
		System.out.println("Available Balance Account is : " + getAccountBalance());
	}

}
