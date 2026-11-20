package com.javafundamentals;

import java.math.*;

public class Big_Decimal {

	BigDecimal b1 = new BigDecimal("73767889997766678999900887.765433356778899987");
	BigDecimal b2 = new BigDecimal("737678899977666546787.86545799643456789976677");
	
	// BigInteger i1=new BigInteger("127809897836743890098765432");
	

	public static void main(String[] args) {
		Big_Decimal t = new Big_Decimal();
		System.out.println(t.b1);
		System.out.println(t.b2);
		System.out.println(t.b1.add(t.b2));
		System.out.println(t.b1.multiply(t.b2));
		System.out.println(t.b1.subtract(t.b2));
		System.out.println("_______________________________________________________________________________________");
	//	System.out.println(t.i1.add(t.b1));

	}

}
