package com.pocs;
// WAP to demonstrate the application process for an IT role?
import java.util.*;

public class NaukriPortal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Naukri Portal!!");
		System.out.println("enter your age:");
		int age = sc.nextInt();
		sc.nextLine();
		if (age >= 18) {
			System.out.println("okay that's fine");
			System.out.println("enter your qualification (UG or PG):");
			String qualification = sc.nextLine();
			if (qualification.equalsIgnoreCase("UG")) {
				System.out.println("enter your branch:");
				String branch = sc.nextLine();

				if (branch.equalsIgnoreCase("CSE") || branch.equalsIgnoreCase("IT") || branch.equalsIgnoreCase("ECE")) {
					System.out.println("you are eligible for entry-level IT roles!!");
					System.out.println("enter your YOP:");
					int yop = sc.nextInt();
					if (yop == 2026) {
						System.out.println("is there any career gap? if yes please specify duration in years:");
						float gap = sc.nextFloat();
						if (gap <= 2) {
							System.out.println("enter your UG percentage:");
							float up=sc.nextFloat();
							if(up>=80)
							{
							System.out.println("application accepted!!");
							}
							else
							{
								System.out.println("application rejected:UG percentage must be greater than or equal to 80% to eligible for this role");
							}
						} else {
							System.out.println("application rejected:career gap is more than specified");
						}
					} else {
						System.out.println("application rejected:YOP is not eligible");
					}

				} else {
					System.out.println("sorry!! you are not eligible for IT roles, you are eligible for non-IT roles");
				}

			} else {
				System.out.println("You are eligible for senior IT roles,please check job portal again!!");
			}

		} else {
			System.out.println("application rejected : age must be atleast 18");
		}

	}

}
