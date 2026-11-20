package com.javafundamentals;
 import java.util.Scanner;                             // 15 methods    methods with return type and with arguments
public class Methods4 {
	float findSum(float a,float b,float c)
	{
		float sum=a+b+c;
		return sum;
	}
	float findAvg(float sum,int count)
	{
		float avg=sum/count;
		return avg;
	}
	float findMax(float a,float b)
	{   
		if(a>b)
			return a;
		else
		    return b;
	}
	int findMin(int a,int b)
	{   
		if(a<b)
			return a;
		else
		    return b;
	}
	boolean isEven(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	boolean isOdd(int a)
	{
		if(a%2!=0)
			return true;
		else
			return false;
	}
	boolean isPositive(int a)
	{
		if(a>0)
			return true;
		else
			return false;
	}
	boolean isNegative(int a)
	{
		if(a<0)
			return true;
		else
			return false;
	}
	boolean isZero(int a)
	{
		if(a==0)
			return true;
		else
			return false;
	}
	float calculateArea(float l,float b)
	{
		float area=l*b;
		return area;
	}
	int calculatePerimeter(int a)
	{
		int pm=4*a;
		return pm;
	}
	float calculateVolume(float l,float b,float h)
	{
		float volume=l*b*h;
		return volume;
	}
	float calculateSI(float p,float t,float r )
	{
		float si=(p*t*r)/100;
		return si;
	}
	float percentage(float tm,float om)
	{
		float percent=(om/tm)*100;
		return percent;
	}
	String concatStrings(String s1,String s2,String s3)
	{
		String s=s1+" "+s2+" "+s3;
		return s;
	}

	 void main() {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter 3 numbers:");
		 float f1=sc.nextFloat();
		 float f2=sc.nextFloat();
		 float f3=sc.nextFloat();
		float sum= findSum(f1,f2,f3);
		System.out.println("sum of 3 numbers is:"+sum);
	   	System.out.println("enter count of numbers to find avg:");
	   	int a1=sc.nextInt();
	   	float avg=findAvg(sum,a1);
	   	System.out.println("average of "+a1+"numbers is:"+avg);
	   	float max=findMax(f1,f2);
	   	System.out.println("max of two numbers "+f1+" and "+f2+" is:"+max);
	   	System.out.println("enter 2 numbers to find min of them:");
	   	int a2=sc.nextInt();
	   	int a3=sc.nextInt();
		int min=findMin(a2,a3);
	   	System.out.println("min of two numbers "+a2+" and "+a3+" is:"+min);
	   	boolean b=isEven(a2);
	   	if(b)
	   		System.out.println(a2+" is even");
	   	else
	   		System.out.println(a2+"is not even");
		boolean b1=isOdd(a2);
	   	if(b1)
	   		System.out.println(a2+" is odd");
	   	else
	   		System.out.println(a2+" is not odd");
		boolean b2=isPositive(a2);
	   	if(b2)
	   		System.out.println(a2+" is positive");
	   	else
	   		System.out.println(a2+" is not positive");
		boolean b3=isNegative(a3);
	   	if(b3)
	   		System.out.println(a3+" is negative");
	   	else
	   		System.out.println(a3+" is not negative");
		boolean b4=isZero(a1);
	   	if(b4)
	   		System.out.println(a2+" is zero");
	   	else
	   		System.out.println(a2+" is not zero");
	   	float area=calculateArea(f1,f2);
	   	System.out.println("area of rectangle with sides "+f1+" and "+f2+" is:"+area);
	   	int perimeter=calculatePerimeter(a2);
	   	System.out.println("perimeter of square with side "+a2+" is:"+perimeter);
	   	float volume=calculateVolume(f1,f2,f3);
	   	System.out.println("volume of cuboid with length,width,height of "+f1+","+f2+","+f3+" is:"+volume);
	   	
	   	System.out.println("enter principal,time and rate of interest to find SI:");
	   	float p=sc.nextFloat();
	 	float t=sc.nextFloat();
	 	float r=sc.nextFloat();
	 	float si=calculateSI(p,t,r);
	 	System.out.println("SI is:"+si);
	 	
	 	System.out.println("enter total marks for which the exam is conducted:");
	 	float tm=sc.nextFloat();
	 	System.out.println("enter total marks obtained in the exam:");
	 	float om=sc.nextFloat();
	 	float percent=percentage(tm,om);
	 	System.out.println("percentage of marks obtained is:"+percent+"%");
	 	
	 	System.out.println("enter 3 strings to concatenate them:");
	 	sc.nextLine();
	 	String s1=sc.nextLine();
	 	String s2=sc.nextLine();
	 	String s3=sc.nextLine();
	 	 
	 	String sconcat=concatStrings(s1,s2,s3);
	 	System.out.println("the final string obtained after concatenating the given 3 strings is: "+sconcat);
	 	
	   	
	   	

	}

}
