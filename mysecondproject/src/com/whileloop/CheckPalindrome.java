package com.whileloop;

//WAP to check given number is palindrome or not?
//input:343 --> output:the given number  is a palindrome 
//input:347 --> output: the given number  is not  a palindrome 
import java.util.Scanner;

public class CheckPalindrome {
	
	static boolean isPalindrome(int n)
	{
		boolean status=false;
		int rem=0,rev=0,temp;
		temp=n;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			status=true;
		}
		
		
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		boolean pd=isPalindrome(n);
		if(pd)
		{
			System.out.println("the given number is palindrome!!");
		}
		else
		{
			System.out.println("the given number is not a palindrome!!");
		}

	}

}
