package com.arrays1D;

public class ShortArray {

	public static void main(String[] args) {
		short[] a = new short[5];
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
		for(short num:a)
		{
			System.out.print(num+" ");
		}

	}

}
