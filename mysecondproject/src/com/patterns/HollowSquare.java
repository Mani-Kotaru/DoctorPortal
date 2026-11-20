package com.patterns;

import java.util.Scanner;

public class HollowSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter size of side of square : ");
	     int size=sc.nextInt();
	     for(int i=1;i<=size;i++)
	     {   
	    	 for(int j=1;j<=size;j++)
	    	 {
	    		 if(j==1||j==size||i==1||i==size)
	    		 {
	    			 System.out.print("*");
	    		 }
	    		 else
	    		 {
	    			 System.out.print(" ");
	    		 }
	    	 }
	    	 System.out.println();
	     }
	}

}
