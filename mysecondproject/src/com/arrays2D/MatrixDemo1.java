package com.arrays2D;

import java.util.Scanner;

// WAP to square the elements of even row of a matrix and to reverse the elements of odd row of a matrix?
public class MatrixDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows : ");
		int rows = sc.nextInt();
		System.out.println("enter number of cols : ");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Original Matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		modifyMatrix(arr);
		System.out.println("Modified Matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	  static void modifyMatrix(int[][] arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
				squareRow(arr[i]);
			}
			else
			{
				reverseRow(arr[i]);
			}
		}
		
	}

	 

	  static void squareRow(int[] eRow) {
		for(int i=0;i<eRow.length;i++)
		{
			eRow[i]=eRow[i]*eRow[i];
		}
		
	  }
	   static void reverseRow(int[] oRow) {
			int start=0;
			int end=oRow.length-1;
			while(start<end)
			{
				int temp=oRow[end];
				oRow[end]=oRow[start];
				oRow[start]=temp;
				start++;
				end--;
			}
			
		}

}
