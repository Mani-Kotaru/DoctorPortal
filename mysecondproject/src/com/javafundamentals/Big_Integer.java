package com.javafundamentals;

import java.math.BigInteger;

public class Big_Integer {
	 
	BigInteger b1=new BigInteger("7376788999776667899990088766554444567");
	BigInteger b2=new BigInteger("7376788999776665467877777777777777766");
	
	

	public static void main(String[] args) {
		 Big_Integer t=new Big_Integer();
		System.out.println(t.b1);
		System.out.println(t.b2);
		System.out.println(t.b1.add(t.b2));
		System.out.println(t.b1.multiply(t.b2));
		System.out.println(t.b1.subtract(t.b2));
		int x;
		System.out.println(x=22);
		System.out.println(22);
		
		int a=0b101;
		int b=0B101;
		System.out.println(a);
		System.out.println(b);

		
		
	}

}
