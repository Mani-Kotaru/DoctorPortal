package com.patterns;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows :");
		int rows=sc.nextInt();
		  int spaces=3;
		  int stars=2;
		  for(int i=1;i<=3;i++)
		  {
			  for(int j=1;j<=stars/2;j++)
			  {
				  System.out.print("*");
			  }
			  for(int k=1;k<=spaces;k++)
			  {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=stars-stars/2;j++)
			  {
				  System.out.print("*");
			  }
			  spaces-=2;
			  if(spaces==-1) 
				 stars=5;
			  else
			   stars=stars+2;
			  System.out.println();
			}
		  stars=4;
		  spaces=1;
		  for(int i=1;i<=2;i++)
		  {
			  for(int j=1;j<=stars/2;j++)
			  {
				  System.out.print("*");
			  }
			  for(int k=1;k<=spaces;k++)
			  {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=stars-stars/2;j++)
			  {
				  System.out.print("*");
			  }
			  stars=stars-2;
			  spaces=spaces+2;
			  System.out.println();
		  }
		
		 }
	}


