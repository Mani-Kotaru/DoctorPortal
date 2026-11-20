package com.javaintro;

public class Test10 {
     int id;
     String name;
     {
    	 System.out.println("instance block");
     }
     static
     {
    	 System.out.println("static block");
     }
     static void m1()
     {     
    	 System.out.println("method1");
    	 m2();
    	 
     }
     static void m2()
     {   
    	 Test10 t=new Test10();
    	 System.out.println("method2");
    	  t.m3();
     }
     void m3()
     {
    	 System.out.println("method3");
    	 m4();
     }
     void m4()
     {
    	 System.out.println("method4");
    	 System.out.println(id);
    	 System.out.println(name);
     }
	public static void main(String[] args) {
		Test10 t=new Test10();
		t.id=101;
		t.name="mani";
		t.m4();
		m1();

	}

}
