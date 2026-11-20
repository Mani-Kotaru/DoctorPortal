package com.java_operators;
import java.util.Scanner;

//WAP to check whether the given number is divisible by 3 or 7 using logical operators  and ternary operator
public class LogicalOpExample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number : ");  // note: here 3.6 can be divided by 3 but we can not say 3.6 is divisible by 3 because 3.6 % 3 gives
	                                             // you a remainder of 0.6 but not 0
		double num=sc.nextDouble();
		boolean isDivisible=( num%3==0|| num%7==0)?true:false;
		
		System.out.println("is number divisible by 3 or 7 ? "+isDivisible);

	}

}
