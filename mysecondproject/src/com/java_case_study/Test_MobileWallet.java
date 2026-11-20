package com.java_case_study;

public class Test_MobileWallet {

	public static void main(String[] args) {
        
		MobileWallet m1=new MobileWallet();
		m1.recharge(2000);
		System.out.println("current balance : "+m1.getBalance());
	    m1.deduct(205);
		System.out.println("current balance : "+m1.getBalance());
		 m1.deduct(2000);
			System.out.println("current balance : "+m1.getBalance());
		
	}

}
