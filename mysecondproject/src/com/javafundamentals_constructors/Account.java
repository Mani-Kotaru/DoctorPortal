package com.javafundamentals_constructors;

public class Account {
	
	 long accountNumber;
	 String accountHolderName;
	
	 Account( long accountNumber, String accountHolderName)
	   {
		     this.accountNumber=accountNumber;
		     this.accountHolderName=accountHolderName;
		    
		     System.out.println("two-arg constructor of Account class");
	   }

	public static void main(String[] args) {
          
		System.out.println("main method of Account class");
	}

}

class SavingsAccount extends Account {
	
	double balance;
	
	SavingsAccount( long accountNumber, String accountHolderName,double balance)
   {
	   super(accountNumber,accountHolderName);
	   this.balance=balance;
	     System.out.println("two-arg constructor of SavingsAccount class");
	     
   }

	public static void main(String[] args) {
		
		SavingsAccount  s1=new SavingsAccount (4567886543245677889l,"Mani",45000);
		   s1.display();
		}
	
	void display() {
		
		System.out.println("account number:"+accountNumber);
		System.out.println("account holder name:"+accountHolderName);
		System.out.println("balance:"+balance);
		System.out.println("********************************************");
	}

}
