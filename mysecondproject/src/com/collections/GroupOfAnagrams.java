package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupOfAnagrams {

	public static void main(String[] args) {
		String[] words= {"eat","tea","tan","ate","nat","bat"};
		 Map<String,ArrayList<String>> map=new HashMap<>();
		
		for(String word1:words)
		{  
			ArrayList<String> as=new ArrayList<>();
			char[] ch1=word1.toCharArray();
			Arrays.sort(ch1);
			String s1=new String(ch1);
			
			for(String word2:words)
			{
				char[] ch2=word2.toCharArray();
				Arrays.sort(ch2);
				String s2=new String(ch2);
				if(s1.equals(s2))
				{
					as.add(word2);
				}
			}	
			if(!map.containsKey(s1))
			{
				map.put(s1, as);
			}
			
			
		}
		System.out.println(map.values());
	    
		System.out.println();
		System.out.println(map.keySet());
	}

}
