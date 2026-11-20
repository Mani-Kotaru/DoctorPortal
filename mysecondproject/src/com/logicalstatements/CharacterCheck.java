package com.logicalstatements;
import java.util.*;
public class CharacterCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character:");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("upper case character");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("lower case character");
		}
		else if(ch>='0' && ch<='9') 
		{
			System.out.println("digit");
		}
		else
		{
			System.out.println("special character");
		}
		

	}

}
