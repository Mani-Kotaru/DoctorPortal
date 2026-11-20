package com.stringhandling;

public class FirstRepeatingChar {

	public static void main(String[] args) {
            String s="Banana";
            char ch[]=s.toCharArray();
            for(char e:ch)
            {  int count=0;
            	   for(char e1:ch)
            	   {
            		   if(e==e1)
            		   {
            			   count++;
            		   }
            	   }
            	   if(count>1)
            	   {
            		   System.out.println("First repeating character : "+e+" ("+count+"-times)");
            		   return;
            	   }
            }
            
            System.out.println("no repeating character found!!");
	}

}
