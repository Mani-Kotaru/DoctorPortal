package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("array elements before sorting : " + Arrays.toString(arr));
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>key)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=key;
		}
		
		System.out.println("array elements after sorting : " + Arrays.toString(arr));
	}

}
