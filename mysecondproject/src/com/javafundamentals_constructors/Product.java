package com.javafundamentals_constructors;

public class Product {
	    
	int productId;
	String productName;
	double cost;
	Product()
	{   this(101);
	    System.out.println("no-arg constructor called!");
	}
	Product(int productId)
	{
		this(productId,"Laptop");
		System.out.println("1-arg constructor called!");
		
	}
	Product(int productId,String productName)
	{    this( productId,productName,50000);
		System.out.println("2-arg constructor called!");
	}
	Product(int productId,String productName,double cost)
	{
		this.productId=productId;
		this.productName=productName;
		this.cost=cost;
		System.out.println("3-arg constructor called!");
	}
	

	public static void main(String[] args) {
		Product p1=new Product();
		p1.display();
		Product p2=new Product(102);
		p2.display();
		Product p3=new Product(103,"Mobile");
		p3.display();
		Product p4=new Product(103,"Mobile",70000);
     	p4.display();
		

	}
	void display()
	{
		System.out.println("product id:"+productId);
		System.out.println("product name:"+productName);
		System.out.println("cost:"+cost);
		System.out.println("***************************************************");
	}

}
