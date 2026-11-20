package com.collections;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber1 {

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
		//expected sum for numbers 1 to 10
		int esum=0;
		for(int i=1;i<=10;i++)
		{
			esum+=i;
		}
		//actual sum
		int asum=0;
		for(int i:list)
		{
			asum=asum+i;
		}
		int missNum=esum-asum;
		System.out.println("missing number is : "+missNum);

	}

}
