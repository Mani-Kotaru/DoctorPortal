package com.javafundamentals_constructors;

public class FoodOrder {
     int orderID;
     String customerName;
     String restaurantName;
     String itemName;
     int quantity;
     double price;
     public FoodOrder(int orderID, String customerName, String itemName) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.itemName = itemName;
	}
    public FoodOrder(int orderID, String customerName, String restaurantName, String itemName, int quantity) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.restaurantName = restaurantName;
		this.itemName = itemName;
		this.quantity = quantity;
	}


	public FoodOrder(int orderID, String customerName, String restaurantName, String itemName, int quantity,
			double price) {
		this.orderID = orderID;
		this.customerName = customerName;
		this.restaurantName = restaurantName;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	public static void main(String[] args) {
		FoodOrder order1=new FoodOrder(101,"Siva","Chicken Biryani");
		     order1.display();
		FoodOrder order2=new FoodOrder(102,"Reddy","Paradise","Mutton Biryani",2);
		 order2.display();
		FoodOrder order3=new FoodOrder(103,"Kumar","Mehfil","Fried Rice",3,450);
		 order3.display();
	}
	
	void display()
	{
		System.out.println("order id:"+orderID);
		System.out.println("customer name:"+customerName);
		System.out.println("restaurant name:"+restaurantName);
		System.out.println("item name:"+itemName);
		System.out.println("number of items:"+quantity);
		System.out.println("price:"+price);
		
		System.out.println("******************************************");
		
		
	}

}
