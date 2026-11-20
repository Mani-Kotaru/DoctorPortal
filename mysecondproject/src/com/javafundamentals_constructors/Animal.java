package com.javafundamentals_constructors;

public class Animal {
	
	String name;
	String color;
	int age;
	Animal()
	{
		System.out.println("no arg constructor called!");
	}
	Animal(String name)
	{    
		this.name=name;
	}
	Animal(Animal a2,String color)
	{
		this.name=a2.name;
		this.color=color;
	}
	Animal(Animal a3,int age)
	{
		this.name=a3.name;
		this.color=a3.color;
		this.age=age;
	}

	public static void main(String[] args) {
     
	System.out.println("main method started!");
	
	Animal a1=new Animal();
	a1.animalInfo();
	
	Animal a2=new Animal("elephant");
	a2.animalInfo();
	
	Animal a3=new Animal(a2,"black");
	a3.animalInfo();
	 
	Animal a4=new Animal(a3,79);
	a4.animalInfo();
	
	
	}
	void animalInfo()
	{
		System.out.println("name of the animal:"+name);
		System.out.println("color of the animal:"+color);
		System.out.println("age of the animal:"+age);
		System.out.println("*************************************");
	}

}
