package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo10 {

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
		List<Integer> result=new ArrayList<>();
		for(int i=0;i<l1.size();i++)
		{
			Integer m=l1.get(i);
			if(l2.contains(m) && !result.contains(m))
			{
				result.add(m);
			}
		}
      System.out.println("common elements : "+result);
	}

}
