package com.java_case_study;

import java.util.Scanner;

public class LibraryMS {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you have library card?(Yes/No) ");
        String libCard=sc.next();
        if(libCard.equalsIgnoreCase("Yes"))
        {
        	System.out.println("enter number of books borrowed : ");
        	int n=sc.nextInt();
        	if(n>=3)
        	{
        		System.out.println("Borrowing limit reached,You cannot borrow another book!");
        	}
        	else
        	{
        		System.out.println("Book Categories:\n1.Fiction\n2.Science\n3.History");
        		System.out.println("select a book category : ");
        		int bc=sc.nextInt();
        		switch(bc)
        		{
        		case 1:System.out.println("Fiction Book,Borrowing period of this book is 7 days");
        		        break;
        		case 2:System.out.println("Science Book,Borrowing period of this book is 14 days");
		                break;
        		case 3:System.out.println("History Book,Borrowing period of this book is 21 days");
		                break;
		        default:System.out.println("Invalid Category!");
        		}
        		
        	}
        }
        else
        {
        	System.out.println("Library card required to borrow books!");
        }
        
	}

}
