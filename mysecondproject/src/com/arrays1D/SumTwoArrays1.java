package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class SumTwoArrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the 1st array : ");
		int size1 = sc.nextInt();
		System.out.println("enter size of the 2nd array : ");
		int size2 = sc.nextInt();
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		System.out.println("enter elements into 1st array : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter elements into 2nd array : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		sumElements(arr1, arr2);
	}

	static void sumElements(int[] arr1, int[] arr2) {
		
		int[] maxArr=null;
		int[] minArr=null;
		if(arr1.length>arr2.length)
		{
			maxArr=arr1;
			minArr=arr2;
		}
		else if(arr1.length<arr2.length)
		{
			maxArr=arr2;
			minArr=arr1;
		}
		int[] sArray=new int[maxArr.length];
		for(int i=0;i<maxArr.length;i++)
		{
			if(i<minArr.length) {
				sArray[i]=maxArr[i]+minArr[i];
			}
			else
			{
				sArray[i]=maxArr[i];
			}
		}
		System.out.println("sum of elements of the two arrays : ");
		System.out.println(Arrays.toString(sArray));

	}
}
