 package com.forloop;

import java.util.Scanner;

public class FindFactUsingRecursion {

	static int findFact(int n) {
		
		if(n==0||n==1)
		{
			return 1;
		}
		return findFact (n-1)*n; 

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value: ");
		int n = sc.nextInt();
		int fact = findFact(n);

		System.out.println("factorial of given number is :" + fact);
	}

}
