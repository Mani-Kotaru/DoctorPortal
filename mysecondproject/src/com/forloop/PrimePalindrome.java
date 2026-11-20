package com.forloop;

import java.util.Scanner;

// WAP to check the given number is prime and palindrome?
public class PrimePalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		boolean b1 = isPrime(n);
		boolean b2 = isPalindrome(n);
//		if (b1==true && b2==false) {
//			System.out.println("the given number is prime but not palindrome!");
//		}
//		else if (b1==false && b2==true) {
//			System.out.println("the given number is palindrome but not prime!");
//		}
//		else if (b1==true && b2==true) {
//			System.out.println("the given number is both prime and palindrome!");
//		}
//		
//		else {
//			System.out.println("the given number is not both prime and palindrome!");
//		}

		if(b1&&b2)
		{
			System.out.println("the given number is both prime and palindrome!");
		}
		else
		{
			System.out.println("the given number is not both prime and palindrome!");
		}
		
		
	}

	static boolean isPrime(int n) {
		boolean status = false;
		int count = 0;
		if (n == 0 || n == 1) {
			return status;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			status = true;
		}
		return status;

	}

	static boolean isPalindrome(int n) {
		boolean status = false;
		int n1 = n;
		int rev = 0;
		while (n1 > 0) {
			int rem = n1 % 10;
			rev = rev * 10 + rem;
			n1 = n1 / 10;
		}
		if (n == rev) {
			status = true;
		}

		return status;
	}

}
