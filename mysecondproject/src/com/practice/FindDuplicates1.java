package com.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates1 {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,3,4,5,5};
		
		System.out.println("Original array: " + Arrays.toString(arr));
		
		Set<Integer> st=new LinkedHashSet<>();
		Set<Integer> s=new LinkedHashSet<>();
		for(int e:arr)
		{
			if(st.add(e))
			{
				continue;
			}
			else
			{
				s.add(e);
			}
		}
		
		System.out.print("duplicates: "+s);


	}

}
