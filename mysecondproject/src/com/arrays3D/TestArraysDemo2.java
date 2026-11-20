package com.arrays3D;

public class TestArraysDemo2 {

	public static void main(String[] args) {
		 int[][][] arr= {
 		        {{1,2},{3,4,9}},
 		        {{5,6,5},{7,8,9}},
 		        {{9,10,0},{11,12}}
 		        
                };
 for(int[][] arr2:arr)
 {
 	for(int[] arr1:arr2)
 	{
 		for(int a:arr1)
 		{
 			System.out.print(a+" ");
 		}
 		System.out.println();
 	}
 	System.out.println();
 }

	}

}
