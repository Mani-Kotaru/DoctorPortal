package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo11 {

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
		Set<Integer> result=new HashSet<>();
		
		for(int i=0;i<l1.size();i++)
		{
			Integer m=l1.get(i);
			if(l2.contains(m))
			{
				result.add(m);
			}
		}
		System.out.println("common elements are : "+result);

	}

}
