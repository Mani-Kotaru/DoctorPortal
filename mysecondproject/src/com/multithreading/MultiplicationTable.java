package com.multithreading;

import java.util.Scanner;

public class MultiplicationTable extends Thread {
	@Override
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value : ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		 MultiplicationTable  mt=new  MultiplicationTable();
		 mt.start();
		 System.out.println("main method ended");
		 
	}

}
