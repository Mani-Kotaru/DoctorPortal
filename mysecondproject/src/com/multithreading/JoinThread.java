package com.multithreading;

 class Thread1 extends Thread{
	@Override
	 public void run()
	{
	 for(int i=1;i<=5;i++)
	{
		System.out.println("j1 : "+i);
	}
	}
}
 class Thread2  extends Thread{
  Thread1 t1;
  Thread2(Thread1 t1)
  {
	  this.t1=t1;
  }
	@Override
	 public void run()
		{
			for(int i=6;i<=10;i++)
		     { 
				if(i==8)
				{
					try {
						t1.join();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
		   System.out.println("j2 : "+i);
		      }
		}
	}

 public class JoinThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2(t1);
		t2.start();
	  //t1.join();
		t1.start();
		
		

	}

}
