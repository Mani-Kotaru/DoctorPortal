package com.java_case_study;

public class OnlineShopping {
     int productId;
     String productName;
     String brand;
     double price;
     int warranty;  // in months
     String region;
     
     OnlineShopping(int productId,String productName, String brand,double price,int warranty,String region)
     {
    	 this.productId=productId;
         this.productName=productName;
         this.brand=brand;
         this.price=price;
         this.warranty=warranty;
         this.region=region;
     }
     OnlineShopping(OnlineShopping o1,String region)
     {
    	this.productId=o1.productId;
        this.productName=o1.productName;
        this.brand=o1.brand;
        this.price=o1.price;
        this.warranty=o1.warranty;
        this.region=region;
     }
     void display()
     {
    	 System.out.println("Product ID:"+productId);
    	 System.out.println("Product Name:"+productName);
    	 System.out.println("Brand:"+brand);
    	 System.out.println("Price:"+price);
    	 System.out.println("Warranty:"+warranty);
    	 System.out.println("Launched Region:"+region);
     }
     
	public static void main(String[] args) {
		
		OnlineShopping o1=new OnlineShopping(101,"Galaxy S25","Samsung",80000,12,"Banglore");
		
		OnlineShopping o2=new OnlineShopping(o1,"Hyderabad");
		System.out.println("Existing Product:");
		o1.display();
		System.out.println("******************************************");
		System.out.println("New Product:");
		o2.display();
		

	}

}
