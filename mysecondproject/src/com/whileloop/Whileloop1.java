package com.whileloop;

import java.util.Scanner;

// WAP to read integers until five even numbers have been entered,then stop?

public class Whileloop1 {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter number of even numbers :");
        int evenNum=sc.nextInt();
         int count=0;
		while(count<evenNum)
		{
			System.out.println("enter a number : ");
			int n=sc.nextInt();
			if(n%2==0)
			{
				count++;
			}
			
		}
		System.out.println("you have entered 5 even numbers");
	}

}
