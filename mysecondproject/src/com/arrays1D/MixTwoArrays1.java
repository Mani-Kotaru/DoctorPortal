package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class MixTwoArrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the 1st array : ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("enter size of the 2nd array : ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("enter elements into 1st array : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter elements into 2nd array : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		mixElements(arr1, arr2);
	}

	static void mixElements(int[] arr1, int[] arr2) {

		int[] mArray = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			mArray[i] = arr1[i];
		}
        
		for (int i = 0; i < arr2.length; i++) {
			mArray[arr1.length+i] = arr2[i];
			

		}
		System.out.println("elements of the mixed array : ");
		System.out.println(Arrays.toString(mArray));

	}

}
