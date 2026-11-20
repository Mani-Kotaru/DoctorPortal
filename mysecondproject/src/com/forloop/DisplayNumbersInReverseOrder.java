package com.forloop;
import java.util.Scanner;
public class DisplayNumbersInReverseOrder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		for(int i=num;i>0;i--)
		{
			System.out.print(i+" ");
			
		}
		

	}

}
