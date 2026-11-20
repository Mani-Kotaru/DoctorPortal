package com.arrays2D;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows : ");
		int rows=sc.nextInt();
		System.out.println("enter number of cols : ");
		int cols=sc.nextInt();
		sc.nextLine();
	    String[][] arr=new String[rows][cols];
	    System.out.println("enter elements into the array : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=0;j<arr[i].length;j++)
	    	{
	    		arr[i][j]=sc.nextLine();
	    	}
	    }
	    System.out.println("elements in the array are : ");
	    for(String[] i:arr)
	    {
	    	for(String j:i)
	    	{
	    		System.out.print(j+" ");
	    	}
	    	System.out.println();
	    }
	}

}
