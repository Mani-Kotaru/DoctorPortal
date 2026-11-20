package com.whileloop;
// Without using any predefined methods
import java.util.Scanner;

public class BinaryToDecimal {

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
           int base=1;
		   while(n>0)
		   {
			   rem=n%10;
			   dec=dec+rem*base;
			   base=base*2;
			   n=n/10;
		   }
		  
       return dec;
	}

}
