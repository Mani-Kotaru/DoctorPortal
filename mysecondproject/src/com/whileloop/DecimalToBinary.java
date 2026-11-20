package com.whileloop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a decimal number : ");
		int n=sc.nextInt();
		String bin=binaryNum(n);
		System.out.println("Binary number of decimal number "+n+" is : "+bin);
	}

       static String binaryNum(int n) {
		String bin="";
		int rem=0;
		while(n>0)
		{
			rem=n%2;
			bin=rem+bin;
			n=n/2;
		}
		
		return bin;
	}

}
