package com.java_case_study;

import java.util.Scanner;

public class CollegeExamResults {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     float[] marks=new float[5];
     System.out.println("enter the marks of 25 students of the class :  ");
      for(int i=0;i<marks.length;i++)
      {    
    	  System.out.println("enter student "+(i+1)+" marks : ");
    	  marks[i]=sc.nextFloat();
      }
     
      findPassFailCount(marks);
      findHighLowMarks(marks);
      float avg=findClassAverage(marks);
      System.out.println("Class average : "+avg);
      
	}

	   

		static void findPassFailCount(float[] marks) {
		 int passCount=0;
	      int failCount=0;
	      for(float i:marks)
	      {
	    	  if(i>=35)
	    	  {
	    		  passCount++;
	    	  }
	    	  else
	    	  {
	    		  failCount++;
	    	  }
	      }
	      System.out.println("number of passed students : "+passCount);
	      System.out.println("number of failed students : "+failCount);
	}
	    static void findHighLowMarks(float[] marks) {
           float min=marks[0];
           float max=marks[0];
           for(float i:marks)
           {
        	   if(i<min)
        	   {
        		   min=i;
        	   }
        	   else if(i>max)
        	   {
        		   max=i;
        	   }
           }
           System.out.println("Highest Marks : "+max);
           System.out.println("Lowest Marks : "+min);
		}
	     static float findClassAverage(float[] marks) {
			  float sum=0,avg=0;
			  for(float i:marks)
			  {
				  sum+=i;
			  }
			  avg=sum/marks.length;
	    	 
	    	 return avg;
		}

}
