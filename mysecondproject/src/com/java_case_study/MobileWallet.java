package com.java_case_study;

public class MobileWallet {
	private double walletBalance;

	public void recharge(double amount) {
		if (amount > 0) {
			walletBalance += amount;
			System.out.println("amount recharged successfully!");
		} else
			System.out.println("amount must be greater than 0!");
	}

	public void deduct(double amount) {
		if (amount <= 0) {
			System.out.println("amount must be greater than 0!");
		} else if (amount > walletBalance) {
			System.out.println("Insufficient Balance!");
		} else {
			walletBalance -= amount;
			System.out.println("amount deducted successfully!");
		}
	}

	public double getBalance() {
		return walletBalance;
	}

}
