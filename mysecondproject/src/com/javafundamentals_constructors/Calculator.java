package com.javafundamentals_constructors;

public class Calculator {
	
	Calculator(int a,int b)
	{
		System.out.println("Addition of "+a+" and "+b+" : "+(a+b));
	}
	Calculator(float a,float b)
	{
		System.out.println("subtraction of "+a+" and "+b+" : "+(a-b));
	}
	Calculator(long a,long b)
	{
		System.out.println("multiplication of "+a+" and "+b+" : "+(a*b));
	}
	Calculator(double a,double b)
	{
		System.out.println("Division of "+a+" and "+b+" : "+(a/b));
	}
	Calculator(byte a,byte b)
	{
		System.out.println("modulus of "+a+" and "+b+" : "+(a%b));
	}
  public static void main(String[] args) {
	  
	  Calculator c1=new Calculator(2,3);
	  Calculator c2=new Calculator(2.5f,3.5f);
	  Calculator c3=new Calculator(20000l,30000l);
	  Calculator c4=new Calculator(2678.987d,39879.9867d);
	  Calculator c5=new Calculator((byte)2,(byte)3);
	  

	}

}
