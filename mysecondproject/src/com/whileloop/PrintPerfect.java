package com.whileloop;

import java.util.Scanner;

// WAP to find perfect numbers between a range 1 to n?
public class PrintPerfect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value : ");
		int n=sc.nextInt();
		 displayPerfectNumbers(1,n);
		 
         
	}

	  static void displayPerfectNumbers(int n1, int n) {
		   int sum=0;
		   System.out.print("perfect numbers in the given range are : ");
		   
		  for(int i=n1;i<=n;i++)
		  {   sum=0;
			  for(int j=1;j<=i/2;j++)
			  {
				  if(i%j==0)
				  {
					  sum=sum+j;
				  }
			  }
			  if(sum==i)
			  {
				  System.out.print(i+" ");
			  }
		  }
		
		
	}

}
