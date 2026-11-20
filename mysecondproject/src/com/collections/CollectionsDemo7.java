package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsDemo7 {

	public static void main(String[] args) {
		List<Integer> list =
		        new ArrayList<>(Arrays.asList(10,20,30));

		for (Integer x : list) {
		    if (x == 20)
		        list.remove(x);
		}

		System.out.println(list);

	}

}
