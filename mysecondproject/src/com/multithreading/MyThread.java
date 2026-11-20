package com.multithreading;

public class MyThread extends Thread {
	@Override
	public void run()
	{  
		System.out.println("run method started");
		for(int i=1;i<=10;i++)
		{   
			
			System.out.print(i);
			if(i!=10)
			{
				System.out.print(",");
			}
		}
		System.out.println("run method ended");
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		MyThread m=new MyThread();
		m.start();
	//	m.start();
		System.out.println("main method ended");

	}

}
