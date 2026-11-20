package com.javafundamentals;

public class LongLiterals {

	public static void main(String[] args) {
        //decimal
		long a1=1234;
		long a2=65432L;
		//binary
		long a3=0b101010101011111;
		long a4=0b101010101011111L;
		//octal
		long a5=01234;                         //long,int  literals are supporting decimal,binary,octal and hexadecimal literals
		long a6=01234L;
		//hexadecimal
		long a7=0x32145;
		long a8=0x32145L;
		long a9=0x3A678b;
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);
	System.out.println(a6);
	System.out.println(a7);
	System.out.println(a8);
	System.out.println(a9);
	}

}
