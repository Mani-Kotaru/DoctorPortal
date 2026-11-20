package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elements of the array : ");
		System.out.println("array elements  : " + Arrays.toString(arr));
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				smin = min;
				min = arr[i];
			} else if (arr[i] < smin && arr[i] > min) {
				smin = arr[i];
			}
		}

		System.out.println("Smallest element : " + min);
		if (smin == Integer.MAX_VALUE) {
			System.out.println("Second smallest element does not exist.");
		} else {
			System.out.println("Second smallest element : " + smin);
		}
	}

}
