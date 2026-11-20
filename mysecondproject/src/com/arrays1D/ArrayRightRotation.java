package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter elements into the array : ");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("enter number of rotations : ");
		int r=sc.nextInt();
		System.out.println("Array before rotation : "+Arrays.toString(arr));
		rotate(arr,r);
		System.out.println("Array after right rotation : "+Arrays.toString(arr));
	}

	 static void rotate(int[] arr,int r) {
		int start=0;
		int end=arr.length-1;

		  r=r%arr.length;
		
		 reverse(arr,start,end);
		 reverse(arr,start,r-1);
		 reverse(arr,r,end);
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
