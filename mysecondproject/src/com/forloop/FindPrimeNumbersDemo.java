package com.forloop;

import java.util.Scanner;

public class FindPrimeNumbersDemo {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number:");
         int num=sc.nextInt();
         int count=0;
         System.out.print("prime numbers are:");
         for(int i=2;i<=num;i++)
         {    
        	 count=0;
        	 for(int j=2;j<=i/2;j++)
        	 {
        		 if(i%j==0)
        		 {
        			 count++;
        		 }
        	 }
        	 if(count==0)
        	 {
        		 System.out.print(i+" ");
        	 }
         }
	}

}
