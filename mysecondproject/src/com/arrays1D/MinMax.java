package com.arrays1D;

import java.util.Scanner;

// WAP to find min and max element of an array using for loop?
public class MinMax {

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
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int min=arr[0];
		int max=arr[0];
		for (int i = 1; i < size; i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("min element of the array is : "+min);
		System.out.println("max element of the array is : "+max);


		
	}

}
