package com.inheritance.java_case_study;

public class Pizza extends FoodItem {

	Pizza(String item,int quant,double price)
	{
		super(item,quant,price);
	}
	
	@Override
	double calculateFinalPrice()
	{   double toppingCharges=100;
	    System.out.println("topping charges : "+toppingCharges);
		double finalPrice= (price*quant)+toppingCharges;
		return finalPrice;
		
	}

}
