package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class Leader {

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
		System.out.println("array elements  : " + Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{     boolean status=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					status=false;
					break;
				}
			}
			if(status)
			{
				System.out.println(arr[i]);
			}
			else
			{
				System.out.println("-1");
			}
			
		}
		System.out.println(arr[arr.length-1]);
	}

}
