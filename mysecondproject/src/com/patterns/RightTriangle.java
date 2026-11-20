package com.patterns;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows :");
		int rows=sc.nextInt();
		int j;
		for(int i=1;i<=rows;i++)
		{
			 for(j=rows;j>i;j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
