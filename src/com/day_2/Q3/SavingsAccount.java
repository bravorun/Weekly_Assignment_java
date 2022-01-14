package com.day_2.Q3;

public class SavingsAccount extends Account {
	private int interest;
	private double maxAmount;

	public SavingsAccount(String memberName, Double accountBalance) {
		super(memberName, accountBalance);
		this.interest = 5;
		this.maxAmount = 100000;
	}

	double getBalance() {
		return getAccountBalance() + (getAccountBalance() * interest * 1) / 100;
	}

	@Override
	public void withdraw(Double withdrawAmount) {
		if (withdrawAmount <= maxAmount) {
			if (getAccountBalance() - withdrawAmount < 1000)
				System.out.println("In sufficient Account Balance");
			else
				setAccountBalance(getAccountBalance() - withdrawAmount);
		} else
			System.out.println("Withdraw amount is more then limit");

	}
}
