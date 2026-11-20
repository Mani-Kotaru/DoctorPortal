package com.patterns;

import java.util.Scanner;

public class RectanglePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter size of side1 : ");
	      int s1=sc.nextInt();
	      System.out.println("enter size of side2 : ");
	      int s2=sc.nextInt();
	      for(int i=1;i<=s1;i++)
	      {
	    	  for(int j=1;j<=s2;j++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
	      

	}

}
