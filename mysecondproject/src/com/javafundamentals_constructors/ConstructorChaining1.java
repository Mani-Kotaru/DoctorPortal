package com.javafundamentals_constructors;

public class ConstructorChaining1 {
	
	int id;
	String name;
	
//	ConstructorChaining1()
//	{     
//		
//		System.out.println("no-arg constructor called!!");
//	}
	ConstructorChaining1(int id ,String name)
	{
		
		this.id=id;
		this.name=name;
		System.out.println("two-arg constructor called!!");
		
	}
	public static void main(String[] args) {
		
		ConstructorChaining1 c1=new ConstructorChaining1();
		             c1.display();
		ConstructorChaining1 c2=new ConstructorChaining1(101,"mani");
		             c2.display();
      }
	
	void display()
	{
		System.out.println("id :"+id);
		System.out.println("name:"+name);
		System.out.println("*****************");
	}

}
