package com.arrays1D;

import java.util.Scanner;

public class PrimeNumbersOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int temp=0,count=0;
		System.out.print("prime numbers of the array are : ");
		for (int i = 0; i < size; i++) {
			temp=arr[i];
			if(temp<2)
			{
				continue;
			}
			count=0;
			for(int j=2;j<=temp/2;j++)
			{
				if(temp%j==0)
				   count++;
			}
			if(count==0)
			{
				System.out.print(temp+" ");
			}
		}
	}

}
