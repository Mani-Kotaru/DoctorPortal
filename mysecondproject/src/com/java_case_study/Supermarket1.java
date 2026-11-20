package com.java_case_study;

import java.util.Arrays;
import java.util.Scanner;

public class Supermarket1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of days : ");
		int days = sc.nextInt();
		int[] arr = new int[days];
		System.out.println("enter the sales of the product for the last " + days + " days: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Daily sales of the product before reorder : " + Arrays.toString(arr));
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		}
		for(int i=index;i<arr.length;i++)
		{
			arr[i]=0;
		}
		System.out.println("Daily sales of the product after reorder : " + Arrays.toString(arr));

		
	}

}
