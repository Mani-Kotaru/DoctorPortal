package com.javafundamentals_constructors;

public class ConstructorChaining {
	int id;
	String name;
	
	ConstructorChaining()
	{  
		System.out.println("no arg constructor called!!");
	}
	
	ConstructorChaining(int id,String name)
	{
		//this();                          
		//parameterized constructors have super(); method as the first line of code inside constructor by default
		//but parameterized constructors do not have this(); method as the first line of code inside constructor by default
		//if we want we have to declare this();method inside constructor as the first line of code
		System.out.println("two arg constructor called!!");
	}

	public static void main(String[] args) {
            
		ConstructorChaining c1=new ConstructorChaining(1,"Mani");
	}

}
