package com.javafundamentals;

public class Wrapper_Caching {
	
	Integer a;

	public static  void main(String[] args) {
		
		Wrapper_Caching w=new Wrapper_Caching();
        
		Integer i1=120;
		Integer i2=120;
		
		Integer i3=160;
		Integer i4=160;
		
		Byte b=100;
		Byte b1=100;
		
		Short s=124;
		Short s1=124;
		
		Long l=126L;
		Long l1=126L;
		
		Character c='!';
		Character c1='!';
		
		Boolean bo=true;
		Boolean bo1=true;
		
	
		Float f=56.98f;
		Float f1=56.98f;
		
		int i=10;
		int j=10;
		
		
		
		//System.out.println(i.equals(j));  equals method cannot be applied on primitive data types
		                                    // == operator is used to check whether the values of two primitive data type variables is same or not
		
		System.out.println(i==j);
		System.out.println(i1==i2);
		System.out.println(i3.equals(i4));//used to check values of objects are same or not
		System.out.println(i3==i4);//used to check addresses of the objects same or not
		System.out.println(f==f1);   // wrapper caching is not available for Float and Double
		System.out.println(f.equals(f1)); 
		
		System.out.println(b==b1);
		System.out.println(s==s1);
		System.out.println(l==l1);
		System.out.println(c==c1);
		System.out.println(bo==bo1);
		
		System.out.println(w);
		System.out.println(w.a);
		
	}

}
