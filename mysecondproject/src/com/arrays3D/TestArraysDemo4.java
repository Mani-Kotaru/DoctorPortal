package com.arrays3D;
// 3D jagged array
import java.util.Scanner;

public class TestArraysDemo4 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter number of positions : ");
	     int pos=sc.nextInt();
	     int row=0,col=0;
	     for(int i=0;i<pos;i++)
	     {
	    	 System.out.println("enter number of rows at position "+i+" : ");
	    	  row=sc.nextInt();
	     }
	     for(int i=0;i<pos;i++)
	     {    
	    	 for(int j=0;j<row;j++)
	    	 {
	    	 System.out.println("enter number of cols at position "+i+" and row "+j+" : ");
	    	  col=sc.nextInt();
	     }
	     }
	     
	     int[][][] arr=new int[pos][row][col];
	     System.out.println("enter elements into the arrays : ");
	     for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=0;j<arr[i].length;j++)
	    	 {
	    		 for(int k=0;k<arr[i][j].length;k++)
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
