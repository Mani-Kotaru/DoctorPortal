package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotation1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements into the array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("elements of the array before right rotation :"+Arrays.toString(arr));
		System.out.println("enter number of positions : ");
		int k=sc.nextInt();
		rotateArr(arr,k);
		System.out.println("elements of the array after right rotation :"+Arrays.toString(arr));

	}

	 static void rotateArr(int[] arr, int k) {
		if(k>arr.length)
		{
			k=k%arr.length;
		}
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
	}

	  static void reverse(int[] arr, int start, int end) {
		 while(start<end)
		 {
			 int temp=arr[end];
			 arr[end]=arr[start];
			 arr[start]=temp;
			 start++;
			 end--;
		 }
		
	 }

}
