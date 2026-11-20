package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo12 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l2.add(2);
		l2.add(2);
		l2.add(4);
		l2.add(4);
		l2.add(6);
		System.out.println("list1 : "+l1);
		System.out.println("list2 : "+l2);
		
		l2.retainAll(l1);
	//	System.out.println(l2);
		Set<Integer> set=new HashSet<>();
		set.addAll(l2);
		System.out.println("Common elements : "+set);

	}

}
