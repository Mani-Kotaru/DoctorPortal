package com.practice;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {1,3,5,6,3,3};
		int result[]=new int[arr.length];
		System.out.println("original array : "+Arrays.toString(arr));
		int k=0;
		for(int i=0;i<arr.length;i++)
		{   int count=0;
			for(int j=0;j<k;j++)
			{  
				if(arr[i]==result[j])
				{
					count++;
      				break;
				}
				
			}
			if(count==0)
			{
				result[k++]=arr[i];
			}
		}
		System.out.print("array after removing duplicates : ");
		for(int i=0;i<k;i++)
		{
			System.out.print(result[i]+" ");
		}

	}

}
