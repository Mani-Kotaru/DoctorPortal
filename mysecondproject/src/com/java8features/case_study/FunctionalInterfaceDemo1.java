package com.java8features.case_study;

import java.util.Arrays;
import java.util.List;

class Product{
	String name;
	double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}

interface Discount{
	double calculateDiscount(double price);
}

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		
		List<Product> list=Arrays.asList(new Product("laptop",50000),
				                         new Product("Grinder",7000),
				                         new Product("Juicer",6000),
				                         new Product("Cooler",12000),
				                         new Product("Microwave Oven",60000)
				                           
				                            );
		
		Discount dis=(price)->price-(0.1*price);
		                       
		                       
		for(Product p:list)
		{
			double discountedPrice=dis.calculateDiscount(p.price);
			System.out.println("Product Name : "+p.name);
			System.out.println("Original Price : "+p.price);
			System.out.println("Discount Amount : "+(p.price-discountedPrice));
			System.out.println("Discounted Price : "+discountedPrice);
			System.out.println("****************************************");
		}
	}
}
