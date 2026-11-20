package com.tgh.oncampusdrive;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{  
				for(int j=1;j<=i;j++)
				{
					if(!isPrime(k))
					{
						System.out.print(k+" ");
					}
					System.out.println();
					k++;
				}
				
			}
			else
			{
				
			}
		}
	}

}
