package com.arrays1D;

import java.util.Scanner;

//WAP to find sum and average of elements of an array using for each loop?
public class SumAndAvg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		 double sum=0;
	     double avg=0;
	     for(int n:arr)
	     {
	    	 sum+=n;
	     }
	     avg=sum/arr.length;
	     System.out.println("sum of elements of the array is : "+sum);
	     System.out.println("avg of elements of the array is : "+avg);
	     System.out.printf("avg of elements of the array is :%.3f ",avg);
		}

	}


