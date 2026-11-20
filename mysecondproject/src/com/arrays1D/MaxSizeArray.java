package com.arrays1D;

public class MaxSizeArray {

	public static void main(String[] args) {
     int[] arr=new int[2147483647];
     // Here:
     // 2147483647 = Number of elements in the array (array length)
     // It is not the memory size.
     // Not bytes.
     // Not bits.
     // Memory occupied depends on the data type
    
     //For example, if you could create an int array with 2,147,483,647 elements, the memory required would be approximately:
     //  2,147,483,647 × 4 bytes
     //  ≈ 8,589,934,588 bytes
     //≈ 8 GB
    // (Actually a little more than 8 GB because the array object itself also has some overhead.)
	}

}
