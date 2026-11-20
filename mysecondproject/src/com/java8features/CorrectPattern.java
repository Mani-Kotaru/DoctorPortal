package com.java8features;

import java.util.Arrays;

public class CorrectPattern {

	public static void main(String[] args) {
      String input="ACEBD534FG12";
      String letters="";
      String digits="";
      
      for(int i=0;i<input.length();i++)
      {     
    	         char ch=input.charAt(i);
    	        if(Character.isLetter(ch))
    	        {
    	        	     letters+=ch;
    	        }
    	        else if(Character.isDigit(ch))
    	        {
    	        	     digits+=ch;
    	        }
      }
      char[] lettersArray=letters.toCharArray();
      char[] digitsArray=digits.toCharArray();
      
      Arrays.sort(lettersArray);
      Arrays.sort(digitsArray);
      
      String s1=new String(lettersArray);
      String s2=new String(digitsArray);
      
      System.out.println("Output : "+s1+s2);
      
}
}
