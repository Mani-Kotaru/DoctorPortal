package com.javafundamentals_constructors;

public class Person {
	String name;
	int age;
	char gender;
	Person()
	{
		System.out.println("no-arg constructor of person class");
	}
	Person(String name,int age)
	{    this.name=name;
	     this.age=age;
		System.out.println("two-arg constructor of person class");
	}
	public static void main(String[] args) {
            System.out.println("main method of person class");
	}
}
	 class Student1 extends Person {
		 Student1()
		 {  
			
			 System.out.println("no-arg constructor of student class");
		 }
		 Student1(String name,int age)
		 {   
		      super(name,age);
			 System.out.println("two-arg constructor of student class");
		 }
	    public static void main(String[] args) {
        
	    	 System.out.println("main method of student class");
	    	 Student2 s1=new Student2("Raghu",23);
	    	 Student2 s2=new Student2();
	    	 System.out.println("*****************************************");
	    	 System.out.println("name="+s1.name);
	    	 System.out.println("age="+s1.age);
	    	 
	   
		}
	
	}
