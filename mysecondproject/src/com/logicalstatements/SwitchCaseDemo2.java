package com.logicalstatements;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("Select movie category:\n1.G for Ground\n2.P for Premium\n3.V for VIP");
      char mc=sc.next().charAt(0);
      switch(mc)
      {
      case 'G'-> System.out.println("the price of ground ticket is ₹150");
      case 'P'-> System.out.println("the price of premium ticket is ₹250");
      case 'V'-> System.out.println("the price of VIP ticket is ₹400");
      default->System.out.println("entered value is invalid");
      }
	}

}
