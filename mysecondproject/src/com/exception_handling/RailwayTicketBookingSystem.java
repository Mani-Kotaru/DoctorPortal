package com.exception_handling;

import java.util.Scanner; 

public class RailwayTicketBookingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter passenger name : ");
		String name=sc.nextLine();
		System.out.println("enter age : ");
		int age=sc.nextInt();
		System.out.println("enter no of tickets : ");
		int noOfTickets=sc.nextInt();
		try {
			
		bookTickets(name,age,noOfTickets);
	}
		catch(IllegalArgumentException e)
		{
			System.err.println(e);
		}
		catch(NoSeatsAvailableException e)
		{
			System.err.println(e);
		}
		
      System.out.println("all exceptions are handled successfully and the program continues...");
     
	}
	public static void bookTickets(String name,int age,int noOfTickets) throws NoSeatsAvailableException
	{   
		int availSeats=10;
		
		if(age<=0||age>120)
		{
			throw new IllegalArgumentException("age must be between 1 and 120");
		}
		if(noOfTickets<=0)
		{
			throw new IllegalArgumentException("number of tickets must be greater than 0");
		}
		if(noOfTickets>availSeats)
		{
			throw new NoSeatsAvailableException("only "+availSeats+" seats are available");
		}
		availSeats-=noOfTickets;
		System.out.println("Passenger Name : "+name);
		System.out.println("age : "+age);
		System.out.println("no of tickets booked : "+noOfTickets);
		System.out.println("Remaining seats available : "+availSeats);
		
	}

}
