package com.forloop;

import java.util.Scanner;

// WAP to find the factors or divisors of a given number?
public class FindFactors {
	
	static void findFactors(int num)
	{   
		 System.out.print("factors of given number are : ");
		
		 for(int i=1;i<=num/2;i++)
	     {
	    	if(num%i==0) 
	    	{
	    		System.out.print(i+" ");
	    	}
	     }
	     System.out.print(num);
		
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number : ");
     int num=sc.nextInt();
       findFactors(num);
    
	}

}
