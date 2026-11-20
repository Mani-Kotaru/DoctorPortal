package com.java_operators;
import java.util.Scanner;
public class SwapNumbers {
      
	void swapWithoutThirdVariable(double a,double b)
	{
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("1)numbers after swapping without using third variable:");
       System.out.println("a="+a+" and b="+b);
	}
	void swapUsingThirdVariable(double a,double b)
	{
		  double temp;
		  temp=a;
		  a=b;
		  b=temp;
		System.out.println("2) numbers after swapping using third variable:");
	       System.out.println("a="+a+" and a="+b);
	}
	     void main() {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two numbers:");
         double a=sc.nextDouble();
         double b=sc.nextDouble();
         System.out.println("before swapping a="+a+" and b="+b);
         swapWithoutThirdVariable(a,b);
         swapUsingThirdVariable(a,b);
         
	}

}
