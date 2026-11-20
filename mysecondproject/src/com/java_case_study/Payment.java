package com.java_case_study;

public interface Payment {
	void processPayment(double amount);
	void refund(double amount);
}
