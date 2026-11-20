package com.whileloop;

import java.util.Scanner;

// WAP to check the given number is Armstrong number or not without using any predefined methods?
public class ArmstrongNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if (status) {
			System.out.println("the given number is armstrong number!");
		} else {
			System.out.println("the given number is not an armstrong number!");
		}

	}

	static boolean isArmstrong(int n) {
		boolean status = false;
		int temp = n;
		int n1 = n;
		int count = 0;
		int sumPow = 0;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		while (n1 > 0) {
			int rem = n1 % 10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*rem;
			}
			sumPow=sumPow+pow;
			n1=n1/10;
		}
		if (sumPow == n) {
			status = true;
		}

		return status;
	}

}
