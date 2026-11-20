package com.patterns;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int j=0;
        
        for(int i=1;i<=rows;i++)
        {
        	for(j=1;j<i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=2*(rows-i)+1;k>=1;k--)
        	{
        		System.out.print("*");
        		
        	}
        	
        	System.out.println();
        }
	}

}
