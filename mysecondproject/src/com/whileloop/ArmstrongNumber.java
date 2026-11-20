package com.whileloop;

import java.util.Scanner;

//WAP to check whether the given number is armstrong number or not?
public class ArmstrongNumber {
	

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number : ");
       int n=sc.nextInt();
       boolean status=isArmstrongNumber(n);
       if(status)
       {
    	   System.out.println("it is an armstrong number!");
       }
       else
       {
    	   System.out.println("it is not an armstrong number!");
       }
	}

	static boolean isArmstrongNumber(int n) {
	     boolean status=false;
	     int n1,n2;
	     n1=n;
	     n2=n;
	     int rem=0;
	     int sumPow=0;
	     int count=0;
	     while(n1>0)
	     {    
	    	 count++;
	    	 n1=n1/10;
	     }
	     while(n2>0)
	     {
	    	 rem=n2%10;
	    	 sumPow+=Math.pow(rem,count);
	    	 n2=n2/10;
	     }
	     if(sumPow==n)
	     {
	    	 status=true;
	     }
		return status;
	}

}
