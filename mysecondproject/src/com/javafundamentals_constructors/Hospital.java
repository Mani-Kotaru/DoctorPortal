package com.javafundamentals_constructors;

public class Hospital {
	
	int patientId;
	String patientName;
	String disease;
	Hospital()
	{
		this("laya");
		System.out.println("no-arg constructor called!");
	}
    Hospital(int patientId)
	{  
		this();
	   System.out.println("int-arg constructor called!");
	}
	Hospital(String patientName)
	{
		this(101,"Viral Fever");
		System.out.println("String-arg constructor called!");
	}
	Hospital(int patientId,String disease)
	{
		System.out.println("int,String-arg constructor called!");
	}

	public static void main(String[] args) {
		
		Hospital h1=new Hospital(100);
		System.out.println("-------------------------------");
		Hospital h2=new Hospital(100,"jaundice");
		System.out.println("-------------------------------");
		Hospital h3=new Hospital();
		System.out.println("-------------------------------");
		Hospital h4=new Hospital("lalitha");
		System.out.println("-------------------------------");

	}

}
