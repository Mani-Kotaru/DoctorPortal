package com.java_case_study;

import java.util.Arrays;
import java.util.Scanner;

public class Supermarket {

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
		int end=arr.length-1;
		int temp=0;
		for(int i=end;i>=0;i--)
		{
			if(arr[i]==0)
			{
				for(int j=i;j<end;j++)
				{   
					
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				end--;
	
			}
			
		}
		System.out.println("Daily sales of the product after reorder : " + Arrays.toString(arr));
		

	}

}
