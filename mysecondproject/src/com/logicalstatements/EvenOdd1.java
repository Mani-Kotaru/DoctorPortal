package com.logicalstatements;
import java.util.Scanner;

//WAP to check a number even or odd without using arithmetic operators
public class EvenOdd1 {

	public static void main(String[] args) {
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		if((num&1)==0)
		{
			System.out.println("it is even number!");
		}
		else
		{
			System.out.println("it is odd number!");
		}

	}

}
