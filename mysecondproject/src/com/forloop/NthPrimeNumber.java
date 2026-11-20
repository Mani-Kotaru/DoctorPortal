package com.forloop;

import java.util.Scanner;

public class NthPrimeNumber {
	
     static boolean isPrime(int n)
     {
    	 boolean flag=true;
    	 if(n==0||n==1)
    	 {
    		 return false;
    	 }
    	 for(int i=2;i<=n/2;i++)
    	 {
    		 if(n%i==0)
    		 {
    		 flag=false;
    		 break;
    		 }
    	 }
    	 return flag;
    	 
     }

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter end value of range :");
     int n=sc.nextInt();
     System.out.println("enter which prime number you want in the given range:");
     int position=sc.nextInt();
     int count=0;
     for(int i=0;i<=n;i++)
     {
    	 if(isPrime(i))
    	 {
    		 count++;
    		 if(position==count)
        	 {
        		 System.out.println("the prime number at position "+position+" is "+i);
        		 break;
        	 }
    	 }
    	
    	
    	 
     }
     }
     
	}


