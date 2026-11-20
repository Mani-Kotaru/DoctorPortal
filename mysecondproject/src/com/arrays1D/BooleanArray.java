package com.arrays1D;

public class BooleanArray {

	public static void main(String[] args) {
		boolean[] a = new boolean[5];
		a[0]=true;
		a[1]=true;
		a[2]=false;
		a[3]=true;
		a[4]=false;
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(boolean num:a)
		{
			System.out.print(num+" ");
		}
	}

}
