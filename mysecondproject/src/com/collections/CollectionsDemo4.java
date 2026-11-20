package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo4 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(38);
		list.add(80);
		list.add(35);
		list.add(60);
		list.add(30);
		
		list.add(19);
		list.add(23);
		list.add(65);
		list.add(57);
		list.add(40);
		System.out.println(list);
		Iterator<Integer> it=list.iterator();
		System.out.println("Prime numbers : ");
		while(it.hasNext()) {
			Integer value= it.next();
			if(isPrime(value))
			  System.out.println(value);
		}
		 it=list.iterator();
		System.out.println("even numbers : ");
		while(it.hasNext()) {
			Integer value= it.next();
		if(value%2==0)
			   System.out.println(value);
		
		}
	}

	private static boolean isPrime(Integer em) {
		 boolean status=true;  
		if(em<2)
			   return false;
		for(int i=2;i<=em/2;i++)
		{
			if(em%i==0)
				status=false;
		}
		return status;
	}

}
