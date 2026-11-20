package com.oops.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
      Student s1=new Student();
      s1.setStudentId(101);
      s1.setStudentName("Mani");
      s1.setStudentMarks(98);
      System.out.println("Student details : ");
      System.out.println("Student Id : "+s1.getStudentId());
      System.out.println("Student Name : "+s1.getStudentName());
      System.out.println("Student Marks : "+s1.getStudentMarks());
      
     
      
	}

}
