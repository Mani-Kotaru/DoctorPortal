package com.forloop;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of terms you want to print(excluding 0,1) :");
		int n = sc.nextInt();
		System.out.print("fibbonacci series : " + 0 + " " + 1+" ");
		int n1 = 0;
		int n2 = 1;

		for (int i = 1; i <= n; i++) {
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;

		}

	}

}
