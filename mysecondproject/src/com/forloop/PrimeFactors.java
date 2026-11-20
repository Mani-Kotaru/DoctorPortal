package com.forloop;

import java.util.Scanner;

// WAP to print all prime factors of the given number?
public class PrimeFactors {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number : ");
    int n=sc.nextInt();
     printPrimeFactors(n);
	}

	 static void printPrimeFactors(int n) {
		   if(n<=1)
		   {
			   System.out.println("No prime factors for "+n);
		   }
		 for(int i=2;i<=n;i++)
		 {
			 if(n%i==0)
			 {
				 if(isPrime(i))
				 {
					 System.out.print(i+" ");
				 }
			 }
		 }
	}

	  static boolean isPrime(int n) {
		 
		  boolean status=false;
		  int count=0;
		  
		  for(int i=2;i<=n/2;i++)
		  {
			  if(n%i==0)
			  {
				  count++;
			  }
		  }
		  if(count==0)
		  {
			  status=true;
		  }
		  
		  
		  return status;
	 }
	 
	 

}
