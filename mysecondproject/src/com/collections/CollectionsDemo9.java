package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo9 {

		public static void main(String[] args) {
			List<Integer> list=new ArrayList<>();
			list.add(2);
			list.add(2);
			list.add(1);
			list.add(4);
			list.add(4);
			
			System.out.println(list);
			for(int i=0;i<list.size();i++)
			{   int count=0;
			    Integer m=list.get(i);
				for(int j=0;j<list.size();j++)
				{
					 Integer n=list.get(j);
					
					if(m==n)
					{
						count++;
					}
					
				}
				if(count==1)
				{
					System.out.println(m);
					break;
				}
			}

	}

}
