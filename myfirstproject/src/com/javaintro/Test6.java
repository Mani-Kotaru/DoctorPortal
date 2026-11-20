package com.javaintro;

public class Test6 {
	Test6 link;
	@Override
	protected void finalize()  {
    System.out.println("Object Destroyed");
	}
    public static void main(String[] args) {
    	Test6 t1= new Test6();
    	Test6 t2= new Test6();
    	t1.link=t2;
    	t2.link=t1;
    	//t1.link=null;
        t2.link=null;
        t1=null;
    	//t2=null;
    	System.gc();
    	System.out.println("Main method ended");

	}

}
