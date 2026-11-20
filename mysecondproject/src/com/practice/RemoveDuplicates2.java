package com.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,3,4,5,5};
		System.out.println("Original array: " + Arrays.toString(arr));
		Set<Integer> st=new LinkedHashSet<>();
		for(int e:arr)
		{
			st.add(e);
		}
		
		System.out.print("Array after removing duplicates: "+st);

       
	}

}
