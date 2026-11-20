package com.javafundamentals_constructors;

public class Person1 {
	

	int id;
	String name;
	double sal;
	
	Person1()
	{
		System.out.println("no-arg constructor of Person1 class");
	}
	Person1(int id,String name,double sal)
	{    
		 System.out.println("3-arg constructor of Person1 class");
	}

	public static void main(String[] args) {
		System.out.println("main method of Person1 class");
	}

}
class Manager extends Person1 {
	
	Manager()
	{
		System.out.println("no-arg constructor of Manager class");
	}
	
	Manager(int id,String name,double sal)
	{
		super(id,name,sal);
		this.id=id;
		this.name=name;
		this.sal=sal;
		 System.out.println("3-arg constructor of Manager class");
		
	}
	public static void main(String[] args) {
		System.out.println("main method of Manager class");
	}
	
	

}
class Employee extends Manager {
	
	
     Employee()
     {
    	 System.out.println("no-arg constructor of Employee class");
     }
     Employee(int id,String name,double sal)
     {
    	 super(id,name,sal);
    	 System.out.println("3-arg constructor of Employee class");
     }
	public static void main(String[] args) {

		System.out.println("main method of Employee class");
		
		Employee e1=new Employee();
		System.out.println("-------------------------------------------------");
		Manager m1=new Manager();
		System.out.println("-------------------------------------------------");
		Person1 p1=new Person1();
		System.out.println("-------------------------------------------------");
		Employee e2=new Employee(101,"ramesh",50000);
		System.out.println("-------------------------------------------------");
		System.out.println("Employee ID:"+e2.id);
		System.out.println("Employee name:"+e2.name);
		System.out.println("Employee salary:"+e2.sal);
		
		
	}

}
