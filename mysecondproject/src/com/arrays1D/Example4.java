package com.arrays1D;

public class Example4 {

	public static void main(String[] args) {
		 int arr[]= {1,5,3,19,18,25};
	     int diff=0;
	     int min=Integer.MAX_VALUE;
	     int value1=0;
	     int value2=0;
	     for(int i=0;i<arr.length;i++)
	     {   
	    	 for(int j=i+1;j<arr.length;j++)
	    	 {
	    		 diff=arr[i]-arr[j];
	    		 if(diff<min)
	    		 {
	    			 min=diff;
	    			 value1=arr[i];
	    			 value2=arr[j];
	    		 }
	    	 }
	      }
	     for(int i=arr.length-1;i>=0;i--)
	     {
	    	 for(int j=arr.length-2;j>=0;j--)
	    	 {
	    		 diff=arr[i]-arr[j];
	    		 if(diff<min)
	    		 {
	    			 min=diff;
	    			 value1=arr[i];
	    			 value2=arr[j];
	    		 }
	    	 }
	     }
	     System.out.println("["+value1+","+value2+"]");
	     System.out.println("minimum difference : "+min);
		}

}
