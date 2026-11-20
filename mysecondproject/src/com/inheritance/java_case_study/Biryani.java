package com.inheritance.java_case_study;

public class Biryani extends FoodItem{
	
	Biryani(String item,int quant,double price)
	{
		super(item,quant,price);
	}
	
	@Override
	double calculateFinalPrice()
	{   double gst=75;
	    System.out.println("GST : "+gst);
		double finalPrice= (price*quant)+gst;
		return finalPrice;
		
	}
}
