package com.whileloop;

import java.util.Scanner;
// WAP to print numbers from M to N excluding N?
//input: M=5,N=10
//output:5 6 7 8 9
public class PrintNumbers {
	static void displayNumbers(int m,int n)
	{
		 int i=m;
	     while(i<n)
	     {
	    	 System.out.print(i+" ");
	    	 i++;
	     }
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter starting value:");
     int m=sc.nextInt();
     System.out.println("enter ending value:");
     int n=sc.nextInt();
      displayNumbers(m,n);
     
     
	}

}
