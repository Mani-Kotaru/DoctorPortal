package com.logicalstatements;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn;
		do {
		System.out.println("Main Menu:\n1.Domestic Animals\n2.Wild Animals");
		System.out.println("enter your option:");
	    int op=sc.nextInt();
	    switch(op)
	    {
	    case 1-> {
	    	do {
	    	System.out.println("Domestic:\n1.cow\n2.dog");
			System.out.println("enter your option:");
		    int op1=sc.nextInt();
		    switch(op1)
		    {
		    case 1->System.out.println("cow");
		    case 2->System.out.println("dog");
		    default->System.out.println("entered option is invalid");
		    }
		    System.out.println("do you want to continue?(yes/no)");
		       yn=sc.next();
	    	}while(yn.equalsIgnoreCase("yes"));
	    	System.out.println("you are exit from inner switch case!!");
	    }
	    case 2->{
	    	do {
	    	System.out.println("Wild:\n1.lion\n2.tiger");
			System.out.println("enter your option:");
		    int op1=sc.nextInt();
		    switch(op1)
		    {
		    case 1->System.out.println("lion");
		    case 2->System.out.println("tiger");
		    default->System.out.println("entered option is invalid");
	       }
		    System.out.println("do you want to continue?(yes/no)");
		       yn=sc.next();
	    	}while(yn.equalsIgnoreCase("yes"));
	    	System.out.println("you are exit from inner switch case!!");
	    }
		default->System.out.println("entered option is invalid");
	    }
	    System.out.println("do you want to continue?(yes/no)");
	       yn=sc.next();
		}while(yn.equalsIgnoreCase("yes"));
		System.out.println("you are exit from outer switch case!!");
	}

}
