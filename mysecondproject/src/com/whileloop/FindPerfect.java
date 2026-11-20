package com.whileloop;

import java.util.Scanner;

//WAP to check given number is perfect or not using while loop?
public class FindPerfect {
	
	  static boolean isPerfect(int n)
	  {
		  boolean status=false;
		  int sum=0;
		  int i=1;
		  while(i<=n/2)
		  {
			  if(n%i==0)
			  {
				  sum+=i;
			  }
			  i++;
		  }
		  if(sum==n)
		  {
			  status=true;
		  }
		  
		  return status;
	  }

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number : ");
     int n=sc.nextInt();
     boolean status=isPerfect(n);
     if(status)
     {
    	 System.out.println("it is a perfect number!!");
     }
     else
     {
    	 System.out.println("it is not a perfect number!!");
     }
	}

}
