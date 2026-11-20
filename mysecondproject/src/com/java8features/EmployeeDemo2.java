package com.java8features;

import java.util.Arrays;
import java.util.List;

  class Employ{
	int id;
	String name;
	double salary;
	String department;
	public Employ(int id, String name, double salary, String department) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
//	@Override
//	public String toString() {
//		return "id=" + id + "\nname=" + name + "\nsalary=" + salary + "\ndepartment=" + department+"\n*********************";
//	}
	 @Override
	    public String toString() {
	        return "{"+id + "," + name + "," + salary + "," + department+"}";
	    }
	
	
}

public class EmployeeDemo2 {

	public static void main(String[] args) {
		List<Employ> emp=Arrays.asList(new Employ(1,"mani",40000,"cse"),
				                         new Employ(2,"gayathri",50000,"ece"),
				                         new Employ(3,"visnhu priya",45000,"eee"),
				                         new Employ(4,"keerthi",42000,"cse"),
				                         new Employ(5,"Navya",35000,"civil"));
		double secHighSal=emp.stream()
				             .map(e -> e.salary)
				             .sorted((a,b)->Double.compare(b, a))
				             .skip(1)
				             .findFirst()
				             .orElse(null);
		System.out.println("Second Highest Salary : "+secHighSal);
		
		System.out.println("==============================");
		
		                emp.stream()
		                   .sorted((a,b)->Double.compare(b.salary,a.salary))
		                   .forEach(e->System.out.println(e));

	}

}
