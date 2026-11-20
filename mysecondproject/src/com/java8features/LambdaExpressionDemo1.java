package com.java8features;

 interface Message{
	void hello();
}
 interface Calculator{
	 int sum(int a,int b);
 }

public class LambdaExpressionDemo1 {

	public static void main(String[] args) {
		Message msg= () -> System.out.println("Hello Java");
          msg.hello();
       
        Calculator c=(a,b)->{return a+b;};
        System.out.println(c.sum(90, 40));
	}

}
