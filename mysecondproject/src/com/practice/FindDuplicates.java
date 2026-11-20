package com.practice;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,3,4,5,5};
		int result[]=new int[arr.length];
		System.out.println("Original array: " + Arrays.toString(arr));
		
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{   int count=1;
			for(int j=i+1;j<arr.length;j++)
			{  
				if(arr[i]==arr[j])
				{
					count++;
      				break;
				}
				
			}
			if(count>1)
			{   
				int iCount=0;
				for(int j=0;j<k;j++)
				{
				  if(arr[i]==result[j])
				  {
					  iCount++;
					  break;
				  }
			     }
				if(iCount==0)
				  result[k++]=arr[i];
		     }
			
		}
		System.out.print("duplicates of array : ");
		for(int i=0;i<k;i++)
		{
			System.out.print(result[i]+" ");
		}


	}

}
