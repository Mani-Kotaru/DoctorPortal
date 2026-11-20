package com.java8features;

import java.util.function.Predicate;

public class PerfectNumber {

	public static void main(String[] args) {
	
        Predicate<Integer> perfect =(num)->{ int sum=0;
        	                   for(int i=1;i<=num/2;i++)
                           {
        	                       if(num%i==0)
        	                       {
        	            
        	                    	   sum+=i;
        	                       }
                           }
        	                   if(sum==num)
        	                   {
        	                	     return true;
        	                   }
        	                   else
        	                   {
        	                	     return false;
        	                   }
        };
        
       if(perfect.test(28))
       {
    	     System.out.println("it is a perfect number");
       }
       else
       {
       System.out.println("it is not  a perfect number");
       }
	}

}
