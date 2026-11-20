package com.patterns;

import java.util.Scanner;

public class InvertedLeftTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows :");
		int rows=sc.nextInt();
	
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
