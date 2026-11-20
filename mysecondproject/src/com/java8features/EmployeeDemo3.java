 package com.java8features;

import java.util.Arrays;


import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDemo3 {

	public static void main(String[] args) {
		List<Employ> emp=Arrays.asList(new Employ(1,"mani",40000,"cse"),
                new Employ(2,"gayathri",50000,"ece"),
                new Employ(3,"visnhu priya",45000,"eee"),
                new Employ(4,"keerthi",42000,"cse"),
                new Employ(5,"Navya",35000,"civil"));
		
		Map<String,List<Employ>> emp1=emp.stream()
				                         .collect(Collectors.groupingBy(e->e.department));
		System.out.println("Department-Wise Employee");
		emp1.forEach((dept,empList)->System.out.println(dept+" -> "+empList));
		
		System.out.println("*************************************");
		
//		Set<Entry<String, List<Employ>>> entries = emp1.entrySet();
//		
//		for (Entry<String, List<Employ>> entry : entries) {
//		    System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
		
		
		Map<String,Double> emp2=emp.stream()
				                   .collect(Collectors.groupingBy(e->e.department
				                		   ,Collectors.averagingDouble(e->e.salary)));
		System.out.println("Department-Wise Avg Salary");
		
		emp2.forEach((dept,avgSalary)->System.out.println(dept+" -> "+avgSalary));
		

	}

}
