package com.java_case_study;

import java.util.Scanner;

public class OnlineExamResults {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attemptedQues = 0;
		int correctAnsweredQues = 0;
		System.out.println("enter 1 or 0 or -1: ");
		for (int i = 1; i <= 20; i++) {
			System.out.println("enter your answer for question " + i + " : ");
			int answer = sc.nextInt();
			if (answer == -1) {
				continue;
			} else if (answer == 0) {
				attemptedQues++;
			} else if (answer == 1) {
				correctAnsweredQues++;
				attemptedQues++;
			} else {
				System.out.println("invalid input.Question skipped.");
			}
		}
		System.out.println("Total number of attempted questions : " + attemptedQues);
		int totalMarks = correctAnsweredQues * 1;  
		System.out.println("Total marks scored : " + totalMarks);
		double percentage =  (double)totalMarks / 20 * 100;
		System.out.println("Percentage : " + percentage+"%");

	}

}
