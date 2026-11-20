package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter elements into the array : ");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("elements in the array before reverse : "+Arrays.toString(arr));
		reverse(arr);
		System.out.println("elements in the array after reverse  : "+Arrays.toString(arr));
	}

	 static void reverse(int[] arr) {
		 int start=0,end=arr.length-1;
     while(start<end)
     {
    	
    	 int temp=arr[end];
    	 arr[end]=arr[start];
    	 arr[start]=temp;
    	 start++;
    	 end--;
     }
	}

}
