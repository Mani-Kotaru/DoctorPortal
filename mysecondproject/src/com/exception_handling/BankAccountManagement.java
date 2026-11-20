package com.exception_handling;

import java.util.Scanner;

public class BankAccountManagement {

	public static void main(String[] args) throws InsufficientBalanceException {
		try{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name : ");
		String name=sc.nextLine();
		System.out.println("enter balance : ");
		String balanceInput=sc.next();
		System.out.println("enter amount to withdraw : ");
		String amountInput=sc.next();
		double balance=Double.parseDouble(balanceInput);
		double amount=Double.parseDouble(amountInput);
		if(amount>balance)
		{
			throw new InsufficientBalanceException("Insufficient balance!! available balance : "+balance);
		}
		if(amount<=0)
		{
			throw new ArithmeticException("withdrawal amount cannot be negative or zero");
		}
		
			balance=balance-amount;
			System.out.println("remaining balance : "+balance);
		
		}
		catch(NumberFormatException e)
		{
			System.err.println(e);
		}
		catch(InsufficientBalanceException e)
		{
			System.err.println(e);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e);
		}
		finally {
			System.out.println("Transaction completed!!");
		}
		System.out.println("main method ended!");
	}

}
