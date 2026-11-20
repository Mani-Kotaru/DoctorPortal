package com.arrays2D;

import java.util.Scanner;

public class JaggedArray1 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	  int[][] arr=new int[2][];
	  arr[0]=new int[3];
	  arr[1]=new int[2];
	  System.out.println("enter elements into jagged array : ");
	  for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=0;j<arr[i].length;j++)
	    	 {
	    		 arr[i][j]=sc.nextInt();
	    	 }
	    	
	     }
	  System.out.println("elements of the jagged array are : ");
	  for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=0;j<arr[i].length;j++)
	    	 {
	    		 System.out.print(arr[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }
	}

}
