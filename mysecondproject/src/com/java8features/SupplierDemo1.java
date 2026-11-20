package com.java8features;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {
		
	//	Supplier<Integer> random=()->(int)(Math.random()*100)+1;
		
		Supplier<Integer> random=()->{ Random ran=new Random();
		                               
		                         return ran.nextInt(100)+1;
		};
		
		System.out.println("Random number : "+random.get());

	}

}
