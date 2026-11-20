package com.arrays1D;

public class StringArray {

	public static void main(String[] args) {
       
		String[] a = new String[5];
		a[0]="raghu";
		a[1]="mani";
		a[2]="madhavi";
		a[3]="srinu";
		a[4]="kotaru";
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(String num:a)
		{
			System.out.print(num+" ");
		}
	}

}
