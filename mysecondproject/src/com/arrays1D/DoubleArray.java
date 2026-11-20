package com.arrays1D;

public class DoubleArray {

	public static void main(String[] args) {
		
		double[] a = new double[5];
		a[0]=10.567;
		a[1]=12.789;
		a[2]=14;
		a[3]=16;
		a[4]=18;
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println();
		for(double num:a)
		{
			System.out.print(num+"  ");
		}
	}

}
