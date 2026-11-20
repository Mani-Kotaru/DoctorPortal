package com.collections;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindCharFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		int count=0;
		for(char c:ch)
		{
			if(!map.containsKey(c))
			{   count=1;
				map.put(c, count);
			}
			else
			{
				count++;
				map.put(c,count);
			}
		}
		System.out.println(map);
		Set<Entry<Character, Integer>> entries=map.entrySet();
		for(Entry<Character,Integer> e:entries)
		{
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
		
		

	}

}
