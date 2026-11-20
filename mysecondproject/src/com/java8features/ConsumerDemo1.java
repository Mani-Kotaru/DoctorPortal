package com.java8features;

import java.util.ArrayList;
import java.util.function.Consumer;

class Employee
{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}


public class ConsumerDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp=new ArrayList<>();
		Employee e1=new Employee(101,"Mani",30000);
		Employee e2=new Employee(102,"Raghu",80000);
		Employee e3=new Employee(103,"Srinivasarao",50000);
		Employee e4=new Employee(101,"Madhavi",40000);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		Consumer<Employee> empDetails=(e)->{  
			
			System.out.println("Employee Id : "+e.getId());
			System.out.println("Employee Name : "+e.getName());
			System.out.println("Employee Salary : "+e.getSalary());
			System.out.println("***********************************");
		
		};
		for(Employee e:emp)
		{
			empDetails.accept(e);
		}
	}

}
