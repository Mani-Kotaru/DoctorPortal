package com.java8features;

import java.util.ArrayList;

import java.util.function.Predicate;

public class EvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(17);
		list.add(18);
		list.add(16);
		list.add(79);
		list.add(100);
		list.add(15);
		list.add(66);
		list.add(55);
           
		Predicate<Integer> isEven=(num)-> num%2==0;
			                           
		 for(Integer in:list)
         {
         	if(isEven.test(in))
         	{
         		System.out.println(in);
         	}
         }
	}

}
