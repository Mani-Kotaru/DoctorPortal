package com.java_operators;
import java.util.Scanner;
public class Rectangle {
	
	void areaOfRectangle(double l,double b)
	{
		double area=l*b;
		System.out.println("area of rectangle:"+area);
	}
	
	void perimeterOfRectangle(double l,double b)
	{
		double perimeter=2*(l+b);
		System.out.println("area of rectangle:"+perimeter);
	}
      
	public static void main(String[] args) {
		
		double length;
	      double breadth;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lenghth:");
		 length=sc.nextDouble();
		System.out.println("enter breadth:");
		 breadth=sc.nextDouble();
		 Rectangle r1=new Rectangle();
		 
		 r1.areaOfRectangle(length,breadth);
		 r1.perimeterOfRectangle(length,breadth);
		 
         
	}

}
