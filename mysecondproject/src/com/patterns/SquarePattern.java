package com.patterns;

import java.util.Scanner;

// WAP to print square pattern using stars?
public class SquarePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      System.out.println("enter size of side of square : ");
      int size=sc.nextInt();
      for(int i=1;i<=size;i++)
      {
    	  for(int j=1;j<=size;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      
	}

}
