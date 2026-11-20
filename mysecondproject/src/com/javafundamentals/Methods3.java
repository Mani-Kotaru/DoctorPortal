package com.javafundamentals;
  import java.util.*;                                 // 10 methods with return type and without arguments
public class Methods3 {

	int getNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id number:");
		int n=sc.nextInt();
				return n;
	}
	String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
				return name;
	}
	float getSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your actual salary:");
		int as=sc.nextInt();
		System.out.println("enter your bonus:");
		int bonus=sc.nextInt();
				return as+bonus;
	}
	float getPercentage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your CGPA:");
		float cgpa=sc.nextFloat();
		float percent=cgpa*9.5f;
				return percent;
	}
	float getGrade()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your percentage:");
		float percent=sc.nextFloat();
				float grade=percent/9.5f;
				return grade;
	}
	float getTemperature()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature at your current location(in °C):");
		float temp=sc.nextFloat();
				return temp;
	}
	String getCity()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your near by city:");
		String city=sc.nextLine();
				return city;
	}
	String getCountry()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your country:");
		String country=sc.nextLine();
				return country;
	}
	float getBalance()
	{    
		float balance=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount deposited :");
		float  deposit=sc.nextFloat();
		  balance=balance+deposit;
		  System.out.println("enter withdrawal amount:");
		  float  withdraw=sc.nextFloat();
		  balance=balance-withdraw;
				return balance;
	}
	
	boolean checkBalance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your current balance :");
		float  current_bal=sc.nextFloat();
		  System.out.println("enter amount to be withdraw:");
		  float  withdraw=sc.nextFloat();
		 if(withdraw>current_bal)
			 return false;
		 else
			 return true;
				
	}

	 void main() {
		 
		int a=getNumber();
		System.out.println("your id no. is:"+a);
		
		String s=getName();
		System.out.println("your name is:"+s);
		
		float f=getSalary();
		System.out.println("your salary is:"+f);
		
		float f1=getPercentage();
		System.out.println("your percentage is:"+f1);
		
		float f2=getGrade();
		System.out.println("your grade is:"+f2);
		
		float f3=getTemperature();
		System.out.println("temperature at your current location is:"+f3+"°C");
		
		String s1=getCity();
		System.out.println("your current city is:"+s1);

		String s2=getCountry();
		System.out.println("your current country is:"+s2);
		
		float f4=getBalance();
		System.out.println("your balance is:"+f4);
		
		boolean b=checkBalance();
		if(b)
			System.out.println("sufficient balance,you can withdraw");
		else
			System.out.println("Insufficient balance,you cannot withdraw this much of amount");

	}

}
