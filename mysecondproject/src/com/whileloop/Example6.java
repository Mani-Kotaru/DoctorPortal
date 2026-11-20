package com.whileloop;

import java.util.Arrays;
import java.util.Scanner;

public class Example6 {

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
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			boolean left=true;
			boolean right=true;
			for(int j=0;j<i;j++)
			{
				if(arr[j]>=arr[i])
				{
					left=false;
					break;
				}
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<=arr[i])
				{
					right=false;
					break;
				}
			}
			if(left && right)
			{
				System.out.println("required elemnet is : "+arr[i]+" at index : "+i);
				status=true;
			}
		}
		if(status==false)
		{
			System.out.println("no such element found!!");
		}
	}

}
