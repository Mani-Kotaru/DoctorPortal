package com.whileloop;
// input : 1000
// output : 0001
import java.util.Scanner;

public class ReverseNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		//String rev=reverseOfNum(n);
		//System.out.println("reverse of given number : "+rev);

	}
	 static String reverseOfNum(int n) {
	        String rev=" ";
	        int rem=0;
	        while(n>0)
	        {
	        	rem=n%10;
	        	rev=rev+rem;
	        	n=n/10;
	        }
			
			return rev;
		}
}
