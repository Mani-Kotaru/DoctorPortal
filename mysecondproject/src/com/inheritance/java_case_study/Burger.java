package com.inheritance.java_case_study;

public class Burger extends FoodItem {
  
	Burger(String item,int quant,double price)
	{
		super(item,quant,price);
	}
	
	@Override
	double calculateFinalPrice()
	{   double packagingCharges=50;
	   System.out.println("Packaging Charges : "+packagingCharges);
		double finalPrice= (price*quant)+packagingCharges;
		return finalPrice;
		
	}
}
