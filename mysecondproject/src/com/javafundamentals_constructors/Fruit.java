package com.javafundamentals_constructors;

public class Fruit {

	String fruitName;
	String color;
	double price;

	Fruit() {
		System.out.println("no arg constructor called!");
	}

	Fruit(String fruitName) {
		this.fruitName = fruitName;
	}

	Fruit(Fruit f, String color) {

		this.fruitName = f.fruitName;
		this.color = color;
	}

	Fruit(Fruit f, double price) {
		this.fruitName = f.fruitName;
		this.color = f.color;
		this.price = price;
	}

	public static void main(String[] args) {

		Fruit f1 = new Fruit();
		f1.display();
		Fruit f2 = new Fruit("mango");
		f2.display();
		Fruit f3 = new Fruit(f2, "Yellow");
		f3.display();
		Fruit f4 = new Fruit(f3, 50.80);
		f4.display();
	}

	void display() {
		System.out.println("Name of the fruit:" + fruitName);
		System.out.println("Color of the fruit:" + color);
		System.out.println("Price of the fruit:" + price);
		System.out.println("*****************************************");
	}

}
