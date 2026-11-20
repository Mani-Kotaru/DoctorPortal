package com.java_operators;

import java.util.Scanner;

//WAP to check whether the given number is divisible by 3 or 7 using logical operators and logical statements
public class LogicalOpExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : "); // note: here 3.6 can be divided by 3 but we can not say 3.6 is
													// divisible by 3 because 3.6 % 3 gives
													// you a remainder of 0.6 but not 0
		double num = sc.nextDouble();

		if (num % 3 == 0 || num % 7 == 0) {
			System.out.println("the given number is divisible by 3 or 7");
		}
		else {
			System.out.println("the given number is  not divisible by 3 or 7");
		}
	}

}
