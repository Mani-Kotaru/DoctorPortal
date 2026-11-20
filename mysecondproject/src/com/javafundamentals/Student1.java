package com.javafundamentals;

public class Student1 {
     int id;                     
     String name;
     String  course;
     
     Student1()
     {
    	 id=1;
    	 name="mani";
    	 course="jfs";
    	 System.out.println("No arg constructor called!!");
     }
     void display()
     {
    	 System.out.println("student id:"+id);
    	 System.out.println("student name:"+name);
    	 System.out.println("student course:"+course);
     }
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.display();

	}

}
