package com.javafundamentals_constructors;

public class Student2 {
	
		    int id = 101;

		    Student2 getObject() {
		        return this;   // returns current object
		    }

		    void display() {
		        System.out.println("ID = " + id);
		    }

		    public static void main(String[] args) {
		        Student2 s1 = new Student2();
		        Student2 s2 = s1.getObject();
		        s2.display();
		    }
		}
