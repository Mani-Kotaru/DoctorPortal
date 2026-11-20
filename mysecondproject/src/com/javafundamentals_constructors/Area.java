package com.javafundamentals_constructors;

public class Area {
	   
	Area(double side)
	{
		System.out.println("area of square:"+(side*side));
	}
	Area(double length,double breadth)
	{
		System.out.println("area of rectangle:"+(length*breadth));
	}
	Area(double base,int height)
	{
		System.out.println("area of triangle:"+(0.5*base*height));
	}
	Area(int base,int height)
	{
		System.out.println("area of parallelogram:"+(base*height));
	}
	Area(float radius)
	{
		System.out.println("area of circle:"+(Math.PI*radius*radius));
	}

	public static void main(String[] args) {
		Area a1=new Area(3.5d);
		Area a2=new Area(3.0d,4.0d);
		Area a3=new Area(5.0d,4);
		Area a4=new Area(3,5);
		Area a5=new Area(5.0f);
		

	}

}
