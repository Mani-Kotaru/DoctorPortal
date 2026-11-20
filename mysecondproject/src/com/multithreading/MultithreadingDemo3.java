package com.multithreading;

class Employee implements Runnable{
	double basicSal;
	double allowances;
	String ename;
	double sal;
	Employee(double basicSal,String ename)
	{
		this.basicSal=basicSal;
		this.ename=ename;
	}
	@Override
	public void run() {
		calculateSalary();
	}

	private void calculateSalary() {
		
		   allowances=0.10*basicSal;
		   sal=basicSal+allowances;
		   System.out.println("Total salary of Mr/Ms "+ename+" is : "+sal);
		 
	}
	public double getSalary()
	{
		return sal;
	}
	
	
}

public class MultithreadingDemo3 {

	public static void main(String[] args) throws InterruptedException {
		Employee e1=new Employee(50000,"Mani");
		Thread t1=new Thread(e1);
		t1.start();
		Employee e2=new Employee(80000,"Raghu");
		Thread t2=new Thread(e2);
		t2.start();
		Employee e3=new Employee(60000,"Sam");
		Thread t3=new Thread(e3);
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		double totalSal=e1.getSalary()+e2.getSalary()+e3.getSalary();
		System.out.println("Total salary : "+totalSal);
		
		

	}

}
