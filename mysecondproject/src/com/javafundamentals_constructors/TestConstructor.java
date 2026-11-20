package com.javafundamentals_constructors;

public class TestConstructor {
	static int id;
	 static  String name;
	 
	 TestConstructor(int id,String name)
	 {                                         //this is the correct way to access static data members
		                                       // TestConstructor.id=id;
		   this.id=id;
		   this.name=name;                     // TestConstructor.name=name;
	 }

	public static void main(String[] args) {
 
		TestConstructor t=new TestConstructor(1,"mani");
		TestConstructor t1=new TestConstructor(2,"Raghu");
		t.display();
		t1.display();
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);

	}

}
