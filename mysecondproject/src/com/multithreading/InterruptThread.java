package com.multithreading;
// interrupting main thread
public class InterruptThread extends Thread {

	public static void main(String[] args)   {
		
		InterruptThread it=new InterruptThread();
		it.start();
    	Thread t=Thread.currentThread();
		t.interrupt();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.err.println("Main thread interrupted...");
		}
		System.out.println("main method ...");
}
	@Override
   public void run()
   { 
      System.out.println("Welcome to Multithreading...");
   }
}
