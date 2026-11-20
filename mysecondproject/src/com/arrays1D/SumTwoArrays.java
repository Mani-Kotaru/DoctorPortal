package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

// WAP to store sum of elements of two arrays of equal size into a 3rd array?
public class SumTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the arrays : ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		System.out.println("enter elements into 1st array : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter elements into 2nd array : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		sumElements(arr1,arr2);
	}

	 static void sumElements(int[] arr1, int[] arr2) {
        int[] sArray=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
        	sArray[i]=arr1[i]+arr2[i];
        }
        System.out.println("sum of elements of two arrays : ");
        System.out.println(Arrays.toString(sArray));
        
	}

}
