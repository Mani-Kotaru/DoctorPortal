package com.arrays1D;

public class ByteArray {

	public static void main(String[] args) {
     
		byte[] a = new byte[5];
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
		for(byte num:a)
		{
			System.out.print(num+" ");
		}
	}

}
