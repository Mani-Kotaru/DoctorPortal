package com.whileloop;

import java.util.Scanner;

//With using  predefined method Math.pow();
public class BinaryToDecimal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a binary number : ");
		int n=sc.nextInt();
		int dec=decimalNum(n);
		System.out.println("Decimal number of binary number "+n+" is :"+dec);
	}
	static int decimalNum(int n) {
        int dec=0;
        int rem=0;
        int x=0;
		   while(n>0)
		   {
			   rem=n%10;
			   dec= (int)(dec+rem*Math.pow(2,x));
			    x++;
			   n=n/10;
		   }
		  
    return dec;
	}


}
