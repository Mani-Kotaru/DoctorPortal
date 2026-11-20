package com.arrays1D;

public class TestArray {
     int[] arr= {10,20,30,40,50};//creating array outside main method
	public static void main(String[] args) {
      TestArray t1=new TestArray();
      System.out.println("elements of the array are : ");
      for(int i=0;i<t1.arr.length;i++)
      {
    	  System.out.print(t1.arr[i]+" ");
      }
      
	}

}
