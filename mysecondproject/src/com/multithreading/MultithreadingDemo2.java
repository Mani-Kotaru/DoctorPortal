package com.multithreading;

class Source{
	int counter=0;
	synchronized public void increment(Object o1)
	{  
		 try {
			Thread.sleep(1000);
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
		counter++;
		System.out.println(o1+"->i="+counter);
	}
}
class One extends Thread
{
	Source s;
	One(Source s)
	{
		this.s=s;
	}
	@Override
	public void run()
	{  
		for(int i=1;i<=5;i++)
		  s.increment(this);
	}
	public String toString()
	{
		return "One";
		
	}
}
class Two extends Thread
{
	Source s;
	Two(Source s)
	{
		this.s=s;
	}
	@Override
	public void run()
	{  
		for(int i=1;i<=5;i++)
		  s.increment(this);
	}
	public String toString()
	{
		return "Two";
		
	}
}

public class MultithreadingDemo2 {

	public static void main(String[] args) {
		Source c=new Source();
		One o1=new One(c);
		Two t1=new Two(c);
		o1.start();
		t1.start();

	}

}
