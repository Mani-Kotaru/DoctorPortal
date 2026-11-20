package com.forloop;
//WAP to print prime numbers between a range 0 to n?
import java.util.Scanner;

public class FindPrimeNumber {
	
	    static boolean isPrime(int n)
	     {   
	    	boolean flag=true;
	    	if(n==0||n==1)
	    	{
	    		return false;
	    	}
	    	for(int i=2;i<=n/2;i++)
	    	{
	    		if(n%2==0)
	    		{
	    			flag=false;
	    	        break;
	    		}
	    	}
	    	 return flag;
	    	
	    	
	     }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		System.out.print("Prime numbers are:");
		for(int i=0;i<=num;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
		
		sc.close();
	}
	

}
