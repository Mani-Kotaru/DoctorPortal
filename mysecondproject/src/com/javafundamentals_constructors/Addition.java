package com.javafundamentals_constructors;
import java.math.*;
public class Addition {
//	byte b1,b2;
//	short s1,s2;
//	int i1,i2;
//	long l1,l2;
//	float f1,f2;
//	double d1,d2;
//	char c1,c2;
//	String str1,str2;
//	BigInteger bi1,bi2;
//	BigDecimal bd1,bd2;
	
//	Addition()
//	{
//		System.out.println("No arg constructor called!");
//	}
	Addition(byte b1,byte b2)
	{
		System.out.println("Byte Addition:"+(b1+b2));
	}
	Addition(short s1,short s2)
	{
		System.out.println("Short Addition:"+(s1+s2));
	}
	Addition(int i1,int i2)
	{
		System.out.println("integer Addition:"+(i1+i2));
	}
	Addition(long l1,long l2)
	{
		System.out.println("Long Addition:"+(l1+l2));
	}
	Addition(float f1,float f2)
	{
		System.out.println("Float Addition:"+(f1+f2));
	}
	Addition(double d1,double d2)
	{
		System.out.println("Double Addition:"+(d1+d2));
	}
	Addition(char c1,char c2)
	{
		System.out.println("Character Addition:"+(c1+c2));
	}
	Addition(String s1,String s2)
	{
		System.out.println("String Addition:"+(s1+s2));
	}
	
	Addition(BigInteger bi1,BigInteger bi2)
	{
		System.out.println("Big Integer Addition:"+(bi1.add(bi2)));
	}
	Addition(BigDecimal bd1,BigDecimal bd2)
	{
		System.out.println("Big Decimal Addition:"+(bd1.add(bd2)));
	}
	
	public static void main(String[] args) {
//		Addition a=new Addition();
//		a.display();
		
		Addition a1=new Addition((byte)10,(byte)20);
		Addition a2=new Addition((short)5,(short)20);
		Addition a3=new Addition(100,150);
		Addition a4=new Addition(1000L,1209L);
		Addition a5=new Addition(5.89f,8.95f);
		Addition a6=new Addition(567.980,590.568);
		Addition a7=new Addition('F','M');
		Addition a8=new Addition("Mani is ","good girl");
		BigInteger bi1=new BigInteger("128726454792087654627890");
		BigInteger bi2=new BigInteger("128726454792087654627890");
		Addition a9=new Addition(bi1,bi2);
		BigDecimal bd1=new BigDecimal("1287264547920.87654627890");
		BigDecimal bd2=new BigDecimal("1287264547920.87654627890");
		Addition a10=new Addition(bd1,bd2);
		

	}
	void display()
	{
		System.out.println("default values of byte variables b1,b2:"+b1+", "+b2);
		System.out.println("default values of short variables s1,s2:"+s1+" ,"+s2);
		System.out.println("default values of int variables i1,i2:"+i1+" ,"+i2);
		System.out.println("default values of long variables l1,l2:"+l1+" ,"+l2);
		System.out.println("default values of float variables f1,f2:"+f1+" ,"+f2);
		System.out.println("default values of double variables d1,d2:"+d1+" ,"+d2);
		System.out.println("default values of char variables c1,c2:"+c1+" ,"+c2);
		System.out.println("default values of String variables s1,s2:"+s1+" ,"+s2);
		System.out.println("default values of Big Integer variables bi1,bi2:"+bi1+" ,"+bi2);
		System.out.println("default values of Big Decimal variables bd1,bd2:"+bd1+" ,"+bd2);
		System.out.println("----------------------------------------------------------------------");
	}
	

}
