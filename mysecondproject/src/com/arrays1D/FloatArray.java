package com.arrays1D;

public class FloatArray {

	public static void main(String[] args) {
		float[] a = new float[5];
		a[0] = 10.5f;
		a[1] = 12.4f;
		a[2] = 14;
		a[3] = 16;
		a[4] = 18;
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (float num : a) {
			System.out.print(num + " ");
		}

	}
}
