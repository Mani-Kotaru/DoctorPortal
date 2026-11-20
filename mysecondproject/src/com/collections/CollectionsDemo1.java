package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		Collection<String> collection1= new ArrayList<>();
		collection1.add("Mani");
		collection1.add("Raghu");
		collection1.add("Srinivasarao");
		collection1.add("Madhavi");
		collection1.add("Kotaru");
		System.out.println(collection1);
		System.out.println("********************************");
		Collection<String> collection2= new ArrayList<>();
		collection2.add("Triveni");
		collection2.add("Uma");
		collection2.add("Gayathri");
		collection2.add("Vishnu Priya");
		collection2.add("Mani");
		System.out.println(collection2);
		System.out.println("********************************");
		collection1.addAll(collection2);
		System.out.println(collection1);
		
	}

}
