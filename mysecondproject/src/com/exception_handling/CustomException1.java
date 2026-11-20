package com.exception_handling;

public class CustomException1 {
	static void check(double marks) throws LowMarksException
	{
		if(marks<40)
		{   
				System.out.println("hello");
			throw new LowMarksException("invalid marks");
		}
	}

	public static void main(String[] args) throws LowMarksException {
		
           check(4);
           System.out.println("main method ended!!");
	}

}
