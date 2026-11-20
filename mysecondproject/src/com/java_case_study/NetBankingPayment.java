package com.java_case_study;

public class NetBankingPayment implements Payment{


	    private String bankName;
	    private String accountNumber;

	    public NetBankingPayment(String bankName, String accountNumber) {
	        this.bankName = bankName;
	        this.accountNumber = accountNumber;
	    }

	    @Override
	    public void processPayment(double amount) {
	        System.out.println("Payment Method : Net Banking");
	        System.out.println("Bank Name      : " + bankName);
	        System.out.println("Account Number : " + accountNumber);
	        System.out.println("Amount         : ₹" + amount);
	        System.out.println("Net Banking payment processed successfully.");
	    }

		@Override
		public void refund(double amount) {
			 System.out.println("Refund of ₹" + amount
		                + " processed to Net Banking.");
			
		}
		
	}

