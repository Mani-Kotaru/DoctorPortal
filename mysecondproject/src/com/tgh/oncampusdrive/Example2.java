package com.tgh.oncampusdrive;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n value : ");
       int n=sc.nextInt();
		int temp=1;
		
       for(int i=1;i<=n;i++)
       {   
    	      int count=0;
    	      int arr[]=new int[i];
    	      while(count<i)
    	      {
    	    	      if(isPrime(temp))
    	    	      {
    	    	    	     temp++;
    	    	    	  }
    	    	      else
    	    	      {
    	    	    	  arr[count]=temp;
    	    	    	  count++;
    	    	    	  temp++;
    	    	      }
    	      }
    	      if(i%2==1)
    	      {
    	    	  for(int j=0;j<arr.length;j++)
    	    	  {
    	    		  System.out.print(arr[j]+" ");
    	    	  }
    	      }
    	      else
    	      {
    	    	    for(int j=arr.length-1;j>=0;j--)
    	    	  {
    	    		  System.out.print(arr[j]+" ");
    	    	  }
    	    	  
    	      }
    	      System.out.println();
       }
	}

	private static boolean isPrime(int temp) {
		if(temp<2)
		{
			return false;
		}
		for(int i=2;i<=temp/2;i++)
		{
			if(temp%i==0)
			{
				return false;
			}
		}
		
		
		
		return true;
	}

}
