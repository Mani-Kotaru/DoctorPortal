package com.tgh.oncampusdrive;

import java.util.Arrays;
import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array : ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements into the array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array elements : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
			
		{   
			
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[j]<arr[i])
			{
				
				arr[i]=arr[i]-arr[j];

				break;
			}
		  }
					}
		System.out.println("Array elements after discount : "+Arrays.toString(arr));

	}

}
