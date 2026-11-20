package com.java8features;

import java.util.function.Predicate;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Predicate<Integer> isPrime=(num)-> { 
			                 if(num<2)
		                 {
			                return false;
		                 }
		                 boolean status=true;
		                 for(int i=2;i<=num/2;i++)
		                 {
		                	     if(num%i==0)
		                	     {
		                	    	     status=false;
		                	     }
		                 }
		                 return status;
		   };
		  if(isPrime.test(38))
		  {
			  System.out.println("it is a prime number");
		  }
		  else
		  {
			  System.out.println("it is not a prime number");
		  }

	}

}
