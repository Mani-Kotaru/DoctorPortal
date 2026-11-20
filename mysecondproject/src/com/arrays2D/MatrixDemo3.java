package com.arrays2D;

import java.util.Scanner;

public class MatrixDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of square matrix : ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int psum=0,ssum=0,pssum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
                if(i==j)
                {
                	psum=psum+arr[i][j];
                }
                if(i+j==arr.length-1)
                {
                	ssum=ssum+arr[i][j];
                }
                
			}
		}
		System.out.println("Primary Diagonal sum : "+psum);
		System.out.println("secondary Diagonal sum : "+ssum);
		pssum=psum+ssum;
		if(arr.length%2==1)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					if(i==j && i+j==arr.length-1)
					{
						pssum-=arr[i][j];
					}
				}
			}
		System.out.println("sum of diagonal elements : "+pssum);
		}
		else
		{
			System.out.println("sum of diagonal elements : "+pssum);
		}
		
	}

}
