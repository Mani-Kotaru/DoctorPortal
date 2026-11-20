package com.arrays1D;
// using extra array
import java.util.Arrays;
import java.util.Scanner;

public class MovingArrayElements1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int[] arr1=new int[size];
		
		System.out.println("enter elements into the array : ");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("original array : "+Arrays.toString(arr));
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		System.out.println("modified array : "+Arrays.toString(arr1));
	}

}
