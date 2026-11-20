package com.logicalstatements;
import java.util.Scanner;

//WAP to check whether a number is even or odd

public class EvenOdd {                       // 0 is an even number.because 0 % 2 = 0
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check even or odd : ");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("it is an even number");
		}
		else
		{
			System.out.println("it is an odd number");
		}

	}

}
