package com.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemo5 {

	public static void main(String[] args) {
		
		List<Employ> emp=Arrays.asList(new Employ(1,"mani",40000,"cse"),
                new Employ(2,"gayathri",50000,"eee"),
                new Employ(3,"visnhu priya",45000,"eee"),
                new Employ(4,"keerthi",42000,"cse"),
                new Employ(5,"Navya",35000,"civil"));
		
		//Highest salary in each department
		Map<Object, Optional<Employ>> result  =
	            emp.stream()
	               .collect(Collectors.groupingBy(e -> e.department,
	                        Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))));

	        result.forEach((department, employee) ->
	            System.out.println(department + " -> " + employee.get())
	        );
	    System.out.println("********************************");
	    //Count employee in each department
	        
	        Map<String, Long> result1 =
	        	    emp.stream()
	        	       .collect(Collectors.groupingBy(
	        	            e -> e.department,
	        	            Collectors.counting()
	        	        ));

	        	result1.forEach((department, count) ->
	        	    System.out.println(department + " -> " + count)
	        	);
	        

	}

}
