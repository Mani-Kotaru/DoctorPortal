package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the 1st array : ");
		int size1 = sc.nextInt();
		System.out.println("enter size of the 2nd array : ");
		int size2 = sc.nextInt();
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		int[] merge=new int[size1+size2];
		System.out.println("enter elements into 1st array : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter elements into 2nd array : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("1st array elements : "+Arrays.toString(arr1));
		System.out.println("2nd array elements : "+Arrays.toString(arr2));
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j])
			{
				merge[k++]=arr1[i++];
			}
			else
			{
				merge[k++]=arr2[j++];
			}
		}
		while(i<arr1.length)
		{
			merge[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			merge[k++]=arr2[j++];
		}
		System.out.println("merged array elements : "+Arrays.toString(merge));

	}

}
