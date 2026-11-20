package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<>();
         c1.add("mani");
         c1.add("raghu");
         c1.add("madhavi");
         c1.add("Srinu");
         c1.add("Gayathri");
         
         c1.add("Vishnu");
         c1.add("Triveni");
         c1.add("Uma");
         c1.add("navya");
         c1.add("sam");
         System.out.println(c1);
         System.out.println("is contains uma : "+c1.contains("Uma"));
         c1.remove("navya");
         System.out.println("size of the collection : "+c1.size());
         System.out.println("is collection empty : "+c1.isEmpty());
         c1.clear();
         System.out.println("is collection empty : "+c1.isEmpty());
	}

}
