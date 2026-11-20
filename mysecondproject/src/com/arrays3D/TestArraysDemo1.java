package com.arrays3D;

public class TestArraysDemo1 {

	public static void main(String[] args) {
    int[][][] arr= {
    		        {{1,2},{3,4}},
    		        {{5,6},{7,8}},
    		        {{9,10},{11,12}}
    		        
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
