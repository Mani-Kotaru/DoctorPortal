package com.exception_handling;

import java.util.Scanner;

public class OnlineShopingOrder {

	public static void main(String[] args) {
		
		try{
		  String price;
		  double quantity;
		String products[]=new String[5];
		  products[0]="mobile";
		  products[1]="computer";
		  products[2]="laptop";
		  products[3]="car";
		  products[4]="book";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price : ");
		 price=sc.next();
		 double price1= Double.parseDouble(price);
		 System.out.println("enter quantity : ");
		 quantity=sc.nextDouble();
		 int result=(int)price1/(int)quantity;
		 System.out.println(result);
		 System.out.println("enter index : ");
		 int index=sc.nextInt();
		 System.out.println(products[index]);
		
		}catch(NumberFormatException e)
		{
			System.err.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e);

		}
		catch(ArithmeticException e)
		{
			System.err.println(e);

		}
		finally {
			System.out.println("Order processing completed!!");
		}
		 
		System.out.println("main method ended");
		

	}

}
