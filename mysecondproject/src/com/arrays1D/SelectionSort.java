package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

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

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}

			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}
		System.out.println("array elements after sorting : " + Arrays.toString(arr));

	}
}
