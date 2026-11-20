package com.java_case_study;

public class PaymentDemo {

	public static void main(String[] args) {
		 // Credit Card Payment
        Payment creditCard = new CreditCardPayment(
                "1234-5678-9012-3456",
                "Raghunadharao"
        );

        Checkout checkout1 = new Checkout(creditCard);

        System.out.println("========== CREDIT CARD ==========");
        checkout1.makePayment(5000);
        checkout1.getRefund(500);

        // UPI Payment
        Payment upi = new UPIPayment("raghu@upi");

        Checkout checkout2 = new Checkout(upi);

        System.out.println("\n========== UPI ==========");
        checkout2.makePayment(2500);
        checkout2.getRefund(200);

        // Net Banking Payment
        Payment netBanking = new NetBankingPayment(
                "SBI",
                "1234567890"
        );

        Checkout checkout3 = new Checkout(netBanking);

        System.out.println("\n========== NET BANKING ==========");
        checkout3.makePayment(7500);
        checkout3.getRefund(400);
	}

}
