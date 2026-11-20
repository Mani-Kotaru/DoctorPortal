package com.java_operators;
//WAP to find max of three numbers using Ternary operator

import java.util.Scanner;
public class LogicalOpExample4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		double max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("max of three numbers : "+max);

	}

}
