package com.javafundamentals_constructors;

public class Shape {
      String color;
      
      Shape()
      {    
    	  this("pink");
    	  System.out.println("no-arg constructor of Shape class");
      }
      Shape(String color)
      {
    	  System.out.println("one-arg constructor of Shape class");
      }
	public static void main(String[] args) {
     System.out.println("main method of Shape class");
	}

}

class Rectangle extends Shape{
	    int length;
	    int breadth;
	    
	    Rectangle()
	    {
	       super(); //we will get same answer with or without super(); method
	    	System.out.println("no-arg constructor of Rectangle class");
	    }
	    Rectangle(int length,int breadth)
	    {      
	    	this();
	    	 
	    	 System.out.println("two-arg constructor of Rectangle class");
	    }
   public static void main(String[] args) {
    
	   System.out.println("main method of Rectangle class");
	   
	   Rectangle r1=new Rectangle(10,20);
	}

}
