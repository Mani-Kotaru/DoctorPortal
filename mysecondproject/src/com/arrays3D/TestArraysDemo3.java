package com.arrays3D;

import java.util.Scanner;

public class TestArraysDemo3 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number of positions : ");
     int pos=sc.nextInt();
     System.out.println("enter number of rows : ");
     int row=sc.nextInt();
     System.out.println("enter number of columns : ");
     int col=sc.nextInt();
     int[][][] arr=new int[pos][row][col];
     System.out.println("enter elements into the arrays : ");
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr[0].length;j++)
    	 {
    		 for(int k=0;k<arr[0][0].length;k++)
    		 {
    			 arr[i][j][k]=sc.nextInt();
    		 }
    	 }
     }
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr[0].length;j++)
    	 {
    		 for(int k=0;k<arr[0][0].length;k++)
    		 {
    			 System.out.print(arr[i][j][k]+" "); 
    		 }
    		 System.out.println();
    	 }
    	 System.out.println();
     }
     
	}

}
