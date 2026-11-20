package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo6 {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
//		Employee e1=new Employee(106,"mani",60000);
//		Employee e2=new Employee(102,"raghu",35000);
//		Employee e3=new Employee(103,"srinu",80000);
//		Employee e4=new Employee(105,"madhavi",30000);
		
		list.add(new Employee(106,"mani",60000));
		list.add(new Employee(102,"raghu",35000));
		list.add(new Employee(103,"srinu",80000));
		list.add(new Employee(105,"madhavi",30000));
		System.out.println(list);
		
		System.out.println();
		
		list.add(1,new Employee(107,"Rahul",54000));
		System.out.println(list);
		
		System.out.println();

		System.out.println(list.get(3));
		
		System.out.println();

		
		


	}

}
