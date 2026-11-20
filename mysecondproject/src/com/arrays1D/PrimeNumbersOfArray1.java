package com.arrays1D;

import java.util.Scanner;

public class PrimeNumbersOfArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		printPrimeNumbers(arr);

	}

	static void printPrimeNumbers(int[] arr) {

		int temp;
		System.out.print("prime numbers of the array : ");
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];
			if (isPrime(temp)) {
				System.out.print(temp + " ");
			}
		}
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
