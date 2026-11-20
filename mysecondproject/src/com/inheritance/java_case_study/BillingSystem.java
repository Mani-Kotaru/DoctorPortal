package com.inheritance.java_case_study;

import java.util.Scanner;

public class BillingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu :\n1.Pizza\n2.Burger\n3.Biryani");
		System.out.println("select a food item :");
		String item=sc.nextLine();
		System.out.println("enter quantity : ");
	    int quant=sc.nextInt();
		System.out.println("enter the price : ");
		double price=sc.nextDouble();
		
		    if(item.equalsIgnoreCase("Pizza"))
			{
			     Pizza p=new Pizza(item,quant,price);
			     p.display();
			}
		    else if(item.equalsIgnoreCase("Burger"))
			{
			     Burger b=new Burger(item,quant,price);
			     b.display();
			}
		    else if(item.equalsIgnoreCase("Biryani"))
			{
			     Biryani  p=new Biryani(item,quant,price);
			     p.display();
			}
		    else
		    {
		    	System.out.println("entered food item is not there in menu !!");
		    }
		
		
	}

}
