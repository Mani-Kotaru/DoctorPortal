package com.arrays2D;

import java.util.Arrays;
import java.util.Scanner;

//WAP to transpose a matrix using an another array ?
// using another array we can transpose both square, rectangular matrices.
public class TransposeMatrix1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows : ");
		int rows=sc.nextInt();
		System.out.println("enter number of cols : ");
		int cols=sc.nextInt();
	    int[][] arr=new int[rows][cols];
	    int[][] trans=new int[cols][rows];
	    System.out.println("enter elements into the array : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[0].length;j++)
	    	{
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
	    System.out.println("Matrix : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[0].length;j++)
	    	{
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("Transpose Matrix : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[0].length;j++)
	    	{
	    		trans[j][i]=arr[i][j];
	    	}
	    }
	    System.out.println("[");
	    for(int i=0;i<trans.length;i++)
	    {  System.out.print("  [");
	    	for(int j=0;j<trans[0].length;j++)
	    	{
	    		System.out.print(trans[i][j]);
	    		if( j!=trans[0].length-1)
	    		{
	    			System.out.print(" ");
	    		}
	    		
	    	}
	    	System.out.print("]");
	    	System.out.println();
	    }
	    System.out.println("]");
// displaying elements using Arrays.toString() method
//	    for(int i=0;i<trans.length;i++)
//	    {
//	    	System.out.println(Arrays.toString(trans[i]));
//	    }
	 
	}

}
