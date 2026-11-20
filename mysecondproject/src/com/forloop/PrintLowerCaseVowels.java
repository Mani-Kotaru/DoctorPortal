package com.forloop;

public class PrintLowerCaseVowels {

	public static void main(String[] args) {
		for(char ch='a';ch<='z';ch++)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.print(ch+" ");
		}
	}

}
