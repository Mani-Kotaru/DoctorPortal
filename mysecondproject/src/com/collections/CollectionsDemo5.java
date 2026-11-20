package com.collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class CollectionsDemo5 {

	public static void main(String[] args) {
		List<String> emp=new ArrayList<>();
		emp.add("Kowshitha");
		emp.add("Meghana");
		emp.add("Divya");
		emp.add("Kavya");
		emp.add("Prasanna");
		System.out.println(emp);
		
		emp.add(3,"Rishmitha");
		System.out.println(emp);
     
		System.out.println(emp.get(3));
		
		emp.set(0,"Anjali");
		System.out.println(emp);
		
		emp.remove(emp.indexOf("Rishmitha"));
		System.out.println(emp);
		
		System.out.println("is list contains Meghana? : "+emp.contains("Meghana"));
		
		System.out.println(emp.indexOf("Prasanna"));
		
		System.out.println("Count of employees : "+emp.size());
		
		System.out.println("Is list empty : "+emp.isEmpty());
		
		Collections.sort(emp);
		System.out.println("sorted list : "+emp);
		
		emp.clear();
		System.out.println(emp);
		
		

	}

}
