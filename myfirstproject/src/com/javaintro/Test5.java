package com.javaintro;

public class Test5 {
	 @Override
	protected void finalize()  {
       System.out.println("object destroyed!!");
	 }

	public static void main(String[] args) {
		Test5 t=new Test5();//object 1
		    t=new Test5();//object 1 is replaced, old object 1 is eligible for garbage collection
		    System.gc();
      
	}

}
