package com.multithreading;

public class SleepDemo extends Thread {
	 
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		
			
	}

	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(3000);
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println(i);
//		}
		SleepDemo sd=new SleepDemo();
		sd.start();
			
	}

}
