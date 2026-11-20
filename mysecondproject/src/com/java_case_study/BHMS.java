package com.java_case_study;

import java.util.Scanner;
import java.util.Stack;



public class BHMS {

	public static void main(String[] args) {
		Stack<String> webpages=new Stack<String>();
		
		while(true)
		{  
			System.out.println("select an option from the below given menu : ");
			System.out.println("1.VisitWebpage\n2.Back\n3.ViewCurrentWebpage\n4.DisplayHistory\n5.Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice : ");
			int choice=sc.nextInt();
			switch(choice)
			{
			  case 1:
				  System.out.println("enter a webpage URL you visited : ");
				  String url=sc.next();
				  webpages.push(url);
				  System.out.println("Visited : "+url);
				   break;
				   
			  case 2:
				 if(webpages.isEmpty())
				 {
					 System.out.println("No browsing history.");
				 }
				 else if(webpages.size()==1)
				 {
					 System.out.println("No previous webpage available.");
				 }
				 else
				 {
					 System.out.println("Back from: " + webpages.pop());
                     System.out.println("Current webpage: "
                             + webpages.peek());
				 }
				   break;
			  case 3:
				  if (webpages.isEmpty()) {
                      System.out.println("No webpage is currently open.");
                  } 
                  else {
                      System.out.println("Current webpage: "
                              + webpages.peek());
                  }
                  break;
			  case 4:
				  if (webpages.isEmpty()) {
                      System.out.println("No browsing history.");
                  } 
                  else {
                      System.out.println("Complete Browsing History : "+webpages);
                  }
                  break;
			  case 5:
				  System.out.println("exit...");
				  return;
				
			  default :
				  System.out.println("Invalid choice!!!");
			}
		}

	}

}
