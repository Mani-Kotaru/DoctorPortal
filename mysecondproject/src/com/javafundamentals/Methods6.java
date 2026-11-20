package com.javafundamentals;

public class Methods6 {
	
	  void add(byte a,byte b)
	  {
		  System.out.println("sum="+(a+b));
	  }
	  
	  void sub(short a,short b)
	  {
		  System.out.println("difference="+(a-b));  
	  }

	public static void main(String[] args) {
		
		Methods6 m=new Methods6();
	//	m.add(10,20);   if we write like this we get error,because 10,20 are integers by default but our add method is expecting values of type byte
	    m.add((byte)10,(byte)20);
	    
	 //   m.sub(10,20);   if we write like this we get error,because 10,20 are integers by default but our sub method is expecting short values of type short
	    
	    m.sub((byte)10,(byte)20);
	    
	}

}
