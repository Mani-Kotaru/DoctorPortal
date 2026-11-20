package com.collections;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		for(int i=0;i<list.size()-1;i++)
		{
			int num1=list.get(i);
			int num2=list.get(i+1);
			if(num2-num1>1)
			{
				System.out.println("missing number : "+(num1+num2)/2);
			}
			
		}
		

	}

}
