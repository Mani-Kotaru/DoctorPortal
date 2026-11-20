package com.javafundamentals_constructors;

public class Office {
	 
	String officeName;
	String officeLocation;
	
	Office()
	{
		  
		  officeName="wells fargo";
	}
	
	public static void main(String[] args) {
         System.out.println("main method of Office class");
         
        
          
	}
	void display()
	{
		System.out.println("Office name:"+officeName);
		System.out.println("Office location:"+officeLocation);
	}
	  
}

class Employee1 extends Office{
	int empid;
	String empname;
	double salary;
	String officeName;
	Employee1()
	{
		
		super();
		System.out.println("no-arg constructor of employee class");
		
		
	}
	Employee1(int empid,String empname,double salary, String officeName)
	{    
		this();
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.officeName=officeName;
		System.out.println("-----------------------------------------------");

        System.out.println("office name in employee class:"+this.officeName);
		System.out.println("office name in Office class:"+super.officeName);
		System.out.println("-----------------------------------------------");
		
		this.display();
		System.out.println("-----------------------------------------------");
		super.display();
	}
	

	public static void main(String[] args) {

		System.out.println("main method of employee class");
       Employee1 e1=new Employee1(101,"Mani",80000,"Accenture");
       
	}
	
	void display()
	{
		System.out.println("Employee id:"+empid);
		System.out.println("Employee name:"+empname);
		System.out.println("Employee salary:"+salary);
		System.out.println("Office name:"+officeName);
	}
	
}
