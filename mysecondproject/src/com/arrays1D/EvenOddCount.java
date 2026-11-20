package com.arrays1D;

import java.util.Scanner;

// WAP to display count of  even and odd elements of an array?
public class EvenOddCount {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of the array : ");
      int n=sc.nextInt();
      int[] arr=new int[n];
      int evenCount=0;
      int oddCount=0;
      System.out.println("enter elements into the array : ");
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
    	  if(arr[i]%2==0)
    	  {
    		  evenCount++;
    	  }
    	  else
    	  {
    		  oddCount++;
    	  }
      }
      System.out.println("number of even elements : "+evenCount);
      System.out.println("number of odd elements : "+oddCount);
	}

}
