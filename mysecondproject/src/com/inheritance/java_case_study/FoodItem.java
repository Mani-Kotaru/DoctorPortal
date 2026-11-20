package com.inheritance.java_case_study;

public class FoodItem {
	
	String item;
	int quant;
	double price;
	
	FoodItem(String item,int quant,double price)
	{
		this.item=item;
		this.quant=quant;
		this.price=price;
	}
	 
	double calculateFinalPrice()
	{   
		double finalPrice=0;
		return finalPrice;
	}
	
	void display()
	{
		System.out.println("selected food item :"+item);
		System.out.println("quantity : "+quant);
		System.out.println("price per one item : "+price);
		System.out.println("Final Bill Amount : "+calculateFinalPrice());
	}

}
