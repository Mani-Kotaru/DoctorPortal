package com.exception_handling;

import java.util.Scanner;

public class Student {
	     void checkStudentMarks(double marks)  throws LowMarksException
	     {
			 
	    	 if(marks<40)
			 {
				 throw new LowMarksException("marks should be 40 or above");
			 }
			 
	     }
		

	}

