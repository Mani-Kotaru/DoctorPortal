package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MaxAndSecMax {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(30);
		
		System.out.println(list);
		Integer max=list.get(0);
		Integer smax=list.get(0);
		for(int i=1;i<list.size();i++)
		{   
			Integer value=list.get(i);
			if(value>max)
			{   
				smax=max;
				max=value;
			}
			else if(value>smax && value<max)
			{   
	             smax=value;
			}
			
		}
		
			
		
		System.out.println("Largest : "+max);
		System.out.println("SecondLargest : "+smax);
		
		

	}

}
