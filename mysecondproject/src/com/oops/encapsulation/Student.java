package com.oops.encapsulation;

public class Student {
	
      private int studentId;
      private String studentName;
      private double marks;
      
      public void setStudentId(int sid)
      {
    	  studentId=sid;
      }
      public void setStudentName(String sname)
      {
    	  studentName=sname;
      }
      public void setStudentMarks(double marks)
      {    
    	  if(marks>=0 && marks<=100)
    	     this.marks=marks;
    	  else
    		  System.out.println("invalid marks!");
      }
      
      public int getStudentId()
      {
    	  return studentId;
      }
      public String getStudentName()
      {
    	  return studentName;
      }
      public double getStudentMarks()
      {
    	  return marks;
      }
      
      
      
	

}
