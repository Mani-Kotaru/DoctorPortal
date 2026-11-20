package com.oops.inheritance;

import java.util.Scanner;

public class PayRollSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id : ");
		int empId=sc.nextInt();
		sc.nextLine();
		System.out.println("enter employee name : ");
		String empName=sc.nextLine();
		System.out.println("enter employee salary : ");
		double empSal=sc.nextDouble();
		sc.nextLine();
		System.out.println("enter employee Type : ");
		String empType=sc.nextLine();
        if(empType.equalsIgnoreCase("Full time employee"))
        {
		    FullTimeEmployee e1 = new FullTimeEmployee(empId,empName,empSal);
		    System.out.println("Full Time Employee Details : ");
		    e1.display();
        }
        else if(empType.equalsIgnoreCase("Part time employee"))
        {
		    PartTimeEmployee e1 = new PartTimeEmployee(empId,empName,empSal);
		    System.out.println("Part Time Employee Details : ");
		    e1.display();
        }
        else if(empType.equalsIgnoreCase("Contract employee"))
        {
		    ContractEmployee e1 = new ContractEmployee(empId,empName,empSal);
		    System.out.println("Contract Employee Details : ");
		    e1.display();
        }
        

		
	}
}
