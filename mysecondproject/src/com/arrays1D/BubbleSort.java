package com.arrays1D;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("enter size of the array : ");
    int size=sc.nextInt();
	int[] arr= new int[size];
	System.out.println("enter elements into the array :");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	 System.out.println("array elements before sorting : "+Arrays.toString(arr));
    for(int i=0;i<arr.length-1;i++)
    {   boolean swapped=false;
    	for(int j=0;j<arr.length-i-1;j++)
    	{
    		if(arr[j]>arr[j+1])
    		{
    			int temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    			swapped=true;
    		}
    		
    	}
    	if(!swapped)
    	{
    		break;
    	}
    	
    }
   
    System.out.println("array elements after sorting : "+Arrays.toString(arr));
	}

}
