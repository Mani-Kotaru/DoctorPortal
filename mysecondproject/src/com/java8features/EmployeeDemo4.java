package com.java8features;

import java.util.Arrays;
import java.util.List;

public class EmployeeDemo4 {

	public static void main(String[] args) {
		List<Employ> emp=Arrays.asList(new Employ(1,"mani",40000,"cse"),
                new Employ(2,"gayathri",50000,"ece"),
                new Employ(3,"visnhu priya",45000,"eee"),
                new Employ(4,"keerthi",42000,"cse"),
                new Employ(5,"Navya",35000,"civil"));
		// Print all employees
		emp.stream()
		   .forEach(e->System.out.println(e));
	System.out.println("************************");	
		// Print only employee names
		emp.stream()
		   .map(e->e.name)
		   .forEach(e->System.out.println(e));
	System.out.println("************************");	
		// Print only employee salaries
		emp.stream()
		   .map(e->e.salary)
		   .forEach(e->System.out.println(e));
    System.out.println("************************");	
		// Print employee whose salary is greater than 40000
		emp.stream()
		   .filter(e->e.salary>40000)
		   .forEach(e->System.out.println(e));
	System.out.println("************************");	
		// Print employee whose belong to cse department
		emp.stream()
		   .filter(e->e.department.equals("cse"))
		   .forEach(e->System.out.println(e));


	}

}
