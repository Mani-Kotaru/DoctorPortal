package com.forloop;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Random rand=new Random();
     int randomInt=rand.nextInt(100,201);// generates random integer in the range 100 to 200
                                         // 100-->inclusive
                                         // 201-->exclusive
    // System.out.println("the actual number is : "+randomInt);
     
     System.out.println("Welcome to the Number Guessing Game!");
     System.out.println("Guess a number between 100 and 200.");
     System.out.println("You have only 3 attempts.");
     boolean status=false;
     for(int i=0;i<3;i++)
     {
    	 System.out.println("Guess the number : ");
    	 int guess=sc.nextInt();
    	 if(guess==randomInt)
    	 {
    		 System.out.println("congrats, you won the game!!");
    		 status=true;
    		 break;
    	 }
    	 else if(guess<randomInt)
    	 {
    		 System.out.println("guessed number is too low,try again!");
    	 }
    	 else
    	 {
    		 System.out.println("guessed number is too high,try again!");
    	 }
     }
     System.out.println();
     if(!status)
     {
    	 System.out.println("you lose the game, better luck next time!!");
    	 System.out.println("the actual number is : "+randomInt);
     }
   
     
	}

}
