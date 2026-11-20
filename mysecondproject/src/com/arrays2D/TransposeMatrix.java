package com.arrays2D;

// WAP to transpose a matrix without using an another array ?
// without using another array we can transpose square matrix only,
// without using another array we can not transpose a rectangular matrix.
import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of rows : ");
		int rows = sc.nextInt();
		System.out.println("enter number of cols : ");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}