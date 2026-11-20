package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthOfString {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("mani","gayathri","Vishnu Priya","Anushka","samantha");
		
		List<String> result=names.stream()
				                 .filter(s->s.length()>5)
				                  .collect(Collectors.toList());
				                 
		//result.forEach(name->System.out.println(name));
	
		//	System.out.println("Strings whose length is greater than 5 : "+result);
		
		result.forEach(System.out::println);

	}

}
