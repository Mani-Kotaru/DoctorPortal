package com.java_case_study;

public class UPIPayment implements Payment{

	private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment Method : UPI");
        System.out.println("UPI ID         : " + upiId);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("UPI payment processed successfully.");
    }

	@Override
	public void refund(double amount) {
		 System.out.println("Refund of ₹" + amount
	                + " processed through UPI.");
		
	}

	

}
