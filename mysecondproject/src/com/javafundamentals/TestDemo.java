package com.javafundamentals;

public class TestDemo {
	
	int sid;
	String sname;
	void setDetails(int id,String name)
	{
		sid=id;
		sname=name;
	}
	void display()
	{
		System.out.println("student id:"+sid);
		System.out.println("student name:"+sname);
	}

	public static void main(String[] args) {
		TestDemo t=new TestDemo();
		t.setDetails(1, "mani");
		t.setDetails(2, "raghu");
		t.display();

	}

}
