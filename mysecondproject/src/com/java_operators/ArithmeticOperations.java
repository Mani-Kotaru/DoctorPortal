package com.java_operators;
import java.util.Scanner;
public class ArithmeticOperations {
	
	    void addition(double a,double b)
	    {
	    	 System.out.println("sum of two numbers :"+(a+b));
	    }
        
	    void subtraction(double a,double b)
	    {
	    	System.out.println("difference of two numbers :"+(a-b));
	    }

	    void multiplication(double a,double b)
	    {
	    	 System.out.println("product of two numbers :"+(a*b));
	    }

	    void division(double a,double b)
	    {
	    	System.out.println("quotient of two numbers :"+(a/b));
	    }

	    void modulus(double a,double b)
	    {
	    	System.out.println("remainder of two numbers :"+(a%b));
	    }

	 void main() {
        double a;
        double b;
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter two numbers:");
        a=sc.nextDouble();
        b=sc.nextDouble();
        
        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
        division(a,b);
        modulus(a,b);
       }

}
