package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(40);
		System.out.println("original list : "+list);
	
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.remove(j);
					j--;
				}
			}
		}
		
		
		System.out.println("modified list : "+list);
		

	}

}
