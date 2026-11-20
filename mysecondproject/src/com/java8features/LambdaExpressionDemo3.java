package com.java8features;
@FunctionalInterface
interface Test {
    void show();
    }

public class LambdaExpressionDemo3 {

	public static void main(String[] args) {
		
		  int x=10;
		
		  Test t = () -> System.out.println(x);

	      //  x = 20;
	       
	        t.show();

	}

}
