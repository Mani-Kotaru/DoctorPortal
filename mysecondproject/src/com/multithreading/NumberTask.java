package com.multithreading;

public class NumberTask implements Runnable{
	@Override
	public void run() {
		System.out.println("run method started");
		for(int i=2;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("run method ended");
		
	}

	public static void main(String[] args) {
	System.out.println("main method started");
            NumberTask n=new NumberTask();
            Thread t=new Thread(n);
            t.start();
      System.out.println("main method ended");
	}

	
}
