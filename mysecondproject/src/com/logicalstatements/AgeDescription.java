package com.logicalstatements;

import java.util.Scanner;

public class AgeDescription {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		if(age==0)
		{
			System.out.println("the baby is not born yet");
		}
		else if (age > 0 && age <= 5) {
			System.out.println("kids");
		} else if (age > 5 && age <= 13) {
			System.out.println("children");
		} else if (age > 13 && age <= 19) {
			System.out.println("Teen age");
		} else if (age > 19 && age <= 35) {
			System.out.println("young people");
		} else if (age > 35 && age <= 60) {
			System.out.println("middle age people");
		} else {
			System.out.println("senior citizen or old people");
		}
	}

}
