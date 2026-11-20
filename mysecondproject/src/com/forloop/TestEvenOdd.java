package com.forloop;

import java.util.Scanner;

//Q) WAP to print even and odd numbers ..?  from 1 to 10
public class TestEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		System.out.print("even numbers : ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print("odd numbers : ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
