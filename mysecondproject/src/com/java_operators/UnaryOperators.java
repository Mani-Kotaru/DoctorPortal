package com.java_operators;

public class UnaryOperators {

	public static void main(String[] args) {

//		int x=10;
//		int y=11;
//		System.out.println(x++ + y++ + y-- + x-- - y++ - x++ + y++);
//		
//		System.out.println(x);
//		System.out.println(y);
		
		int m=7;
		int n=m++ + --m + ++m;
		System.out.println(n);
		int x=3;
		int y=x++ + ++x + x-- + --x;
		System.out.println(y);
	}

}
