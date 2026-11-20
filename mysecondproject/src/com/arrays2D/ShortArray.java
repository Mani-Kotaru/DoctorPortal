package com.arrays2D;

import java.util.Scanner;

public class ShortArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows : ");
		int rows=sc.nextInt();
		System.out.println("enter number of cols : ");
		int cols=sc.nextInt();
	    short[][] arr=new short[rows][cols];
	    System.out.println("enter elements into the array : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[0].length;j++)
	    	{
	    		arr[i][j]=sc.nextShort();
	    	}
	    }
	    System.out.println("elements in the array are : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[0].length;j++)
	    	{
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}

}
