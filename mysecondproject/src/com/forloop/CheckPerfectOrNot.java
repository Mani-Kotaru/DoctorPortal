package com.forloop;

import java.util.Scanner;

//Q) WAP to to find the Given number is Perfect or not ..? 

//perfect number means sum of the factors of a number excluding that number is equals to the number itself
public class CheckPerfectOrNot {
	  
	static boolean isPerfect(int n)
	{   
		int sum=0;
		boolean status=false;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			status=true;
		}
		
		return status;
	}
	  
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		boolean status=isPerfect(n);
		if(status)
		{
			System.out.println("given number is a perfect number!");
		}
		else
		{
			System.out.println("given number is not a perfect number!");
		}
		
		
}
}