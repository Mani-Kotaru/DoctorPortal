package com.arrays1D;

import java.util.Scanner;

// WAP to print number of times the given digit appear in the array elements?
public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter a digit : ");
		int digit = sc.nextInt();
		int count = countOfDigits(arr, digit);
		System.out.println("number of times " + digit + " appear in the array : " + count);

	}

	static int countOfDigits(int[] arr, int digit) {
		int count = 0;
		int temp = 0;
		int rem = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			while (temp > 0) {
				rem = temp % 10;
				if (rem == digit) {
					count++;
				}
				temp = temp / 10;

			}

		}
		return count;
	}

}
