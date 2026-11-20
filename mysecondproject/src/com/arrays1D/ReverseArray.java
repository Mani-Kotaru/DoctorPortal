package com.arrays1D;

import java.util.Scanner;

// WAP to print elements of an array in reverse order?
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elements of the array in actual order : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("elements of the array in reverse order : ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		// NOTE : No, it is not possible to print an array in reverse order using only a for-each loop,
		// because the for-each loop always traverses the array from the first element to the last and does not provide index access.
		// To print in reverse order, use a regular for loop.

	}

}
