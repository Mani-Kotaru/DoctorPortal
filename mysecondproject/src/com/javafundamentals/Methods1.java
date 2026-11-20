package com.javafundamentals;
 import java.util.Scanner;                                     //20 methods, with arguments and without return type
public class Methods1 {
	
	void getName(String name)
	{
		System.out.println("Name:"+name);
	}
	void getAge(byte age)
	{
		System.out.println("Age:"+age);
	}
	void getGender(char c)
	{
		System.out.println("Gender:"+c);
	}
	void getHeightWeight(float h,float w)
	{
		System.out.println("Height:"+h);
		System.out.println("Weight:"+w);
	}
	void getDOB(int date,String month,int year)
	{
		System.out.println("DOB:"+date+'-'+month+'-'+year);
	}
	void getPOB(String p)
	{
		System.out.println("Place of Birth:"+p);
	}
	void getMobileNo(long l)
	{
		System.out.println("Mobile No:"+l);
	}
	void getParentsDetails(String mother,String father)
	{
		System.out.println("Mother:"+mother);
		System.out.println("Father:"+father);
	}
	void checkSiblingsInfo(boolean b,int n)
	{
		System.out.println("Do you have sibligs?:"+b);
		System.out.println("No. of siblings:"+n);
	}
	void getNativeLocation(String loc)
	{
		System.out.println("Native location:"+loc);
	}
	void getCurrentLocation(String loc)
	{
		System.out.println("Current Location:"+loc);
	}
	void getHighestQualification(String s)
	{
		System.out.println("Highest qualification:"+s);
	}
	void getCollegeName(String c)
	{
		System.out.println("College name:"+c);
	}
	void getBranch(String b)
	{
		System.out.println("Branch:"+b);
	}
	void getCGPA(float f)
	{
		System.out.println("CGPA:"+f);
	}
	void getYop(short y)
	{
		System.out.println("Year of passed out:"+y);
	}
	void getFavouriteColor(String s)
	{
		System.out.println("Favourite color:"+s);
	}
	void getLuckyNumber(byte b)
	{
		System.out.println("Lucky Number:"+b);
	}
	void getFavouriteFood(String s)
	{
		System.out.println("Favourite food:"+s);
	}
	void getFavouritePlace(String s)
	{
		System.out.println("Favourite Place:"+s);
	}
	public static void main(String[] args) {
		
		Methods1 t=new Methods1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String s=sc.nextLine();
		System.out.println("enter your age:");
		byte b=sc.nextByte();
		System.out.println("enter your gender:");
		char c=sc.next().charAt(0);
		System.out.println("enter your height and weight:");
		float h=sc.nextFloat();
		float w=sc.nextFloat();
		System.out.println("enter your DOB");
		System.out.println("enter date:");
		int d=sc.nextInt();
		System.out.println("enter month:");
		String m=sc.next();
		System.out.println("enter year:");
		int y=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your  POB:");
		String p=sc.nextLine();
		System.out.println("enter your mobile no:");
		long l=sc.nextLong();
		sc.nextLine();
		System.out.println("enter your parents details");
		System.out.println("enter mother name:");
		String m1=sc.nextLine();
		System.out.println("enter father name:");
		String f=sc.nextLine();
		System.out.println("enter your siblings info");
		System.out.println("do you have siblings?(true/false):");
		boolean b1=sc.nextBoolean();
		System.out.println("enter no. of siblings you have:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your native location:");
		String nl=sc.nextLine();
		System.out.println("enter your current location:");
		String cl=sc.nextLine();
		System.out.println("enter your highest educational qualification:");
		String q=sc.nextLine();
		System.out.println("enter your college name:");
		String cn=sc.nextLine();
		System.out.println("enter your branch:");
		String br=sc.nextLine();
		System.out.println("enter your CGPA:");
		float f1=sc.nextFloat();
		System.out.println("enter your YOP:");
		short yop=sc.nextShort();
		System.out.println("enter your favourite color:");
		String fav_col=sc.next();
		System.out.println("enter your lucky number:");
		byte luckno=sc.nextByte();
		sc.nextLine();
		System.out.println("enter your favourite food:");
		String fav_food=sc.nextLine();
		System.out.println("enter your favourite place:");
		String fav_place=sc.nextLine();
		t.getName(s);
		t.getAge(b);
		t.getGender(c);
		t.getHeightWeight(h,w);
		t.getDOB(d,m,y);
		t.getPOB(p);
		t.getMobileNo(l);
		t.getParentsDetails(m1,f);
		t.checkSiblingsInfo(b1,n);
		t.getNativeLocation(nl);
		t.getCurrentLocation(cl);
		t.getHighestQualification(q);
		t.getCollegeName(cn);
		t.getBranch(br);
		t.getCGPA(f1);
		t.getYop(yop);
		t.getFavouriteColor(fav_col);
		t.getLuckyNumber(luckno);
		t.getFavouriteFood(fav_food);
		t.getFavouritePlace(fav_place);
		
     
	}

}
