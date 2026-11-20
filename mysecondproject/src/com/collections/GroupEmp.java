package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class GroupEmp {

	public static void main(String[] args) {
	  
	  Emp e1=new Emp("IT","Ravi");
	  Emp e2=new Emp("HR","Priya");
	  Emp e3=new Emp("IT","Arun");
	  Emp e4=new Emp("Sales","Kiran");
	  Emp e5=new Emp("HR","Sneha");
	  Emp e6=new Emp("IT","Anil");
	  List<Emp> list=Arrays.asList(e1,e2,e3,e4,e5,e6);
	  for(Emp e:list)
	  {
	  System.out.println(e);
	  }
	  System.out.println("**************************************");
	  Map<String,ArrayList<String>> map=new HashMap<>();
	  for(Emp e:list)
	  {  
		  ArrayList<String> li=new ArrayList<>();
		  String key1=e.getDept();
		  for(Emp em:list)
		  {  
			  String key2=em.getDept();
			  if(key1.equals(key2))
			  {
				  li.add(em.getEname());
			  }
			  
		  }
		  if(!map.containsKey(key1))
		  {
			  map.put(key1,li);
		  }
	  }
	  Set<Entry<String,ArrayList<String>>> entries=map.entrySet();
		for(Entry<String,ArrayList<String>> e:entries)
		{
			System.out.println(e.getKey()+" -->   "+e.getValue());
			
		}
	  
		
	}

}
