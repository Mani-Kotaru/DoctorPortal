package com.pocs;

import java.util.*;

public class SwitchCaseDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double totalCost1 = 0, cost = 0,totalCost2 = 0;
		String yn;
		do {
			System.out.println("menu:\n1.vegetables\n2.fruits");
			System.out.println("enter what you want to buy (1 or 2) from the menu : ");
			int op = sc.nextInt();

			switch (op) {

			case 1 -> {
				do {
					System.out.println("you are going to buy vegetables!");
					System.out.printf("menu:\n1.tomato\n2.potato\n3.cucumber\n4.drumstick\n5.carrot\n");
					System.out.println("enter which item you want to buy(1 or 2 or 3 or 4 or 5) from the menu : ");
					int op1 = sc.nextInt();
					switch (op1) {
					case 1 -> {
						System.out.println("the price of tomato is 40 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 40;
						System.out.println("total price:"+cost);
					
					}
					case 2 -> {
						System.out.println("the price of potato is 30 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 30;
						System.out.println("total price:"+cost);
					}
					case 3 -> {
						System.out.println("the price of cucumber is 20 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 20;
						System.out.println("total price:"+cost);
					}
					case 4 -> {
						System.out.println("the price of drumstick per piece is 10");
						System.out.println("enter number of pieces :");
						float quant = sc.nextFloat();
						cost = quant * 10;
						System.out.println("total price:"+cost);
					}
					case 5 -> {
						System.out.println("the price of carrot is 60 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 60;
						System.out.println("total price:"+cost);
					}
					default -> System.out.println("entered item is not in the menu!");
					}
					totalCost1 += cost;
					System.out.println("do you want continue buying vegetables?(yes/no):");
					yn = sc.next();
				} while (yn.equalsIgnoreCase("yes"));
				System.out.println("exit from buying vegetables!");
			}
			case 2 -> {
				do {
					System.out.println("you are going to buy fruits!");
					System.out.printf("menu:\n1.mango\n2.apple\n3.orange\n4.watermelon\n5.grapes\n");
					System.out.println("enter which item you want to buy(1 or 2 or 3 or 4 or 5) from the menu : ");
					int op1 = sc.nextInt();
					switch (op1) {
					case 1 -> {
						System.out.println("the price of mango is 80 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 80;
						System.out.println("total price:"+cost);
					}
					case 2 -> {
						System.out.println("the price of apple is 300 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 300;
						System.out.println("total price:"+cost);
					}
					case 3 -> {
						System.out.println("the price of orange is 120 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 120;
						System.out.println("total price:"+cost);
					}
					case 4 -> {
						System.out.println("the price of watermelon is 25 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 25;
						System.out.println("total price:"+cost);
					}
					case 5 -> {
						System.out.println("the price grapes is 90 per kg");
						System.out.println("enter quantity(in kg) :");
						float quant = sc.nextFloat();
						cost = quant * 90;
						System.out.println("total price:"+cost);
					}
					default -> System.out.println("entered item is not in the menu!");
					}
					totalCost2 += cost;
					System.out.println("do you want continue buying fruits?(yes/no):");
					yn = sc.next();
				} while (yn.equalsIgnoreCase("yes"));
				System.out.println("exit from buying fruits!");
				
			}
			default -> System.out.println("entered option is not there in menu!");
			}
			System.out.println("do you want continue buying ?(yes/no):");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("yes"));
		System.out.println("exit from buying fruits and vegetables!");
		
		System.out.println("the bill you get after buying vegetables(in Rs) : " + totalCost1);
		System.out.println("the bill you get after buying fruits(in Rs) : " + totalCost2);
		System.out.println("the total bill you get after buying fruits and vegetables : "+(totalCost1+totalCost2));
	}
}
