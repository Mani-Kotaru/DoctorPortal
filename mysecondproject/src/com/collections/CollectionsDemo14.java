package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// using hashset find duplicates in arraylist
public class CollectionsDemo14 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,2,3,3,5,3,2);
		System.out.println("original list : "+list);
		Set<Integer> newList=new HashSet<>();
		Set<Integer> result=new HashSet<>();
		for(Integer num:list)
		{  
			
			if(newList.add(num))
			{
				continue;
			}
			else 
			{   
				
				   result.add(num);
			}
			
		}
		System.out.println("elements after removing duplicates : "+newList);
		System.out.println("Duplicate elements : "+result);

	}

}
