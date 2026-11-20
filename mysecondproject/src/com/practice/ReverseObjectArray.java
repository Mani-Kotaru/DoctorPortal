package com.practice;

import java.util.Arrays;

public class ReverseObjectArray {

	public static void main(String[] args) {
		Object[] arr= {70,new Object[]{30,40,60},50,new Object[]{20,40,50},60};
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end)
		{
			Object temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
			
		}
		System.out.print("{");
		for(int i=0;i<arr.length;i++)
		{  
			
			if(arr[i] instanceof Object[])
			{ 
			    Object[] inner=(Object[])arr[i];
			    int s=0;
			    int e=inner.length-1;
			    
			    while(s<e)
				{
					Object temp=inner[s];
					inner[s]=inner[e];
					inner[e]=temp;
					
					s++;
					e--;
					
				}
			    System.out.print("{ ");
			    for(Object obj:inner)
			    {
			    	  System.out.print(obj+",");
			    }
			    System.out.print("} ");
			 }
			else
			{
		System.out.print(arr[i]+",");
			}
		}
		
		System.out.print("}");
		
	//	System.out.println(Arrays.deepToString(arr));
	}
	
	
}
