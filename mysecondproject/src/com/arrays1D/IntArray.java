package com.arrays1D;

public class IntArray {

	public static void main(String[] args) {

//		int[] a;//declaration
//		a=new int[5];// creation
//		a[0]=15; // initialization
//		a[1]=10;
//		a[2]=20;

		int[] a = new int[5];
		a[0]=10;
		a[1]=12;
		a[2]=14;
		a[3]=16;
		a[4]=18;
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int num:a)
		{
			System.out.print(num+" ");
		}

	}

}
