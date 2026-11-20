package com.javafundamentals;

public class DoubleLiterals {

	public static void main(String[] args) {
		//decimal
       double d1=234.894;
       double d2=234.894d;
       //binary
     //  double d3=0b10111.1010;
    //   double d4=0b10111.1010d;
       double d5=0b1011011;
     //  double d6=0b1011011d;                 double,float literals are not supporting binary,hexadecimal,and octal literal 
       //octal                                        //only supporting decimal literals
       double d7=01233.567;
       double d8=01233.567d;
       //hexadecimal
      // double d9=0x12456.678;
    //  double d10=0x12456.678d;
       double d11=0x12345;
       System.out.println(d1);
       System.out.println(d2);
       System.out.println(d5);
       System.out.println(d7);
       System.out.println(d8);
       System.out.println(d11);
       
	}

}
