package com.multithreading;

class Order extends Thread{
	@Override
	public void run()
	{
		System.out.println("Order placed!!");
	}
}
class Cooking extends Thread{
	@Override
	public void run()
	{
		System.out.println("Food is cooking...");
	    System.out.println("Food is ready!!");
	}
}
class Delivery extends Thread{
	@Override
	public void run()
	{
		System.out.println("Food delivered!!");
	}
}

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		Order o=new Order();
		Cooking c=new Cooking();
		Delivery d=new Delivery();
		o.start();
		o.join();
		c.start();
		c.join();
		d.start();

	}

}
