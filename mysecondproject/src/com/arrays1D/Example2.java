package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

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
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{   
				temp=arr[i]+1;
				while(true)
				{ 
					if(isPrime(temp))
					{
						temp++;
					}
					else
					{
						arr[i]=temp;
						break;
					}
				}
		    }
			else
			{   temp=arr[i]+1;
				while(true)
				{
					if(isPrime(temp))
					{
						arr[i]=temp;
						break;
					}
					else
					{
						temp++;
					}
				}
			}
		}
		System.out.println("modified Array elements : "+Arrays.toString(arr));
	}

	private static boolean isPrime(int a) {
		if(a<2)
		{
			return false;
		}
		for(int i=2;i<a;i++)
		{
			if(a%2==0)
			   return false;
		}
		
		return true;
	}

}
