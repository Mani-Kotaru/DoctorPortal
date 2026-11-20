package com.oops.abstraction;

public interface InterfaceDemo {
   void method1();
   
   default void method2()
   {
	   System.out.println("default method!!");
	   method4();
   }
   static void method3() {
	   System.out.println("Static method called!");
	   
   }
   private void method4()
   {
	   System.out.println("private method called!!");
   }
}
