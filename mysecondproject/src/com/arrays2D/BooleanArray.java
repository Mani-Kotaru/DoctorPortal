package com.arrays2D;

import java.util.Scanner;

public class BooleanArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows : ");
		int rows=sc.nextInt();
		System.out.println("enter number of cols : ");
		int cols=sc.nextInt();
		sc.nextLine();
	    boolean[][] arr=new boolean[rows][cols];
	    System.out.println("enter elements into the array : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[i].length;j++)
	    	{
	    		arr[i][j]=sc.nextBoolean();
	    	}
	    }
	    System.out.println("elements in the array are : ");
	    for(boolean[] i:arr)
	    {
	    	for(boolean j:i)
	    	{
	    		System.out.print(j+" ");
	    	}
	    	System.out.println();
	    }
	}

}
