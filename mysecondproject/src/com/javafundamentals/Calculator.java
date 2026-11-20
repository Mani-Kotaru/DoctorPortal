package com.javafundamentals;
import java.util.Scanner;
public class Calculator {
	 Scanner sc=new Scanner(System.in);
     void add()
     { 
    	 System.out.println("enter a and b values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("sum of "+a+"+"+b+"="+(a+b));
	}
	void add(int x,int y)
	{
		System.out.println("sum of "+x+"+"+y+"="+(x+y));
	}
	void add(int x,int y,int z)
	{
		System.out.println("sum of"+x+"+"+y+"+"+z+"="+(x+y+z));
	}
    public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 Calculator c=new Calculator();
    	 c.add();
    	 System.out.println("enter 2 numbers: ");
    	 int m=sc.nextInt();
    	 int n=sc.nextInt();
    	 c.add(m,n);
    	 System.out.println("enter one more number:");
    	 int o=sc.nextInt();
    	 c.add(m,n,o);
    	 
    	
	}

}
