package com.arrays1D;

import java.util.Scanner;

import java.util.Stack;


public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		
		Stack<Integer>countStack=new Stack<>();
		
		Stack<StringBuilder>stringStack=new Stack<>();
		
		StringBuilder current=new StringBuilder();
		
		int num=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				num=num*10+(ch-'0');
				
			}
			else if(ch=='[') {
				countStack.push(num);
				
				stringStack.push(current);	
				num=0;
				current=new StringBuilder();
				}
				else if(ch==']') {
					int count=countStack.pop();
					
					StringBuilder previous=stringStack.pop();
					
					for(int j=0;j<count;j++) {
						previous.append(current);
						}
					current=previous;
				}
					else {
						current.append(ch);
					
					
				}
				
				
			}
		System.out.println(current);
			
		}
		
		

	}


