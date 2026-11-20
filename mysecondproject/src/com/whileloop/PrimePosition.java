package com.whileloop;

// WAP to print prime numbers at prime position?
import java.util.Scanner;

public class PrimePosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		printPrimeNum(n);
	}

	static void printPrimeNum(int n) {
		int count = 0;
		int pCount = 0;

		if (n == 0 || n == 1) {
			System.out.println("there is no prime number in this range!");
		}
		for (int i = 2; i <= n; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;

				}
			}
			if (count == 0) {
				pCount++;
				if (isPrime(pCount)) {
					System.out.print(i + " ");
				}
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
				break;
			}
		}

		return status;
	}

}
