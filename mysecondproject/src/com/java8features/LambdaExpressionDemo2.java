package com.java8features;

import java.util.function.Function;

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {
		
		Function<String,String> fun=(s)->s.toUpperCase();
		
		System.out.println(fun.apply("mani kotaru"));

}
	
}
