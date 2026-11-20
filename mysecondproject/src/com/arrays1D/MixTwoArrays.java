package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;


//WAP to mix elements of two arrays(of equal size) into 3rd array?
public class MixTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of the arrays : ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		System.out.println("enter elements into 1st array : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter elements into 2nd array : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		mixElements(arr1,arr2);
	}

	 static void mixElements(int[] arr1, int[] arr2) {
        System.out.println("elements of the mixed array : ");
        int[] mArray=new int[arr1.length+arr2.length];
        int i=0;
        for(int num:arr1)
        {
        	mArray[i]=num;
        	i++;
        }
        for(int num:arr2)
        {
        	mArray[i]=num;
        	i++;
        }
        System.out.println(Arrays.toString(mArray));
        
	}
	

}
