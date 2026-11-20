package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReplaceWithZero {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60);
		System.out.println(list);
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext())
		{
			int value=itr.next();
			int index=list.indexOf(value);
			if(index%2==0)
			{
				list.set(index,0);
			}
		}
		System.out.println(list);

	}

}
