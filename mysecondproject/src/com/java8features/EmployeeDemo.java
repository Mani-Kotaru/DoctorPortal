package com.java8features;

import java.util.HashMap;
import java.util.stream.Stream;

public class EmployeeDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> employees= new HashMap<>();
		
		employees.put(1,"mani");
		employees.put(2, "gayathri");
		employees.put(3, "vishnu");
		
		employees.entrySet()
		         .stream()
		         .forEach(entry-> System.out.println(entry.getKey()+" : "+entry.getValue()));
		        
		
		

	}

	
}
