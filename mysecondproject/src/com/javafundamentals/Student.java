package com.javafundamentals;
import java.util.*;
public class Student {
      int studentId;
      String studentName;
      double marks;
      static int count;
      void displayWelcome()
      {
    	  System.out.println("Welcome to Student Management System");
      }
      void setStudentDetails(int id,String name,double marks)
      {
    	  studentId=id;
    	  studentName=name;
    	  this.marks=marks;
    	  count++;
    	}
      int getMarks()
      {
    	  return (int)marks;
      }
      double calculateBonusMarks(int bonus)
      {
    	  marks=marks+bonus;
    	  return marks;
      }
      
      static void displayCollegeName()
      {
    	  System.out.println("Chalapathi Institute of Technology");
      }
      static int displayTotalStudentsCount()
      {
    	 return count; 
      }
	public static void main(String[] args) {
		
		Student s=new Student();
		s.displayWelcome();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name:");
		String name=sc.nextLine();
		System.out.println("enter marks:");
		double marks=sc.nextDouble();
		s.setStudentDetails(id,name,marks);
		double d=s.getMarks();
		System.out.println("marks of the student :"+d);
		System.out.println("enter bonus marks of the student:");
		int b=sc.nextInt();
		 double updatedMarks=s.calculateBonusMarks(b);
		 System.out.println("updated marks:"+updatedMarks);
		 displayCollegeName();
		 Student s1=new Student();
		 s1.setStudentDetails(2,"Raghu",100);
		 		 Student s2=new Student();
		 s2.setStudentDetails(4,"Srinu",99);;
		 
		int count= displayTotalStudentsCount();
		System.out.println("number of students:"+count);
		 

	}

}
