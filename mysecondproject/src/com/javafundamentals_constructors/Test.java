package com.javafundamentals_constructors;

public class Test {

	void display(Test t) {
		System.out.println("Object recieved!!");
	}

	void show() {
		display(this); // passing current object
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.show();
	}
}
