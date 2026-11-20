package com.collections.pms;

public class ProductManagementSystem {

	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
		Product p1=new Product(101,"laptop","electronics",50000);
		Product p2=new Product(102,"Wheat Flour","grocery",50);
		Product p3=new Product(103,"dolo","medical",500);
		pm.addProduct(p1);
		pm.addProduct(p2);
		pm.addProduct(p3);
		System.out.println("*************************************************************");
		System.out.println();
		pm.displayAllProducts();
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
		pm.findProductById(103);
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
	    pm.removeProductById(101);
	    System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
		pm.displayBasedOnPriceGiven(700);
		System.out.println();
		System.out.println("*************************************************************");
		System.out.println();
		pm.displayAllProducts();
		
	}

	

}
