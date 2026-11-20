package com.exception_handling;

public class CustomException {

	public static void main(String[] args) throws LowMarksException {
		
		double marks=4;
		
			if(marks<40)
		{   
				System.out.println("hello");
			throw new LowMarksException("invalid marks");
		}
		
   System.out.println("main method ended!!");
	}

}
