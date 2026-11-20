package com.javafundamentals_constructors;

 public class Demo {
     
	 Demo(Demo dm)
	 {
		 System.out.println("object recieved!!");
	 }
	 Demo() 
	 {
    	
    	Demo d1 = new Demo(this); // passing current object
		 
      }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
