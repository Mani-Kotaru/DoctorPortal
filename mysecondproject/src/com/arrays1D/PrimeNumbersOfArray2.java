package com.arrays1D;

import java.util.Arrays;

import java.util.Scanner;

public class PrimeNumbersOfArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int[] pArray = findPrimeNum(arr);
		System.out.print("prime numbers of the array : ");
		System.out.println(Arrays.toString(pArray));
	}

	static int[] findPrimeNum(int[] arr) {
		int count = 0, temp = 0;
		for (int i : arr) {
			if (isPrime(i))
				count++;
		}
		int arr1[] = new int[count];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			if (isPrime(temp)) {
				arr1[k] = temp;
				k++;
			}
		}
		return arr1;
	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
			}
		}
		return status;
	}

}
