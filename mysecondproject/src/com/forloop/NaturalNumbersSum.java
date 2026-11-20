package com.forloop;

import java.util.Scanner;

public class NaturalNumbersSum {

	int findSum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		return sum;
	}

	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter N value:");
		int n = sc.nextInt();

		int sum = findSum(n);
		System.out.println("sum of first N natural numbers : " + sum);
         sc.close();
	}

}
