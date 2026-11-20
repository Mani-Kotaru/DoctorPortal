package com.arrays1D;
// without using extra array
import java.util.Arrays;
import java.util.Scanner;

public class MovingArrayElements {

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
		System.out.println("original array : "+Arrays.toString(arr));
		int temp=0,end=0,start=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{ 
	            temp=arr[i];
	            end=i;
	          
	            while(end>start)
	            {
	            	arr[end]=arr[end-1];
	            	end--;
	            	
	            }
	            arr[start]=temp;
	            start++;
			}
			
		}
		System.out.println("modified array : "+Arrays.toString(arr));
		
	}

}
