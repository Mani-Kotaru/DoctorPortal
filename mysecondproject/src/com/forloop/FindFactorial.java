package com.forloop;

import java.util.Scanner;

// WAP to find the factorial of a given number?

public class FindFactorial {
	
	static int findFact(int n)
	{   
		int fact=1;
		if(n==0||n==1)
		{
			return 1;
		}
		for(int i=n;i>1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		int fact=findFact(n);
		System.out.println("Factorial of "+n+" is "+fact);

	}

}
