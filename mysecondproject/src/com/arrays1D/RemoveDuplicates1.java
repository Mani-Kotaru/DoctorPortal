package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // arr={1,2,3,1,2,4}

		System.out.println("enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter elements into the array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before removing duplicates : " + Arrays.toString(arr));
		removeDup(arr);

	}

	    static void removeDup(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{   boolean isDuplicate=false;
			for(int j=0;j<i;j++)
			{   
				if(arr[i]==arr[j])
				{
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
