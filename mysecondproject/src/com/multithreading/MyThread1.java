package com.multithreading;

public class MyThread1 extends Thread {
	
	@Override
	public void run()
	{  
		setName("StudentThread");
	    System.out.println("Thread Name : "+getName());
		for(int i=1;i<=5;i++)
		   System.out.print(i+",");
	}

	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		m1.start();
		
		Thread.currentThread().setName("RaghuThread");
		System.out.println(Thread.currentThread().getName());
		
		
		
	}

}
