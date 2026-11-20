package com.java_case_study;

public class Online {
     
	 int productId;
     String productName;
     String brand;
     double price;
     int warranty;  // in months
     String region;
     Online()
     {
    	 
     }
     Online(int productId,String productName, String brand,double price,int warranty,String region)
     {    
    	 this(productId,productName,brand,price,warranty);
    	 this.productId=productId;
         this.productName=productName;
         this.brand=brand;
         this.price=price;
         this.warranty=warranty;
         this.region=region;
     }
     
     Online(int productId,String productName, String brand,double price,int warranty)
     {
    	 this.productId=productId;
         this.productName=productName;
         this.brand=brand;
         this.price=price;
         this.warranty=warranty;
         this.region="Hyderabad";
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
      
		Online o1=new Online(101,"Galaxy S25","Samsung",80000,12,"Banglore");
		Online o2=new Online();
		o1.display();
		System.out.println("*************************************");
		o2.display();
		
	}

}
