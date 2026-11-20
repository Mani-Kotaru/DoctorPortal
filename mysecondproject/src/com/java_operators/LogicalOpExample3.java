package com.java_operators;
//WAP to check whether a character is a lowercase alphabet using logical operators
import java.util.Scanner;

public class LogicalOpExample3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character : ");
		char ch = sc.next().charAt(0); 
		
		// we can also write sc.nextLine().charAt(0);
		// but, sc.next().charAt(0); is most commonly used because it directly read the
		// next token and avoid issues that can occur
		// when nextLine() is used immediately after methods like nextInt(),
		// nextDouble().

		String isLowerCase = (ch >= 'a' && ch <= 'z') ? "Yes" : "No";

		System.out.println(" is the given character is lowercase alphabet? : " + isLowerCase);

	}

}
