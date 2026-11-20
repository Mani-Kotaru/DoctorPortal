package com.multithreading;
// interrupting a thread
public class InterruptThread1 extends Thread {

	public static void main(String[] args)   {
		
		InterruptThread1 it=new InterruptThread1();
		it.start();
		it.interrupt();
		System.out.println("main method ...");
		
}
	@Override
   public void run()
   { 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.err.println("I got interrupted !!!");
		}
      System.out.println("Welcome to Multithreading...");
   }
}
