package com.arrays1D;

public class MaxSumSubArray {

	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum=0;
		int maxSumStart=0;
		int maxSumEnd=0;
		
		for(int i=0;i<arr.length;i++)
		{   
			for(int j=i;j<arr.length;j++)
			{  int sum=0;
				 for(int k=i;k<=j;k++)
				 {
					 sum=sum+arr[k];
				 }
				 if(sum>maxSum)
				 {
					 maxSum=sum;
					 maxSumStart=i;
					 maxSumEnd=j;
				 }
				 
			}
		}
		System.out.println("maximum sum sub array : ");
		for(int i=maxSumStart;i<=maxSumEnd;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("maximum sum : "+maxSum);

	}

}
