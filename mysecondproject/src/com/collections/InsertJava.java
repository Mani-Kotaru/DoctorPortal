package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsertJava {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("JavaScript");
		list.add("Python");
		list.add("SQL");
		list.add("HTML");
		list.add("Python");
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals("Python"))
			{
				list.add(i+1,"Java");
			}
		}
		System.out.println(list);


	}

}
