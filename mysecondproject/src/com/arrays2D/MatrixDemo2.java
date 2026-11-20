package com.arrays2D;

// WAP to find sum of elements of two diagonals of a  Square matrix(common element should be consider only once)?
import java.util.Scanner;

public class MatrixDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of square matrix : ");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
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
		int diagSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
					diagSum += arr[i][j];
				} else if (i + j == arr[0].length - 1 && i != j) {
					diagSum += arr[i][j];
				}
			}
		}

		System.out.println("sum of diagonal elements : " + diagSum);

	}

}
