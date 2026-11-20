package com.javafundamentals;

public class FactoryMethod1 {
	 
	int id;
	String name;
	FactoryMethod1 setValues()
	{
		FactoryMethod1 f1=new FactoryMethod1();
		f1.id=101;
		f1.name="mani";
		return f1;
	}

	public static void main(String[] args) {
		
		FactoryMethod1 f=new FactoryMethod1();
		
		FactoryMethod1 f2=f.setValues();
		System.out.println("id number:"+f2.id);
		System.out.println("name:"+f2.name);

	}

}
