package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class FindEquilibriumIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements into the array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		boolean bool=false;
		for(int i=0;i<arr.length;i++)
		{   int leftSum=0;
		    int rightSum=0;
			for(int j=0;j<i;j++)
			{
				leftSum+=arr[j];
			}
			for(int j=i+1;j<arr.length;j++)
			{
				rightSum+=arr[j];
			}
			if(leftSum==rightSum)
			{
				System.out.println("equilibrium index : "+i);
				bool=true;
			}
		}
		if(bool==false)
		{
			System.out.println("there is no equilibrium index!");
		}

	}

}
