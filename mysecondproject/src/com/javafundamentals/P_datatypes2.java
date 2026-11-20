package com.javafundamentals;

public class P_datatypes2 {

	public static void main(String[] args) {
       
		char c1='A';
		char c2=1; //the symbol corresponding to ascii code  will be displayed
		char c3='\u0021';//unicode is first converted into ascii code then the symbol corresponding to ascii code will be displayed
		
		int i1=5;
		int i2='9';//the ascii code  corresponding to symbol  will be displayed
		int i3='\u0021';//unicode  is converted into ascii code and it will be displayed 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(i1);
		System.out.println(i2); 
		System.out.println(i3);
		
	      
	}

}
