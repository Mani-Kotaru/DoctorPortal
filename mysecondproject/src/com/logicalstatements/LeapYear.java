package com.logicalstatements;
import java.util.*;
//WAP to check whether a  year is leap year or not
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year:");
		int year=sc.nextInt();
		if(year%400==0)
		{
			System.out.println("it is a leap year");
		}
		else if(year%100!=0 && year%4==0)
		{
			System.out.println("it is a leap year");
		}
		
		else
		{
			System.out.println("it is not a leap year");
		}

	}

}
