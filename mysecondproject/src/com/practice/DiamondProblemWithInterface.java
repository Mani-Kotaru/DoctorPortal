package com.practice;
interface Demo{
	
	default void show(){
		System.out.println("show method called from Demo interface");
	}

}
interface Remo{
	default void show(){
		System.out.println("show method called from Remo interface");
	}

}
class Example implements Demo,Remo{
	
	@Override
	public void show()
	{
		Demo.super.show();
		Remo.super.show();
	}
	
}
public class DiamondProblemWithInterface {

	public static void main(String[] args) {
		Example e=new Example();
		e.show();

	}

}
