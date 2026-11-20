package com.multithreading;

   class DownloadThread extends Thread{
	   @Override
	   public void run()
	   {
		   for(int i=1;i<=5;i++)
		   {
			   System.out.println("one-"+i);
			   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   }
	   }
   }
   class CalculationThread extends Thread{
	   @Override
	   public void run()
	   {
		   for(int i=1;i<=5;i++)
		   {
			   System.out.println("two-"+i);
			   try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   }
	   }
   }
   class DisplayThread extends Thread{
	   DownloadThread t1;
	   CalculationThread t2;
	   public DisplayThread(DownloadThread t1, CalculationThread t2) {
		this.t1=t1;
		this.t2=t2;
	}

	   @Override
	   public void run()
	   {   try {
		t1.join();
		t2.join();
	   } catch (InterruptedException e) {
		
		e.printStackTrace();
	   }
		   for(int i=1;i<=5;i++)
		   {
			   System.out.println("three-"+i);
			   Thread.yield();
		   }
	   }
   }

public class MultithreadingDemo1 {

	public static void main(String[] args) throws InterruptedException  {
		DownloadThread t1=new DownloadThread();
		CalculationThread t2=new CalculationThread ();
		DisplayThread t3=new DisplayThread(t1,t2);
		t1.start();
		t2.start();
		t3.start();
		//t3.join();
		t1.setName("DownloadThread");
		t2.setName("CalculationThread");
		t3.setName("DisplayThread");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println(t1+" " +t1.getName());
		System.out.println(t2+" "+t2.getName());
		System.out.println(t3+" "+t3.getName());
		
		System.out.println(t1+" " +t1.getPriority());
		System.out.println(t2+" "+t2.getPriority());
		System.out.println(t3+" "+t3.getPriority());
		

	}

}
