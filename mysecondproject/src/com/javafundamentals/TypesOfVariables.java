package com.javafundamentals;

public class TypesOfVariables {
	int a;
	static int b;
      
	public static  void main(String[] args) {
		 int c;
		 TypesOfVariables t= new TypesOfVariables();
       System.out.println(t.a);
       System.out.println(b);
       System.out.println(t.b);
       System.out.println(TypesOfVariables.b);
    //   System.out.println(c);
       t.a=10;
       b=12;
       c=6;
       System.out.println(t.a);
       System.out.println(b);
       System.out.println(t.b);
       System.out.println(TypesOfVariables.b);
       System.out.println(c);
       t.display();
       
    }
	void display()
	{
		//System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		//System.out.println(t.a);
	}
} 
