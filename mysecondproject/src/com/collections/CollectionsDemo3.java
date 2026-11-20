package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo3 {

	public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<>();
         c1.add(18);
         c1.add(40);
         c1.add(10);
         c1.add(50);
         c1.add(60);
         
         c1.add(15);
         c1.add(70);
         c1.add(5);
         c1.add(1);
         c1.add(18);
         System.out.println(c1);
       System.out.println(c1.contains(67));
       System.out.println(c1.size());
       System.out.println(c1.remove(0));
       System.out.println(c1);
       System.out.println(c1.isEmpty());
       c1.clear();
       System.out.println(c1);
       
       
	}

}
