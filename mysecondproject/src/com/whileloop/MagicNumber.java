package com.whileloop;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		int result=isMagicNumber(n);
		if(result==1)
		{
			System.out.println("the given number is magic number!");
		}
		else
		{
			System.out.println("the given number is not a magic number!");
		}
   }

     static int isMagicNumber(int n) {
		  int result=0;
		  int n1=n;
		  int sum=0;
		  while(true)
		  {
			sum=0;
		  while(n1>0)
		  {
			  int rem=n1%10;
			  sum=sum+rem;
			  n1=n1/10;
		  }
		  if(sum>=0 && sum<=9)
		  {   result=sum;
			  break;
		  }
		  n1=sum;
		  
		  }
    	 return result;
	}

}
