package com.arrays1D;
// WAP to find sum and average of elements of an array using for loop?
public class SumAndAvg {

	public static void main(String[] args) {
     int[] arr= {65,66,67,62,53,60};
     double sum=0;
     double avg=0;
     for(int i=0;i<arr.length;i++)
     {
    	 sum+=arr[i];
     }
     avg=sum/arr.length;
     System.out.println("sum of elements of the array is : "+sum);
     System.out.println("avg of elements of the array is : "+avg);
     System.out.printf("avg of elements of the array is :%.3f ",avg);
	}

}
