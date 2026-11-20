package com.java_case_study;

public class Checkout {

    private Payment payment;

    // Constructor Injection
    public Checkout(Payment payment) {
        this.payment = payment;
    }

    public void makePayment(double amount) {
        payment.processPayment(amount);
       
    }
    public void getRefund(double amount) {
        payment.refund(amount);
       
    }

    

}
