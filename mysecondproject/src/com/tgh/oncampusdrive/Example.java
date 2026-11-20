package com.tgh.oncampusdrive;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				int count=str.charAt(i)-'0';
				i++;
				i++;
				StringBuilder temp=new StringBuilder();
				while(str.charAt(i)!=']') {
					temp.append(str.charAt(i));
					i++;
				}
				
				for(int j=0;j<count;j++) {
					result.append(temp);
				}
				
				
			}
			
		}
		System.out.println(result);

	}

}
