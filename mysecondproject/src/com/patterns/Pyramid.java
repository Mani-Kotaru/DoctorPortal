package com.patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int j=0;
        for (int i = 1; i <= rows; i++) {
            for(j=rows;j>i;j--)
            {
            	System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
            	System.out.print("*");
            }
          
           System.out.println();
        }
		
		
	}

}
