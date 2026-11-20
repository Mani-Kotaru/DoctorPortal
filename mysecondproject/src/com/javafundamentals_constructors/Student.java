package com.javafundamentals_constructors;

public class Student {
	int id;
	String name;
	double obtainedMarks;
	int totalMarks;
	double percentage;
	Student()
	{
		id=1;
		name="Mani";
		obtainedMarks=95;
		totalMarks=100;
		percentage=95;
	}
	Student(int id,String name,double obtainedMarks,int totalMarks,double percentage)
	{
		this.id=id;
		this.name=name;
		this.obtainedMarks=obtainedMarks;
		this.totalMarks=totalMarks;
		this. percentage=percentage;
	}
	Student(double obtainedMarks,int totalMarks)
	{
		this.obtainedMarks=obtainedMarks;
		this.totalMarks=totalMarks;
		 percentage=(obtainedMarks/totalMarks)*100;
		System.out.println("obtainedMarks:"+obtainedMarks);
		System.out.println("totalMarks:"+totalMarks);
		System.out.println("percentage:"+percentage);
		
	}
	Student(double percentage,int totalMarks,int id)
	{
		 obtainedMarks=(percentage/100)*totalMarks;
		System.out.println("id:"+id);
		System.out.println("totalMarks:"+totalMarks);
		System.out.println("percentage:"+percentage);
		System.out.println("obtainedMarks:"+obtainedMarks);
	}
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		Student s1=new Student();
		  s1.display();
		Student s2=new Student(2,"Raghu",94.5,100,89);
		s2.display();
		System.out.println("------------------------------------");
		Student s3=new Student(84.5,100);
		System.out.println("------------------------------------");
		Student s4=new Student(83,120,5);
		Student s5=new Student(4,"Madhavi");
		s5.display();
				
		

	}
	void display()
	{    System.out.println("-------------------------------------------------");
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("obtainedMarks:"+obtainedMarks);
		System.out.println("totalMarks:"+totalMarks);
		System.out.println("percentage:"+percentage);
	}

}
