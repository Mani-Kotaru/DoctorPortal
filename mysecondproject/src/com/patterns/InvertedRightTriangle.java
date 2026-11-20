package com.patterns;

import java.util.Scanner;

public class InvertedRightTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows :");
		int rows=sc.nextInt();
		int j;
		 for(int i=1;i<=rows;i++)
		 {
			 for(j=1;j<i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=rows;k>=i;k--)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

}
