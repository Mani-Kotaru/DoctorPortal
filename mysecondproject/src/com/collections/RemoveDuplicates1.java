package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		System.out.println("original list : "+list);
		List<Integer> result=new ArrayList<>();
		for(Integer num:list)
		{
			if(result.contains(num))
			{
				continue;
			}
			else
			{
				result.add(num);
			}
		}
		System.out.println("modified list : "+result);


	}

}
