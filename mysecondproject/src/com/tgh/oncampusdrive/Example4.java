package com.tgh.oncampusdrive;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
         char arr[][]=new char[5][5];
         char charArr[]= {'D','H','O','N','I'};
         int k=0;
         for(int i=0;i<arr.length;i++)
         {
        	      arr[i][i]=charArr[k];
        	      arr[i][arr.length-1-i]=charArr[k];
        	    	    	 k++;
        	    	    	}
        	 
         char ch='A';
         for(int i=0;i<arr.length;i++)
         {
        	    for(int j=0;j<arr[0].length;j++)
        	    {  
        	    	     if(i==j||i+j==4)
        	    	     {
        	    	    	 continue;
        	    	     }
        	    	     arr[i][j]=ch++;
        	    }
        	    
         }
         
         System.out.println("Required Matrix : ");
         for(int i=0;i<arr.length;i++)
         {
        	     for(int j=0;j<arr[0].length;j++)
        	     {
        	    	    System.out.print(arr[i][j]+" ");
        	     }
        	     System.out.println();
         }
	}

}
