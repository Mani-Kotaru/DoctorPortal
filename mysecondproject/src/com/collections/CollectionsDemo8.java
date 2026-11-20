package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo8 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(7);
		list.add(4);
		list.add(7);
		list.add(5);
		list.add(8);
		list.add(1);
		System.out.println(list);
		Integer target=9;
		for(int i=0;i<list.size();i++)
		{   Integer m=list.get(i);
			for(int j=i+1;j<list.size();j++)
			{  
				Integer n=list.get(j);
				Integer sum=m+n;
				if(sum.equals(target))
				{
					System.out.println("("+m+","+n+")");
				}
			}
		}
	}

}
