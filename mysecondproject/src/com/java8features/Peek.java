package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Peek {

	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
			    List.of(1, 2, 3),
			    List.of(4, 5, 6),
			    List.of(7, 8, 9)
			);
		
		list.stream()
	    .flatMap(innerList -> innerList.stream())
	    .forEach(System.out::println);

	}

}
