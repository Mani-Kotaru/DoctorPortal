package com.javafundamentals;

import java.util.Scanner;

public class FactoryMethod {
	
	class Student
	{
		int id;
		String name;
		double marks;
		byte age;
		float height;
		float weight;
		long mobileno;
	}
	
	Student displayDetails()
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		s.id=sc.nextInt();
		
		System.out.println("enter name:");
		sc.nextLine();
		s.name=sc.nextLine();
		
		System.out.println("enter marks:");
		s.marks=sc.nextDouble();
		
		System.out.println("enter age:");
		s.age=sc.nextByte();
		
		System.out.println("enter height:");
		s.height=sc.nextFloat();
		
		System.out.println("enter weight:");
		s.weight=sc.nextFloat();
		
		System.out.println("enter mobile number:");
		s.mobileno=sc.nextLong();
		
		return s;
	}

 void main() {
	
	 Student s1=displayDetails();
	System.out.println("id:"+s1.id);
	System.out.println("name:"+s1.name);
	System.out.println("marks:"+s1.marks);
	
	System.out.println("age:"+s1.age);
	System.out.println("height:"+s1.height);
	System.out.println("weight:"+s1.weight);
	
	System.out.println("mobile no:"+s1.mobileno);
		
	}

}
