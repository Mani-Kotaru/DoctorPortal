package com.multithreading;

class Resource{
	int i=0;
	boolean status=false;
	synchronized void put(int i) throws InterruptedException
	{    
		while(status)
		{
			wait();
		}
	    this.i=i;
		System.out.println("PUT : "+i);
		status=true;
		notify();
	}
	synchronized void get() throws InterruptedException
	{  
		 
		while(!status)
		{
			wait();
		}
	   System.out.println("GET : "+i);
	   status=false;
		notify();
	}
}
class Producer  implements Runnable{
	Resource r;
	int i=1;
	Producer(Resource r){
		this.r=r;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}
	
	@Override
	public void run()
	{    int i=1;
		while(i<=5)
			try {
				r.put(i++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
class Consumer implements Runnable{
	Resource r;
	Consumer(Resource r){
		this.r=r;
		
		Thread t1=new Thread(this,"Consumer");
		t1.start();
	}
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
			try {
				r.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}


public class ProducerConsumer {

	public static void main(String[] args) {
		
             Resource r=new Resource();
             Producer p1=new Producer(r);
             Consumer c1=new Consumer(r);
           
	}

}
