package com.tgh.oncampusdrive;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter size of square matrix : ");
          int n=sc.nextInt();
          int arr[][]=new int[n][n];
          System.out.println("enter elements into the array : ");
          for(int i=0;i<n;i++)
          {
        	     for(int j=0;j<n;j++)
        	     {
        	    	   arr[i][j]=sc.nextInt();
        	     }
          }
         System.out.println("original matrix : ");
         for(int i=0;i<n;i++)
         {
       	     for(int j=0;j<n;j++)
       	     {
       	    	  System.out.print(arr[i][j]+" ");
       	     }
       	     System.out.println();
         }
         
         for(int i=0;i<arr.length;i++)
         {
        	    if(i%2==0)
        	    {  
        	    	    reverse(arr[i]);
        	    	}
        	    else
        	    {
        	    	    doubleElements(arr[i],i);
        	    }
         }
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=0;j<arr[0].length;j++)
        	 {
        		 if(i==j)
        		 {
        			arr[i][j]=arr[i][j]*arr[i][j];
        		 }
        	 }
         }
         
         System.out.println("modified matrix : ");
         for(int i=0;i<n;i++)
         {
       	     for(int j=0;j<n;j++)
       	     {
       	    	  System.out.print(arr[i][j]+" ");
       	     }
       	     System.out.println();
         }
	}

	private static void doubleElements(int[] arr,int i) {
		       
			   for(int j=0;j<arr.length;j++)
			   {
				      if(i!=j)
				      {
				    	    arr[j]=arr[j]*2;
				      }
			   }
		       
		   
	}

	private static void reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		int temp=0;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}

}
