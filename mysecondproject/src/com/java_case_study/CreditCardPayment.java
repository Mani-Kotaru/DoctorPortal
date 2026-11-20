package com.java_case_study;

public class CreditCardPayment implements Payment{

	private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment Method : Credit Card");
        System.out.println("Card Holder    : " + cardHolderName);
        System.out.println("Card Number    : " + cardNumber);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Credit Card payment processed successfully.");
    }

	@Override
	public void refund(double amount) {
		 System.out.println("Refund of ₹" + amount
	                + " processed through Credit Card.");
	  }
	}


