package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinNumber {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=  new ArrayList<>(Arrays.asList(20,34,19,42,25));
		
		int min=numbers.stream().min(Integer::compareTo).get();
		int max=numbers.stream().max(Integer::compareTo).get();
		
		System.out.println("MIN : "+min);
		System.out.println("MAX : "+max);
	}

}
