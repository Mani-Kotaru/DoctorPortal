package com.collections.pms;

import java.util.ArrayList;

import java.util.List;

public class ProductManager {
	
	static List<Product> prod=new ArrayList<>();

	void addProduct(Product p){
		 prod.add(p);
		 System.out.println("product added successfully!!");
	}
	void displayAllProducts()
	{
		if(prod.isEmpty())
		{
			System.out.println("No products available!");
			return;
		}
		for(Product product:prod)
		{
			System.out.println(product);
		}
	}
	void findProductById(int id)
	{    
		for(Product product:prod)
		{  
			if(product.getProductId()==id)
			{
				System.out.println(product);
				System.out.println("product found!!");
				return;
			}
		}
			
			System.out.println("product not found!!");
	}
	void removeProductById(int id)
	{   
		for(int i=0;i<prod.size();i++)
		{  
			if(prod.get(i).getProductId()==id)
			{ 
				prod.remove(i);
				System.out.println("product removed successfuly!!");
				return;
			    
			}
		}

			System.out.println("product not removed!!");
	}
	void displayBasedOnPriceGiven(double givenPrice)
	{  boolean status=false;
		for(Product product:prod)
		{  
			if(product.getPrice()>givenPrice)
			{
				System.out.println(product);
			status=true;
			}
		}
		if(status)
		{
			System.out.println("product found!!");
		}
		else
		{
			System.out.println("product not found!!");
		}
		
	}
	
	

}
