package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements into the array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int maxIndex=0;
		int minIndex=0;
		boolean bool=false;
		for(int i=0;i<arr.length;i++)
		{   int max=arr[i];
		     maxIndex=i;
			for(int j=0;j<i;j++)
			{
				if(arr[j]>=max)
				{
					max=arr[j];
					maxIndex=j;
				}
			}
			int min=arr[i];
			minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<=min)
				{
					min=arr[j];
					minIndex=j;
				}
			}
			if(minIndex==i && maxIndex==i)
			{
				System.out.println("required elemnet is : "+arr[i]+" at index : "+i);
				bool=true;
			}

		}
		if(bool==false)
		{
			System.out.println("no such element found!!");
		}
		
	}

}
