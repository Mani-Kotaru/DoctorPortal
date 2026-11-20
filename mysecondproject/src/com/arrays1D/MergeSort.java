package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   // arr={4,3,5,2}
		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("array elements before sorting : " + Arrays.toString(arr));
		divide(arr);
		System.out.println("array elements after sorting : " + Arrays.toString(arr));
	}

	 static void divide(int[] arr) {
		if(arr.length<=1)
		{
			return;
		}
		int[] left=new int[arr.length/2];
		int[] right=new int[arr.length-left.length];
		int i;
		for(i=0;i<left.length;i++)
		{
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=arr[i];
			i++;
		}
		divide(left);
		divide(right);
		
		merge(arr,left,right);
	}

	  static void merge(int[] arr, int[] left, int[] right) {
		 
		{   int i=0;
		    int j=0;
		    int k=0;
		    while(i<left.length && j<right.length)
		    {
		    	if(left[i]<right[j])
		    	{
		    		arr[k++]=left[i++];
		    	}
		    	else
		    	{
		    		arr[k++]=right[j++];
		    	}
		    		
		    }
		    //edge cases
		    while(i<left.length)
		    {
		    	arr[k++]=left[i++];
		    }
		    while(j<right.length)
		    {
		    	arr[k++]=right[j++];
		    }
			
		}
		
	 }

      
}
