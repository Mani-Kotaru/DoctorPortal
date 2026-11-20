package com.multithreading;

class BankAccount{
	double initialBalance=10000;

	synchronized public void withdraw(double amount,String name)  {
		while(amount>initialBalance)
		{
			
			System.out.println("Withdrawal is not possible for Mr/Ms : "+name);
			System.out.println("Available balance : "+initialBalance);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
			initialBalance=initialBalance-amount;
			System.out.println("withdrawal amount by Mr/Ms : "+name+" is "+amount);
			System.out.println("Remaining amount : "+initialBalance);
			notify();
		
		
	}
	
}
class Customer1 extends Thread{
	BankAccount ba;
	String name;
	double amount;
	
	
	public Customer1(BankAccount ba, String name, double amount) {
		this.ba = ba;
		this.name = name;
		this.amount = amount;
	}


	@Override
	public void run()
	{   
		ba.withdraw(amount,name);
	}
		
	}
	

class Customer2 extends Thread{
	BankAccount ba;
	String name;
	double amount;
	public Customer2(BankAccount ba, String name, double amount) {
		
		this.ba = ba;
		this.name = name;
		this.amount = amount;
	}
	
	@Override
	public void run()
	{
		ba.withdraw(amount,name);
	}
	
}
public class WaitAndNotifyDemo {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Customer1 c1=new Customer1(ba,"Mani",10000);
		Customer2 c2=new Customer2(ba,"Raghu",10000);
         c1.start();
         c2.start();
	}

}
