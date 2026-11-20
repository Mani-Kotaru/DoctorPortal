package com.exception_handling;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks :");
        double marks=sc.nextDouble();
        try {
        	Student s=new Student();
        	s.checkStudentMarks(marks);
        	
        }catch( LowMarksException e)
        {
        	System.out.println(e);
        }

	}

}
